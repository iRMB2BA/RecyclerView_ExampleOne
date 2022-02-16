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

        val user1 = UserModel("Petrov", "Dima")
        userList.add(user1)

        val user2 = UserModel("Sidorov", "Oleg")
        userList.add(user2)

        val user3 = UserModel("Smirnov", "Andrei")
        userList.add(user3)

        val user4 = UserModel("Ivanov", "Sasha")
        userList.add(user4)

        val user5 = UserModel("Vasechkin", "Kolya")
        userList.add(user5)

        val user6 = UserModel("Vasechkin", "Kolya")
        userList.add(user6)

        val user7 = UserModel("Vasechkin", "Kolya")
        userList.add(user7)

        val user8 = UserModel("Vasechkin", "Kolya")
        userList.add(user8)

        val user9 = UserModel("Vasechkin", "Kolya")
        userList.add(user9)

        val user10 = UserModel("Vasechkin", "Kolya")
        userList.add(user10)

        val user11 = UserModel("Vasechkin", "Kolya")
        userList.add(user11)

        val user12 = UserModel("Vasechkin", "Kolya")
        userList.add(user12)

        val user13 = UserModel("Vasechkin", "Kolya")
        userList.add(user13)


        return userList
    }
}