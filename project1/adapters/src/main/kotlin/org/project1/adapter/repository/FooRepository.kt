package org.project1.adapter.repository

import org.project1.usecase.foo.repository.FooRepository
import org.springframework.stereotype.Repository

@Repository
internal class FooRepository : FooRepository {

    override fun findById(id: Int) = dbFoo[id]?.toEntity()

    override fun findAll() = dbFoo.values.map { it.toEntity() }

    private val dbFoo = mapOf(
        1 to DbFoo(1,"Foo 1"),
        2 to DbFoo(2,"Foo 2"),
        3 to DbFoo(3,"Foo 3")
    )
}