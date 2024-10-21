package com.example.multiui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.multiui.databinding.ActivityMain2Binding
import com.example.multiui.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG,"on Create")
        binding=ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val name=intent.getStringExtra(MainActivity.Constant.extraName)
        binding.textData.text=name
        addcallbacks()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"on Start")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"on Pause")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"on Resume")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"on Stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"on Restart")
    }


    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"on Destroy")
    }


    companion object{
        const val TAG="TAG2_ACTIVITY"
    }
private fun addcallbacks(){
    binding.btnClose.setOnClickListener{
        finish()
    }
}
}