package queerconnect.example.queerconnect.ui.home

// CustomAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import queerconnect.example.queerconnect.R

class JobAdapter(private val dataList: List<HomeFragment.JobData>) : RecyclerView.Adapter<JobAdapter.CustomViewHolder>() {

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.jobs_image)
        val textView: TextView = itemView.findViewById(R.id.jobs_textview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.jobs_plate, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val data = dataList[position]

        holder.imageView.setImageResource(data.image)
        holder.textView.text = data.text


    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}
