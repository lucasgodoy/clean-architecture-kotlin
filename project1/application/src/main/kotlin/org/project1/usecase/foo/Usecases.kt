package org.project1.usecase.foo

import org.project1.usecase.foo.dto.FooOutput

interface GetFooById {
    operator fun invoke(id: Int): FooOutput
}

interface GetFooList {
    operator fun invoke(): List<FooOutput>
}