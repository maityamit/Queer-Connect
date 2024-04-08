package queerconnect.example.queerconnect.ui.gallery
// CustomAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import queerconnect.example.queerconnect.R

class LongJobAdapter(private val dataList: List<GalleryFragment.LongJobData>) : RecyclerView.Adapter<LongJobAdapter.CustomViewHolder>() {

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val titleTextView: TextView = itemView.findViewById(R.id.textViewTitle)
//        val descriptionTextView: TextView = itemView.findViewById(R.id.textViewDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.jobs_listed_more_description, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val data = dataList[position]

    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}
