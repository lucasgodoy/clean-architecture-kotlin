package org.project1.adapter.repository

import org.project1.adapter.repository.mapper.toDbSchema
import org.project1.adapter.repository.mapper.toEntity
import org.project1.adapter.repository.schema.DbFoo
import org.project1.entity.Foo
import org.project1.usecase.foo.repository.FooRepository
import org.springframework.stereotype.Repository

@Repository
internal class FooRepository : FooRepository {

    override fun create(foo: Foo): Foo {
        val dbObject = foo.toDbSchema()
        dbFoo[foo.code] = dbObject
        return dbObject.toEntity()
    }

    override fun findByCode(code: Int) = dbFoo[code]?.toEntity()

    override fun findByName(name: String): Foo? {
        TODO("Not yet implemented")
    }

    override fun findAll() = dbFoo.values.map { it.toEntity() }

    override fun delete(code: Int) {
        dbFoo.remove(code)
    }

    private val dbFoo = mutableMapOf(
        1 to DbFoo(1,"Foo 1"),
        2 to DbFoo(2,"Foo 2"),
        3 to DbFoo(3,"Foo 3")
    )
}