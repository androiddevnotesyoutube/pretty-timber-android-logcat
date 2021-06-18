package com.androiddevnotes.prettytimberandroidlogcat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.d("onCreate: Inside!")

        lifecycleScope.launch(Dispatchers.IO) {
            Timber.d("onCreate: Inside launch IO! ")
        }

        thread {
            Timber.d("onCreate: Inside thread!")
        }
    }
}