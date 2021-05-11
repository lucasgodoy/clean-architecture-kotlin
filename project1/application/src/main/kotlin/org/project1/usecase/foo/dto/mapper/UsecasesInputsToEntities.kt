package org.project1.usecase.foo.dto.mapper

import org.project1.entity.Foo
import org.project1.usecase.foo.dto.NewFooInput

internal fun NewFooInput.toEntity() = Foo(id = id, name = name)