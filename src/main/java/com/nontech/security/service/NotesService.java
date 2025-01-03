package com.nontech.security.service;

import com.nontech.security.models.Note;

import java.util.List;

public interface NotesService {

    Note createNoteForUser(String userName, String content);

    Note updateNoteForUser(Long noteId, String content, String userName);

    void deleteNotesForUser(Long noteId, String userName);

    List<Note> getNotesForUser(String userName);

}
