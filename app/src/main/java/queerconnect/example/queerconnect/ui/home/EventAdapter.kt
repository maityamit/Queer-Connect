package queerconnect.example.queerconnect.ui.home

// CustomAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import queerconnect.example.queerconnect.R

class EventAdapter(private val dataList: List<HomeFragment.EventsData>) : RecyclerView.Adapter<EventAdapter.CustomViewHolder>() {

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val titleTextView: TextView = itemView.findViewById(R.id.textViewTitle)
//        val descriptionTextView: TextView = itemView.findViewById(R.id.textViewDescription)
        val imageView: ImageView = itemView.findViewById(R.id.events_image)

        val textView1: TextView = itemView.findViewById(R.id.events_text1)
        val textView2: TextView = itemView.findViewById(R.id.events_text2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.events_lay, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val data = dataList[position]

        holder.imageView.setImageResource(data.image)
        holder.textView1.text = data.text
        holder.textView2.text = data.loc

    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}
