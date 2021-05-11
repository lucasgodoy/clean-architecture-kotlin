package org.project2.usecase.bar.dto.mapper

import org.project2.entity.Bar
import org.project2.usecase.bar.dto.BarOutput

internal fun Bar.toOutput() = BarOutput(code = code, name = name)