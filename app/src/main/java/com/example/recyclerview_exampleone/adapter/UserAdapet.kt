package com.example.recyclerview_exampleone.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_exampleone.R
import com.example.recyclerview_exampleone.model.UserModel
import kotlinx.android.synthetic.main.item_user_layout.view.*

class UserAdapet: RecyclerView.Adapter<UserAdapet.UserViewHolder>() {

    private var userList = emptyList<UserModel>()

    class UserViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserAdapet.UserViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_user_layout, parent, false)
        return UserViewHolder(view)
    }

    override fun onBindViewHolder(holder: UserAdapet.UserViewHolder, position: Int) {
        holder.itemView.tv_name.text = userList[position].nameOperation
        holder.itemView.tv_time.text = userList[position].timeOperation
        holder.itemView.tv_amount.text = userList[position].amount
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<UserModel>) {
        userList = list
        notifyDataSetChanged()
    }
}