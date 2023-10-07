package com.example.junctionhack

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class loginfrag : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_loginfrag, container, false)
        val loginbtn = view.findViewById<Button>(R.id.loginbtn)
        val gotologin = view.findViewById<Button>(R.id.gotosigninbtn)

        loginbtn.setOnClickListener {
            val intent = Intent(requireActivity(), MainActivity::class.java)
            startActivity(intent)
        }
        gotologin.setOnClickListener {
            replaceFragment(signupfrag())
        }







        return view
    }
    private fun replaceFragment (fragment: Fragment){
        requireActivity().supportFragmentManager.beginTransaction().replace(R.id.myFrameLAyout , fragment).commit()
    }
}