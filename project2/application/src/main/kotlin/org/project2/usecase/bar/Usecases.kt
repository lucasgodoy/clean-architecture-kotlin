package org.project2.usecase.bar

import org.project2.usecase.bar.dto.BarOutput

interface GetBarById {
    operator fun invoke(id: Int): BarOutput
}

interface GetBarList {
    operator fun invoke(): List<BarOutput>
}