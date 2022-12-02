package com.ait.weather.weather_climate

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ait.weather.R

class WeatherClimateAdapter (
    var nContext: Context,
    var climateList: ArrayList<Int>
) : RecyclerView.Adapter<WeatherClimateAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val listName = itemView.findViewById(R.id.tv_item_print) as TextView
        val degree=itemView.findViewById(R.id.tv_degree)as TextView
        val img=itemView.findViewById(R.id.iv_cloud)as ImageView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.ip_adapter_weather_climate,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when(position%7){
            0->{
                holder.degree.text="15'c"
                holder.listName.text="Saturday"
            }
            1->{
                holder.degree.text="20'c"
                holder.listName.text="Sunday"
            }
            2->{
                holder.degree.text="25'c"
                holder.listName.text="Monday"
            }
            3->{
                holder.degree.text="30'c"
                holder.listName.text="tuesday"
            }
            4->{
                holder.degree.text="35'c"
                holder.listName.text="wednesday"
            }
            5->{
                holder.degree.text="40'c"
                holder.listName.text="thursday"
            }
            6->{
                holder.degree.text="45'c"
                holder.listName.text="Friday"
            }
        }

    }

    override fun getItemCount(): Int {
        return climateList.size
    }
    interface ItemClickInterfaces{
        fun itemClick(id:Int)
    }
}