package org.project2.adapter.controller.dto.mapper

import org.project2.adapter.controller.dto.NewBarRequestBody
import org.project2.usecase.bar.dto.NewBarInput

internal fun NewBarRequestBody.toUseCaseInput() = NewBarInput(code = code, name = name)