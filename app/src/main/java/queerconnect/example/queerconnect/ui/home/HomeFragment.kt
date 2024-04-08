package queerconnect.example.queerconnect.ui.home

import android.graphics.drawable.Drawable
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
import queerconnect.example.queerconnect.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root


        val recyclerView1: RecyclerView = root.findViewById(R.id.jobs_recycler_view)
        recyclerView1.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val dataList = listOf(
            JobData(R.drawable.jobs_1, "Manager Admin"),
            JobData(R.drawable.jobs_5, "Electrical Engineer"),
            JobData(R.drawable.jobs_3, "HR Associate"),
            JobData(R.drawable.jobs_4, "Senior SDE"),
            JobData(R.drawable.jobs_2, "Talent Universe"),
            // Add more data as needed
        )

        val jobAdapter = JobAdapter(dataList)
        recyclerView1.adapter = jobAdapter


        val recyclerView2: RecyclerView = root.findViewById(R.id.startup_recycler_view)
        recyclerView2.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        val dataList2 = listOf(
            StartUpData(R.drawable.startup_01, "Queer Social network"),
            StartUpData(R.drawable.startup_02, "Gay hotel brand"),
            StartUpData(R.drawable.startup_03, "Crowdfunding platform"),
            // Add more data as needed
        )

        val jobAdapter2 = StartupAdapter(dataList2)
        recyclerView2.adapter = jobAdapter2

        val recyclerView3: RecyclerView = root.findViewById(R.id.events_recycler_view)
        recyclerView3.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        val dataList3 = listOf(
            EventsData(R.drawable.events_01, "National LGBT Health Awareness Week","Last Week of March\n"),
            EventsData(R.drawable.events_02, "Day of Silence","Second Friday of April"),
            EventsData(R.drawable.events_03, "LGBTQ Families Day","June 1"),
            // Add more data as needed
        )

        val jobAdapter3 = EventAdapter(dataList3)
        recyclerView3.adapter = jobAdapter3



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    data class JobData(val image: Int, val text: String)
    data class StartUpData(val image: Int, val text: String)
    data class EventsData(val image: Int, val text: String, val loc: String)


}