package com.my_agenda_api.model;

public class Note {
    private final long id;
    private final String note;

    public Note(long id, String note) {
        this.id = id;
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Note{" + "id=" + id + ", note='" + note + '\'' + '}';
    }
}
