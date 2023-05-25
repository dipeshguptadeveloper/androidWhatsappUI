package com.dkgtech.whatsappui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.dkgtech.whatsappui.R
import com.dkgtech.whatsappui.model.ChatModel

class RecyclerChatAdapter(private val context: Context, private val arrChat: ArrayList<ChatModel>) :
    RecyclerView.Adapter<RecyclerChatAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgUserProfileImage = itemView.findViewById<ImageView>(R.id.imgUserProfileImage)
        val txtUsername = itemView.findViewById<TextView>(R.id.txtUsername)
        val txtUserChat = itemView.findViewById<TextView>(R.id.txtUserChat)
        val txtUserChatTime = itemView.findViewById<TextView>(R.id.txtUserChatTime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.chats_row, parent, false))
    }

    override fun getItemCount(): Int {
        return arrChat.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgUserProfileImage.setImageResource(arrChat[position].userImage)
        holder.txtUsername.text = arrChat[position].username
        holder.txtUserChat.text = arrChat[position].userChat
        holder.txtUserChatTime.text = arrChat[position].userChatTime
    }

}
