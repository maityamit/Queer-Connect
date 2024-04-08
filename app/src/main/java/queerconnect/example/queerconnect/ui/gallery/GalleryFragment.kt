package queerconnect.example.queerconnect.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import queerconnect.example.queerconnect.R
import queerconnect.example.queerconnect.databinding.FragmentGalleryBinding
import queerconnect.example.queerconnect.ui.home.HomeFragment
import queerconnect.example.queerconnect.ui.home.JobAdapter

class GalleryFragment : Fragment() {

    private var _binding: FragmentGalleryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

        _binding = FragmentGalleryBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView1: RecyclerView = root.findViewById(R.id.job_description_show_long)
        recyclerView1.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        val dataList = listOf(
            LongJobData(1, "Description 1","","",""),
            LongJobData(2, "Description 2","","",""),
            LongJobData(3, "Description 3","","",""),
            // Add more data as needed
        )

        val jobAdapter = LongJobAdapter(dataList)
        recyclerView1.adapter = jobAdapter

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    data class LongJobData(val image: Int, val text: String, val text1:String, val text2:String, val text3:String)
}

