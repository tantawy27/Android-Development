package com.example.multiui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.multiui.MainActivity.Constant.extraName
import com.example.multiui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(MainActivity.TAG,"on Create")
        binding=ActivityMainBinding.inflate(layoutInflater)  // access all objects in layout.xml
        setContentView(binding.root)

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


    private fun  addcallbacks() {
        binding.Button.setOnClickListener{
            val intent=Intent(this,MainActivity2::class.java)  //used to go to another activity
            val name=binding.textName.text.toString()
            intent.putExtra(extraName, name)
            startActivity(intent)
        }
    }
    companion object{
        const val TAG="TAG1_ACTIVITY"
    }

    object Constant{
        val extraName="extraName"
    }
}