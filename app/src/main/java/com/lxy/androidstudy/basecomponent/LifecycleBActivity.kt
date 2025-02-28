package com.lxy.androidstudy.basecomponent

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import com.lxy.androidstudy.databinding.ActivityLifecycleBinding

/**
 * @author：liuxy
 * @date：2025/2/27 14:50
 * @desc：
 **/
class LifecycleBActivity : ComponentActivity() {


    private val binding : ActivityLifecycleBinding by lazy {
        ActivityLifecycleBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btn.text = "back"
        binding.btn.setOnClickListener {
            startActivity(Intent(this, LifecycleActivity::class.java))
        }
        Log.d(TAG, "onCreate: LifecycleBActivity")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: LifecycleBActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: LifecycleBActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: LifecycleBActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: LifecycleBActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: LifecycleBActivity")
    }

}