package org.project1.usecase.foo.dto.mapper

import org.project1.entity.Foo
import org.project1.usecase.foo.dto.FooOutput

internal fun Foo.toOutput() = FooOutput(code = code, name = name)