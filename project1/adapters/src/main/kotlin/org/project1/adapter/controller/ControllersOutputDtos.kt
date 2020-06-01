package org.project1.adapter.controller

import org.project1.usecase.foo.dto.FooOutput

internal data class FooView(val name: String) {
    companion object {
        fun fromUsecaseOutput(fooOutput: FooOutput) = with(fooOutput) {
            FooView(name = name)
        }
    }
}