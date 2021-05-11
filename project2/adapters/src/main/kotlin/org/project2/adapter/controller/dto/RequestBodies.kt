package org.project2.adapter.controller.dto

import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

internal data class NewBarRequestBody(@Min(1) @NotNull val code: Int, @NotBlank val name: String)