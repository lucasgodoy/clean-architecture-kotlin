package org.project2.usecase.bar

import org.project2.usecase.bar.dto.BarOutput
import org.project2.usecase.bar.dto.NewBarInput

interface CreateBar {
    operator fun invoke(newBarInput: NewBarInput): BarOutput
}

interface FindBarByCode {
    operator fun invoke(code: Int): BarOutput
}

interface ListBar {
    operator fun invoke(): List<BarOutput>
}

interface DeleteBar {
    operator fun invoke(code: Int)
}