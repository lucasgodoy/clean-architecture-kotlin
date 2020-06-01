package org.project2.adapter.repository

import org.project2.entity.Bar

internal data class DbBar(val id: Int, val name: String) {
    fun toEntity() = Bar(id = id, name = name)
}