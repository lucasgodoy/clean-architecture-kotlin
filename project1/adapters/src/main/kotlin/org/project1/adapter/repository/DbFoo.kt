package org.project1.adapter.repository

import org.project1.entity.Foo

internal data class DbFoo(val id: Int, val name: String) {
    fun toEntity() = Foo(id = id, name = name)
}