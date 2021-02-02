package com.example.starwarsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView

class SplashScreen : AppCompatActivity() {

    // This is the loading time of the splash screen
    private val SPLASH_TIME_OUT:Long = 3000 // 1 sec

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        // perform animation for two images
        val logo_starwars: ImageView = findViewById(R.id.logo_starwars)
        val logo_thinkit: ImageView = findViewById(R.id.logo_thinkit)
        val slideAnimation = AnimationUtils.loadAnimation(this, R.anim.side_slide)
        logo_starwars.startAnimation(slideAnimation)
        logo_thinkit.startAnimation(slideAnimation)

        // Use the postDelayed(Runnable, time) method to send a message with a delayed time.
        Handler().postDelayed({
            val intent = Intent(this, PeopleActivity::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT)
    }
}