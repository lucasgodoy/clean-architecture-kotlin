package org.project1.usecase.foo.repository

import org.project1.entity.Foo

interface FooRepository {

    fun create(foo: Foo): Foo

    fun findById(id: Int): Foo?

    fun findByName(name: String): Foo?

    fun findAll(): List<Foo>

    fun delete(id: Int)
}