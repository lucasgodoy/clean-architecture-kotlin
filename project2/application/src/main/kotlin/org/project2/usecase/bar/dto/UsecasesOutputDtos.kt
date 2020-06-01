package org.project2.usecase.bar.dto

import org.project2.entity.Bar

data class BarOutput(val name: String) {
    companion object {
        fun fromEntity(bar: Bar) = with(bar) {
            BarOutput(name = name)
        }
    }
}