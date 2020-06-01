package org.project1.usecase.foo.dto

import org.project1.entity.Foo

data class FooOutput(val name: String) {
    companion object {
        fun fromEntity(foo: Foo) = with(foo) {
            FooOutput(name = name)
        }
    }
}