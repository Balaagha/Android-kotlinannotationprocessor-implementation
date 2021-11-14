package com.example.annotaionprocessorimplementationexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.annotation.GreetingGenerator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @GreetingGenerator
    class Santa

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvGreeting.text = Generated_Santa().greeting()
    }
}