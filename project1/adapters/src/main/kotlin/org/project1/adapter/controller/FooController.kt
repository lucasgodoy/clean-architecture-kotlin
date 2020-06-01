package org.project1.adapter.controller

import org.project1.usecase.foo.GetFooById
import org.project1.usecase.foo.GetFooList
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(FooController.PREFIX)
internal class FooController(private val getOneFoo: GetFooById, private val getAllFoo: GetFooList) {

    @GetMapping("/{id}", produces = ["application/json"])
    fun getOneFooEndpoint(@PathVariable id: Int) = FooView.fromUsecaseOutput(getOneFoo(id))

    @GetMapping(produces = ["application/json"])
    fun getAllFooEndpoint() = getAllFoo().map { FooView.fromUsecaseOutput(it) }

    companion object {
        const val PREFIX = "/v1.0/foos"
    }
}