package org.project1.adapter.controller

import org.project1.adapter.controller.dto.FooViewModel
import org.project1.adapter.controller.dto.NewFooRequestBody
import org.project1.adapter.controller.dto.mapper.toUseCaseInput
import org.project1.adapter.controller.dto.mapper.toViewModel
import org.project1.usecase.foo.CreateNewFoo
import org.project1.usecase.foo.FindFooByCode
import org.project1.usecase.foo.ListFoo
import org.springframework.http.HttpStatus
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.support.ServletUriComponentsBuilder
import javax.servlet.http.HttpServletResponse
import javax.validation.Valid

@RestController
@RequestMapping(FooController.PREFIX)
@Validated
internal class FooController(
    private val createNewFoo: CreateNewFoo,
    private val findOneFoo: FindFooByCode,
    private val listAllFoo: ListFoo
) {

    @PostMapping(consumes = ["application/json"], produces = ["application/json"])
    @ResponseStatus(HttpStatus.CREATED)
    fun createNewFooEndpoint(
        @Valid @RequestBody newFooRequestBody: NewFooRequestBody,
        response: HttpServletResponse
    ): FooViewModel {
        val newFoo = createNewFoo(newFooRequestBody.toUseCaseInput())
        val resourceUri =
            ServletUriComponentsBuilder.fromCurrentContextPath().path("$PREFIX/${newFoo.code}").toUriString()
        response.setHeader("Location", resourceUri)
        return newFoo.toViewModel()
    }

    @GetMapping("/{id}", produces = ["application/json"])
    fun getOneFooEndpoint(@PathVariable id: Int) = findOneFoo(id).toViewModel()

    @GetMapping(produces = ["application/json"])
    fun getAllFooEndpoint() = listAllFoo().map { it.toViewModel() }

    companion object {
        const val PREFIX = "/v1.0/foos"
    }
}