package org.project2.adapter.repository.mapper

import org.project2.adapter.repository.schema.DbBar
import org.project2.entity.Bar

internal fun Bar.toDbSchema() = DbBar(code = code, name = name)