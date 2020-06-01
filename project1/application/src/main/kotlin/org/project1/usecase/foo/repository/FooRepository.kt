package org.project1.usecase.foo.repository

import org.project1.entity.Foo

interface FooRepository {

    fun findById(id: Int): Foo?

    fun findAll(): List<Foo>
}