package com.arte.quicknotes;

import com.arte.quicknotes.database.NotesStorage;
import com.arte.quicknotes.models.Note;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dquijada on 27/04/2016.
 */
public class NoteListMock {
    private static List<Note> noteList;
    private static int nextId = 0;

    private static void createList () {
        noteList = new ArrayList<>();

        for (int i = 0;  i < 5; i++) {
            Note note = new Note();
            note.setTitle ("Note nº" + i);
            note.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum");
            addNote(note);
        }
    }

    public static List<Note> getNoteList() {
        if (noteList == null) {
            createList();
        }
        return noteList;
    }

    public static void setNoteList(List<Note> noteList) {
        NoteListMock.noteList = noteList;
    }

    public static void addNote(Note note) {
        note.setId(++nextId);
        noteList.add(note);
    }

    public static void updateNote(Note updated) {
        for (int i = 0; i < noteList.size(); i++) {
            Note note = noteList.get(i);
            if (note.getId() == updated.getId()) {
                note.setTitle(updated.getTitle());
                note.setContent(updated.getContent());
                break;
            }
        }
    }

    public static void deleteNote(Note deleted) {
        for (int i = 0; i < noteList.size(); i++) {
            Note note = noteList.get(i);
            if (note.getId() == deleted.getId()) {
                noteList.remove(i);
                break;
            }
        }
    }
}
