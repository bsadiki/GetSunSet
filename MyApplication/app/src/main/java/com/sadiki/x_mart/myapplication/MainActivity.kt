package com.sadiki.x_mart.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun trouverAge(view : View){
        var DateDeNaissance=TextDate.text.toString()
        var Age=Calendar.getInstance().get(Calendar.YEAR)-DateDeNaissance.toInt()
        if(Age<0)
            Toast.makeText(this,"date de naissance invalide",Toast.LENGTH_LONG).show()
        else Toast.makeText(this,"ton age est de "+Age,Toast.LENGTH_LONG).show()

    }
}
