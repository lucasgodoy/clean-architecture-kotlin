package org.project2.usecase.bar.repository

import org.project2.entity.Bar

interface BarRepository {

    fun findById(id: Int): Bar?

    fun findAll(): List<Bar>
}