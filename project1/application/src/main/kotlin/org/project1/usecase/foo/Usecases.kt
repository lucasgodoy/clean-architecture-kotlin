package org.project1.usecase.foo

import org.project1.usecase.foo.dto.FooOutput
import org.project1.usecase.foo.dto.NewFooInput

interface CreateFoo {
    operator fun invoke(newFooInput: NewFooInput): FooOutput
}

interface FindFooById {
    operator fun invoke(id: Int): FooOutput
}

interface ListFoo {
    operator fun invoke(): List<FooOutput>
}

interface DeleteFoo {
    operator fun invoke(id: Int)
}