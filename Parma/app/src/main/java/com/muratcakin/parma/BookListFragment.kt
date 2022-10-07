package com.muratcakin.parma

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView


class BookListFragment : Fragment(), BooksListener {
    private lateinit var rvBookList: RecyclerView
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_book_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = findNavController()
        rvBookList = view.findViewById(R.id.rvBookList)
        setupAdapter()
    }

    private fun setupAdapter() {
        rvBookList.adapter = BooksAdapter(mockBookData, this@BookListFragment)
        rvBookList.layoutManager = androidx.recyclerview.widget.GridLayoutManager(context, 3)
    }

    override fun onClicked(book: Book) {
        navController.navigate(R.id.action_bookList_to_detail, Bundle().apply {
            putString("bookModel", book.toJson())
        })
    }

}