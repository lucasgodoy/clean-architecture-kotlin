package org.project2.usecase.bar.dto.mapper

import org.project2.entity.Bar
import org.project2.usecase.bar.dto.NewBarInput

internal fun NewBarInput.toEntity() = Bar(code = code, name = name)