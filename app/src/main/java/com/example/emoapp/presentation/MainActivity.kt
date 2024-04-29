package com.example.emoapp.presentation

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.emoapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel : MainActivityViewModel by viewModels()

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private var adapter: LevelAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.uiState.onEach(::render).launchIn(lifecycleScope)
        viewModel.singleEvent.onEach(::takeSingleEvent).launchIn(lifecycleScope)

        binding.recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        adapter = LevelAdapter(listOf())
        binding.recyclerView.adapter = adapter

        viewModel.getLevels()
    }

    private fun render(uiState: UiState){
        adapter?.levelList = uiState.levelList
        adapter?.notifyDataSetChanged()
    }

    private fun takeSingleEvent(singleEvent: SingleEvent){
        when(singleEvent) {
            is SingleEvent.Success -> {

            }
            is SingleEvent.Error -> {
                Toast.makeText(this,singleEvent.exception.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }

}

