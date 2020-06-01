package org.project2.adapter.controller

import org.project2.usecase.bar.GetBarById
import org.project2.usecase.bar.GetBarList
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(BarController.PREFIX)
internal class BarController(private val getOneBar: GetBarById, private val getAllBar: GetBarList) {

    @GetMapping("/{id}", produces = ["application/json"])
    fun getOneBarEndpoint(@PathVariable id: Int) = BarView.fromUsecaseOutput(getOneBar(id))

    @GetMapping(produces = ["application/json"])
    fun getAllBarEndpoint() = getAllBar().map { BarView.fromUsecaseOutput(it) }

    companion object {
        const val PREFIX = "/v1.0/bars"
    }
}