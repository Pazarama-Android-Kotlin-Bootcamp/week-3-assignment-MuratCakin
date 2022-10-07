package com.muratcakin.parma

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BooksAdapter(
    private val bookList: MutableList<Book>,
    private val listener: BooksListener
) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    class BooksViewHolder(view: View) : RecyclerView.ViewHolder(view) {


        private val tvId = view.findViewById<TextView>(R.id.tvId)
        private val ivCover = view.findViewById<ImageView>(R.id.ivCover)
        private val tvTitle = view.findViewById<TextView>(R.id.tvTitle)
        private val tvAuthor = view.findViewById<TextView>(R.id.tvAuthor)

        fun bind(book: Book, listener: BooksListener) {
            tvId.text = book.id
            ivCover.setImageResource(book.cover)
            tvTitle.text = book.title
            tvAuthor.text = book.author


            itemView.setOnClickListener {
                listener.onClicked(book)
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BooksViewHolder(view)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        holder.bind(bookList[position], listener)
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

}

interface BooksListener {
    fun onClicked(book: Book)
}