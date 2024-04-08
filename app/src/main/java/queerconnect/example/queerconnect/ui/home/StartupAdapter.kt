package queerconnect.example.queerconnect.ui.home

// CustomAdapter.kt
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import queerconnect.example.queerconnect.R

class StartupAdapter(private val dataList: List<HomeFragment.StartUpData>) : RecyclerView.Adapter<StartupAdapter.CustomViewHolder>() {
    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//
        val imageView: ImageView = itemView.findViewById(R.id.startup_image)
        val textView: TextView = itemView.findViewById(R.id.startup_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.start_up_lay, parent, false)
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
