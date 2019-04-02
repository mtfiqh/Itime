package com.itera.itime

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreenActivity : AppCompatActivity() {
    private var mDelayHandler: Handler? = null
    private var SPLASH_DELAY: Long = 3000

    internal val mRunnable: Runnable = Runnable {
        if(!isFinishing){
            val intent = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        
        mDelayHandler = Handler()

        mDelayHandler!!.postDelayed(mRunnable,SPLASH_DELAY)
    }
}
