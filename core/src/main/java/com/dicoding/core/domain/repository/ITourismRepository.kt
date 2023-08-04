package com.dicoding.core.domain.repository

import androidx.lifecycle.LiveData
import com.dicoding.core.data.Resource
import com.dicoding.core.domain.model.Tourism
import kotlinx.coroutines.flow.Flow

interface ITourismRepository {

    fun getAllTourism(): Flow<Resource<List<Tourism>>>

    fun getFavoriteTourism(): Flow<List<Tourism>>

    fun setFavoriteTourism(tourism: Tourism, state: Boolean)

}
