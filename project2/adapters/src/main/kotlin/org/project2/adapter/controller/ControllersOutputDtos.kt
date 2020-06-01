package org.project2.adapter.controller

import org.project2.usecase.bar.dto.BarOutput

internal data class BarView(val name: String) {
    companion object {
        fun fromUsecaseOutput(barOutput: BarOutput) = with(barOutput) {
            BarView(name = name)
        }
    }
}