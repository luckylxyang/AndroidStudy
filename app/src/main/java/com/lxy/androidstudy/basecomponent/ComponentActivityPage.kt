package com.lxy.androidstudy.basecomponent

import android.content.Intent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

/**
 * @author：liuxy
 * @date：2025/2/27 14:44
 * @desc：
 **/
const val TAG = "LifecycleActivity"

@Composable
fun ComponentScreenPage(
    modifier: Modifier = Modifier
){

    val context = LocalContext.current
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            context.startActivity(Intent(context, LifecycleActivity::class.java))
        }) {
            Text("Activity")
        }
        Button(onClick = {

        }) {
            Text("Service")
        }
        Button(onClick = {

        }) {
            Text("Broadcast")
        }
        Button(onClick = {

        }) {
            Text("Content Provider")
        }
    }
}