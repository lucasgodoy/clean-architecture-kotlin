package org.project1.adapter.repository.mapper

import org.project1.adapter.repository.schema.DbFoo
import org.project1.entity.Foo

internal fun Foo.toDbSchema() = DbFoo(code = code, name = name)