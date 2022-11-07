package com.oguzhandurmaz.simpsonmaker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var name=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun makeSimpson(view: View){
        name=nameText.text.toString()
        var age=ageText.text.toString().toIntOrNull()
        if(age==null){
            age=0
        }
        val job=jobText.text.toString()
        val simpson=Simpson(name, age, job)
        resultText.text="Name : ${simpson.name}, Age : ${simpson.age}, Job : ${simpson.job}"
    }

    fun exampleScope(view:View){
        println(name)
    }
}