package org.project1.adapter.controller

import org.project1.adapter.controller.dto.mapper.toViewModel
import org.project1.usecase.foo.FindFooById
import org.project1.usecase.foo.ListFoo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(FooController.PREFIX)
internal class FooController(private val findOneFoo: FindFooById, private val listAllFoo: ListFoo) {

    @GetMapping("/{id}", produces = ["application/json"])
    fun getOneFooEndpoint(@PathVariable id: Int) = findOneFoo(id).toViewModel()

    @GetMapping(produces = ["application/json"])
    fun getAllFooEndpoint() = listAllFoo().map { it.toViewModel() }

    companion object {
        const val PREFIX = "/v1.0/foos"
    }
}