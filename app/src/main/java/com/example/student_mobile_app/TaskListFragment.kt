package com.example.student_mobile_app

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.academicapp.R

class TaskListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_task_list, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewTasks)

        // Contoh data tugas
        val tasks = listOf(
            Task("Tugas Matematika", "Mengerjakan soal bab 4", "25 Nov 2024"),
            Task("Tugas Fisika", "Membuat laporan praktikum", "27 Nov 2024"),
            Task("Tugas Kimia", "Menghafal tabel periodik", "30 Nov 2024")
        )

        val adapter = TaskAdapter(tasks)
        recyclerView.adapter = adapter

        return view
    }
}
