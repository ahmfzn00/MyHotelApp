package com.dicoding.tourismapp.detail

import androidx.lifecycle.ViewModel
import com.dicoding.core.domain.model.Tourism
import com.dicoding.core.domain.usecase.TourismUseCase

class DetailTourismViewModel(private val tourismUseCase: com.dicoding.core.domain.usecase.TourismUseCase) : ViewModel() {
    fun setFavoriteTourism(tourism: com.dicoding.core.domain.model.Tourism, newStatus:Boolean) =
        tourismUseCase.setFavoriteTourism(tourism, newStatus)
}

