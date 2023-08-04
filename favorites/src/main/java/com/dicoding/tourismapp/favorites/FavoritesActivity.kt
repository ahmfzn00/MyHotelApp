package com.dicoding.tourismapp.favorites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.tourismapp.detail.DetailTourismActivity
import com.dicoding.tourismapp.favorites.databinding.ActivityFavoritesBinding
import com.dicoding.tourismapp.ui.TourismAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.loadKoinModules

class FavoritesActivity : AppCompatActivity() {

    private val favoritesViewModel: FavoritesViewModel by viewModel()
    private lateinit var binding: ActivityFavoritesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoritesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadKoinModules(favoritesModule)

        val tourismAdapter = TourismAdapter()
        tourismAdapter.onItemClick = { selectedData ->
            val intent = Intent(this, DetailTourismActivity::class.java)
            intent.putExtra(DetailTourismActivity.EXTRA_DATA, selectedData)
            startActivity(intent)
        }


        favoritesViewModel.favoriteTourism.observe(this, { dataTourism ->
            tourismAdapter.setData(dataTourism)
            
        })

        with(binding.rvTourism) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = tourismAdapter
        }


    }
}