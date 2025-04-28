package com.materialdesign.todolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.materialdesign.todolist.databinding.FragmentCreateNoteBinding
class CreateNoteFragment : Fragment() {

    private var _binding: FragmentCreateNoteBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCreateNoteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBack.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.btnSave.setOnClickListener {
            saveNote()
        }
    }

    private fun saveNote() {
        val noteText = binding.etNoteContent.text.toString().trim()
        if (noteText.isNotEmpty()) {
            val title = binding.etNoteTitle.text.toString().trim()
            val finalText = if (title.isNotEmpty()) "$title\n$noteText" else noteText


            val backgroundColor = ColorUtils.getRandomColor()
            val note = Note(
                text = finalText,
                backgroundColor = backgroundColor
            )


            (requireActivity() as MainActivity).setPendingNote(note)


            findNavController().navigateUp()
        } else {
            Toast.makeText(requireContext(), "Note cannot be empty", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}