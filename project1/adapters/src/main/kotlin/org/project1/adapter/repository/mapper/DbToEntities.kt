package org.project1.adapter.repository.mapper

import org.project1.adapter.repository.schema.DbFoo
import org.project1.entity.Foo

internal fun DbFoo.toEntity() = Foo(code = id, name = name)