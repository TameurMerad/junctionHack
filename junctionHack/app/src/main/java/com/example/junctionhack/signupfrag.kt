package com.example.junctionhack

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


class signupfrag : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_signupfrag, container, false)
        val name = view.findViewById<EditText>(R.id.nameSignInET)
        val btnregister = view.findViewById<Button>(R.id.loginOnboardingBtn)
        val btngotologin = view.findViewById<Button>(R.id.gotologin)



        btnregister.setOnClickListener {
            val intent = Intent(requireActivity(), MainActivity::class.java)
            startActivity(intent)
        }
        btngotologin.setOnClickListener {
            replaceFragment(loginfrag())
        }



        return  view
    }
    private fun replaceFragment (fragment: Fragment){
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.myFrameLAyout , fragment).commit()
    }
}
