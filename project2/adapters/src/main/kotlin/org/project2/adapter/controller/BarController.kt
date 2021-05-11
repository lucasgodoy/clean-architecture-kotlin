package org.project2.adapter.controller

import org.project2.adapter.controller.dto.BarViewModel
import org.project2.adapter.controller.dto.NewBarRequestBody
import org.project2.adapter.controller.dto.mapper.toUseCaseInput
import org.project2.adapter.controller.dto.mapper.toViewModel
import org.project2.usecase.bar.CreateNewBar
import org.project2.usecase.bar.FindBarByCode
import org.project2.usecase.bar.ListBar
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import javax.servlet.http.HttpServletResponse
import javax.validation.Valid

@RestController
@RequestMapping(BarController.PREFIX)
@Validated
internal class BarController(
    private val createNewBar: CreateNewBar,
    private val findOneBar: FindBarByCode,
    private val listAllBar: ListBar
) {

    @PostMapping(consumes = ["application/json"], produces = ["application/json"])
    @ResponseStatus(HttpStatus.CREATED)
    fun createNewBarEndpoint(
        @Valid @RequestBody newBarRequestBody: NewBarRequestBody,
        response: HttpServletResponse
    ): BarViewModel {
        val newBar = createNewBar(newBarRequestBody.toUseCaseInput())
        val resourceUri =
            ServletUriComponentsBuilder.fromCurrentContextPath().path("$PREFIX/${newBar.code}").toUriString()
        response.setHeader("Location", resourceUri)
        return newBar.toViewModel()
    }

    @GetMapping("/{code}", produces = ["application/json"])
    fun getOneBarEndpoint(@PathVariable code: Int) = findOneBar(code).toViewModel()

    @GetMapping(produces = ["application/json"])
    fun getAllBarEndpoint() = listAllBar().map { it.toViewModel() }

    companion object {
        const val PREFIX = "/v1.0/bars"
    }
}