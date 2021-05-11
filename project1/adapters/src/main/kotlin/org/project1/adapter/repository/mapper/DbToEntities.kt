package org.project1.adapter.repository.mapper

import org.project1.adapter.repository.DbFoo
import org.project1.entity.Foo

internal fun DbFoo.toEntity() = Foo(id = id, name = name)