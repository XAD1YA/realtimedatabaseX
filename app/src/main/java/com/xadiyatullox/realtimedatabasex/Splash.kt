package com.xadiyatullox.realtimedatabasex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
//        window.statusBarColor = Color.parseColor("#FFFFFFFF") // to change status bar color
        supportActionBar?.hide()
        WindowInsetsControllerCompat(window, window.decorView)
            .hide(WindowInsetsCompat.Type.statusBars()) // hide status bar


        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, FragmentConActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) //Simple handler
    }
}