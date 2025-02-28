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
class LifecycleActivity : ComponentActivity() {

    private val binding : ActivityLifecycleBinding by lazy {
        ActivityLifecycleBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btn.setOnClickListener {
            startActivity(Intent(this, LifecycleBActivity::class.java))
        }
        Log.d(TAG, "onCreate: LifecycleActivity")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: LifecycleActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: LifecycleActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: LifecycleActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: LifecycleActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: LifecycleActivity")
    }

}