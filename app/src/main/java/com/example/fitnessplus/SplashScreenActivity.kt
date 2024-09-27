package com.example.fitnessplus

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.fitnessplus.activity.LoginActivity
import com.example.fitnessplus.global.DB
import com.example.fitnessplus.manager.SessionManager

class SplashScreen : AppCompatActivity() {
    private var mOelayHandler : Handler?=null
    private val splash_delay : Long = 3000 //3sec.
    var db:DB?=null
    var session:SessionManager?=null
    //private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    //    binding = ActivityMainBinding.inflate(LayoutInflater)
    //    setContentView(binding.root)

        db = DB(this)
        session = SessionManager(this)

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

    private fun insertAdminData(){
        try{

            val sqlQuery = "INSERT OR REPLACE INTO ADMIN(ID.)"
        }catch (e:Exception){
            e.printStackTrace()
        }
    }


    }
