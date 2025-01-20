package com.example.dottonimme.listeners;

import com.example.dottonimme.entities.Note;

public interface NotesListener {
    void onNoteClicked(Note note, int position);
}
