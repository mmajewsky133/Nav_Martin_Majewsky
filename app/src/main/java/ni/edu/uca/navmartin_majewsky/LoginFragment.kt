package ni.edu.uca.navmartin_majewsky

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import ni.edu.uca.navmartin_majewsky.databinding.FragmentLoginBinding

/**
 * A simple [Fragment] subclass.
 * Use the [LoginFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)

        return binding.root
    }

    fun verifPw(pw: String):Boolean{
        if (pw.equals("Somos UCA")){
            return true
        }
        return false
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnLogin.setOnClickListener(){
            val pw = binding.etLogin.text.toString()
            if (verifPw(pw)){
                it.findNavController().navigate(R.id.action_loginFragment_to_menuFragment)
            }else{
                //Toast.makeText(this@LoginFragment, "Error", Toast.LENGTH_LONG)
                //binding.etLogin.text="Error"
            }

        }
    }
}