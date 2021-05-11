package org.project1.adapter.controller.dto.mapper

import org.project1.adapter.controller.dto.NewFooRequestBody
import org.project1.usecase.foo.dto.NewFooInput

internal fun NewFooRequestBody.toUseCaseInput() = NewFooInput(code = code, name = name)