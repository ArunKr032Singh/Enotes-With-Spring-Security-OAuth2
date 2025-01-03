package com.nontech.security.repository;

import com.nontech.security.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotesRepo extends JpaRepository<Note, Long> {
    List<Note> findByOwnerUserName(String ownerUserName);
}
