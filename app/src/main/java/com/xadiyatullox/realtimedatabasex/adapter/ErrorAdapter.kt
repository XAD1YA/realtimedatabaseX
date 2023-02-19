package com.xadiyatullox.realtimedatabasex.adapter

import android.widget.ListAdapter
import androidx.recyclerview.widget.DiffUtil

class ErrorAdapter:ListAdapter<Error,ErrorAdapter.ErrorViewHolder>(DiffCallBack()) {
    lateinit var onClick: (Error) -> Unit

    private class DiffCallBack : DiffUtil.ItemCallback<Error>() {
        override fun areItemsTheSame(oldItem: Error, newItem: Error): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Error, newItem: Error): Boolean {
            return oldItem == newItem
        }
    }

  inner  class ErrorViewHolder(private val binding)


}