package com.example.junctionhack
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btm = findViewById<BottomNavigationView>(R.id.btm)
        replaceFragment(coursesFragment())
        btm.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.miCourses -> replaceFragment(coursesFragment())
                R.id.miLeader -> replaceFragment(rankFragment())
                R.id.miUser -> replaceFragment(profileFragment())
                else -> {}
            }
            true
        }
    }
    private fun replaceFragment (fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.flfrags , fragment).commit()
    }
}