package com.example.fragmenttransaction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenttransaction.fragment.OneFragment
import com.example.fragmenttransaction.fragment.ThreeFragment
import com.example.fragmenttransaction.fragment.TwoFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnOne.setOnClickListener {
            val oneFragment = OneFragment()
            val transtion = supportFragmentManager.beginTransaction()
            transtion.replace(R.id.fragmentContainer, oneFragment)
            transtion.addToBackStack(null)
            transtion.commit()

        }
        btnTwo.setOnClickListener {
            val twoFragment = TwoFragment()
            val transtion = supportFragmentManager.beginTransaction()
            transtion.replace(R.id.fragmentContainer, twoFragment)
            transtion.addToBackStack(null)
            transtion.commit()

        }
        btnThree.setOnClickListener {
            val threeFragment = ThreeFragment()
            val transtion = supportFragmentManager.beginTransaction()
            transtion.replace(R.id.fragmentContainer, threeFragment)
            transtion.addToBackStack(null)
            transtion.commit()

        }
    }
}