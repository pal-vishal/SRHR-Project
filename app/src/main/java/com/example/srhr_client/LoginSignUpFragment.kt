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
import kotlinx.android.synthetic.main.fragment_login_signup.*

class LoginSignUpFragment : Fragment(R.layout.fragment_login_signup) {

    private lateinit var binding: FragmentLoginSignupBinding
    private lateinit var auth: FirebaseAuth
    private lateinit var email: String
    private lateinit var password: String
    private lateinit var mobile: String
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

        email = textEmail.text.toString()
        password = editPassword.text.toString()
        mobile = editTextMobile.text.toString()
        Log.e("strings", "null" + email + password + mobile)
        binding.button2.setOnClickListener {
            auth.createUserWithEmailAndPassword(
                binding.textEmail.text.toString(),
                binding.editPassword.text.toString()
            )
                .addOnCompleteListener { task: Task<AuthResult> ->
                    if (task.isSuccessful) {
                        findNavController().navigate(R.id.action_loginSignUpFragment_to_personalInfoFragment)

                    } else {
                        Log.e("LoginSignUp", "signInWithEmail:failure", task.exception)
                        Toast.makeText(
                            context, "Authentication failed.",
                            Toast.LENGTH_SHORT
                        ).show()

                    }
                }

        }
        binding.button.setOnClickListener {


            if (!textEmail.text.toString().isNullOrEmpty() && !editPassword.text.toString().isNullOrEmpty()) {
                auth.signInWithEmailAndPassword(
                    binding.textEmail.text.toString(),
                    binding.editPassword.text.toString()
                )
                    .addOnCompleteListener { task: Task<AuthResult> ->
                        if (task.isSuccessful) {
                            findNavController().navigate(R.id.action_loginSignUpFragment_to_personalInfoFragment)
                        } else {
                            Log.e("LoginSignUp", "signInWithEmail:failure", task.exception)
                            Toast.makeText(
                                context, "Authentication failed.",
                                Toast.LENGTH_SHORT
                            ).show()

                        }
                    }
            }else if(!editTextMobile.text.toString().isNullOrEmpty()) {
                val action =
                    LoginSignUpFragmentDirections.actionLoginSignUpFragmentToOtpFragment(binding.editTextMobile.text.toString())
                findNavController().navigate(action)
            }

        }
    }
}
