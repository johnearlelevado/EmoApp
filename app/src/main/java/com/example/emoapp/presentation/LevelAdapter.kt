package com.example.emoapp.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import com.example.emoapp.R
import com.example.emoapp.data.models.Level
import com.example.emoapp.databinding.LayoutItemActivityBinding
import com.example.emoapp.databinding.LayoutItemBinding

class LevelAdapter(val _levelList: List<Level>) : RecyclerView.Adapter<LevelAdapter.LevelViewHolder>() {

  var levelList: List<Level> = _levelList

  class LevelViewHolder(private val binding: LayoutItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(level: Level) {
      binding.tvLevel.text = "LEVEL ${level.level}"
      binding.tvActivityName.text = level.title
      binding.tvActivityDetails.text = level.description

      binding.flexboxLayout.removeAllViews()
      level.activities.forEach { activity ->
        val activityBinding: LayoutItemActivityBinding = LayoutItemActivityBinding
          .inflate(LayoutInflater.from(binding.root.context))
        activityBinding.tvActivity.text = activity.title
        activityBinding.root.setOnClickListener {
          val alertDialogBuilder = AlertDialog.Builder(binding.root.context)

          // Set the title and message for the dialog
          alertDialogBuilder.setTitle(activity.title)
          alertDialogBuilder.setMessage(activity.description)

          // Set the positive button and its click listener
          alertDialogBuilder.setPositiveButton("OK") { dialog, which ->
            // Do something when the user clicks the OK button
            dialog.dismiss() // Close the dialog
          }

          // Create and show the alert dialog
          val alertDialog = alertDialogBuilder.create()
          alertDialog.show()
        }
        binding.flexboxLayout.addView(activityBinding.root)
      }

    }
  }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LevelViewHolder {
    val binding = LayoutItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    return LevelViewHolder(binding)
  }

  override fun onBindViewHolder(holder: LevelViewHolder, position: Int) {
    val level = levelList[position]
    holder.bind(level)
  }

  override fun getItemCount() = levelList.size
}