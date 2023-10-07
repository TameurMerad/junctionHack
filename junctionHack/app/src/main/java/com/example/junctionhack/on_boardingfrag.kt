package com.example.junctionhack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class on_boardingfrag : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_on_boardingfrag, container, false)

        val login = view.findViewById<Button>(R.id.loginOnboardingBtn)
        val register = view.findViewById<Button>(R.id.appCompatButton)

        login.setOnClickListener {
            replaceFragment(loginfrag())
        }
        register.setOnClickListener {
            replaceFragment(signupfrag())
        }




        return view
    }

    private fun replaceFragment (fragment: Fragment){
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.myFrameLAyout , fragment).commit()
    }
}