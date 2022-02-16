package com.example.recyclerview_exampleone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_exampleone.adapter.UserAdapet
import com.example.recyclerview_exampleone.databinding.ActivityMainBinding
import com.example.recyclerview_exampleone.model.UserModel

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var adapet: UserAdapet
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initial()
    }

    private fun initial() {
        recyclerView = binding.rvUser
        adapet = UserAdapet()
        recyclerView.adapter = adapet
        adapet.setList(myUser())
    }

    fun myUser(): ArrayList<UserModel> {
        val userList = ArrayList<UserModel>()

        val user1 = UserModel("Amazon", "● 6:25pm", "$8.90")
        userList.add(user1)

        val user2 = UserModel("Cash from ATM", "● 5:40pm", "$250.00")
        userList.add(user2)

        val user3 = UserModel("Costa", "● 5:20pm", "$5.50")
        userList.add(user3)

        val user4 = UserModel("Donuts", "● 10:00pm", "$35.00")
        userList.add(user4)

        val user5 = UserModel("Parking", "● 7:40pm", "$15.00")
        userList.add(user5)

        return userList
    }
}