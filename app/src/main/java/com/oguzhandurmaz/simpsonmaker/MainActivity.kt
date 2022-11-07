package com.oguzhandurmaz.simpsonmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun makeSimpson(view: View){
        val name=nameText.text.toString()
        val age=ageText.text.toString()
        val job=jobText.text.toString()
        //val simpson=Simpson(name, age, job)
        resultText.text="Name : ${name}, Age : ${age}, Job : ${job}"
    }
}