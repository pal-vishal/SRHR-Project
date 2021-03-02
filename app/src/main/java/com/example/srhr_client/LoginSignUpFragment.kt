package com.example.srhr_client

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.srhr_client.databinding.FragmentLoginSignupBinding
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class LoginSignUpFragment : Fragment(R.layout.fragment_login_signup) {

    private lateinit var binding: FragmentLoginSignupBinding
    private lateinit var auth: FirebaseAuth
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_login_signup, container, false)
        auth = Firebase.auth
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        val currentUser = auth.currentUser
        if (currentUser != null) {
            findNavController().navigate(R.id.action_loginSignUpFragment_to_personalInfoFragment)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_loginSignUpFragment_to_personalInfoFragment)
        }
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_loginSignUpFragment_to_personalInfoFragment)
            /*
            auth.signInWithEmailAndPassword(
                binding.textEmail.text.toString(),
                binding.editPassword.text.toString()
            )
                .addOnCompleteListener { task: Task<AuthResult> ->
                    if (task.isSuccessful) {

                    } else {
                        Log.e("LoginSignUp", "signInWithEmail:failure", task.exception)
                        Toast.makeText(
                            context, "Authentication failed.",
                            Toast.LENGTH_SHORT
                        ).show()

                    }
                }

            if (binding.editTextMobile.text.toString()!=null){
             //  val action = LoginSignUpFragmentDirections.actionLoginSignUpFragmentToPersonalInfoFragment(binding.editTextMobile.text.toString())
             //   findNavController().navigate(action)
            }

             */



        }
    }
}