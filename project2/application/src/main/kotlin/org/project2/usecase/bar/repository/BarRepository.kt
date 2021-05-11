package org.project2.usecase.bar.repository

import org.project2.entity.Bar

interface BarRepository {

    fun create(bar: Bar): Bar

    fun findByCode(code: Int): Bar?

    fun findByName(name: String): Bar?

    fun findAll(): List<Bar>

    fun delete(code: Int)
}