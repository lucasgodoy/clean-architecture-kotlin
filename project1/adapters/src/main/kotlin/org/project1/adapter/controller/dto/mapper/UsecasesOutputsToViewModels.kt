package org.project1.adapter.controller.dto.mapper

import org.project1.adapter.controller.dto.FooViewModel
import org.project1.usecase.foo.dto.FooOutput

internal fun FooOutput.toViewModel() = FooViewModel(id = id, name = name)