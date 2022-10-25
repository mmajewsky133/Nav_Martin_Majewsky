package ni.edu.uca.navmartin_majewsky

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ni.edu.uca.navmartin_majewsky.databinding.FragmentLoginBinding
import ni.edu.uca.navmartin_majewsky.databinding.FragmentMenuBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MenuFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MenuFragment : Fragment() {

    private lateinit var binding: FragmentMenuBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnMediaArit.setOnClickListener(){
            it.findNavController().navigate(R.id.action_menuFragment_to_mediaAritFragment)
        }
        binding.btnFactorial.setOnClickListener(){
            it.findNavController().navigate(R.id.action_menuFragment_to_factorialFragment)
        }
        binding.btnMultiplo.setOnClickListener(){
            it.findNavController().navigate(R.id.action_menuFragment_to_multiplo_Fragment)
        }
    }
}