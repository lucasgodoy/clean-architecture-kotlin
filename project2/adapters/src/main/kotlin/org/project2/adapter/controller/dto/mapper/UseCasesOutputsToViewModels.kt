package org.project2.adapter.controller.dto.mapper

import org.project2.adapter.controller.dto.BarViewModel
import org.project2.usecase.bar.dto.BarOutput

internal fun BarOutput.toViewModel() = BarViewModel(code = code, name = name)