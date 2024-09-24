package com.example.fitnessplus

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fitnessplus.activity.LoginActivity

class SplashScreen : AppCompatActivity() {
    private var mOelayHandler : Handler?=null
    private val splash_delay : Long = 3000 //3sec.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        mOelayHandler = Handler()
        mOelayHandler?.postDelayed(mRunnable,splash_delay)

        //ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            //val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            //v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            //insets
        }

    private val mRunnable : Runnable = Runnable {

        val intent = Intent(this,LoginActivity::class.java)
        startActivity(intent)
        finish()
    }


    }
