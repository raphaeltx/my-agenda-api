package com.my_agenda_api.controller;

import com.my_agenda_api.model.Note;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class NotesController {

    @RequestMapping("/notes")
    public List<Note> note() {
        return Arrays.asList(
            new Note(1, "I want to exercise more."),
            new Note(2, "I have a rent to pay")
        );
    }
}
