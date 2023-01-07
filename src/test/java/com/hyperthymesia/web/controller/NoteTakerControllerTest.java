package com.hyperthymesia.web.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class NoteTakerControllerTest {

    @Test
    @DisplayName("Note taker controller is called with a valid data returns valid response")
    void noteTakerShouldSaveDataAndReturn200() {
        NoteTakerController noteTakerController = new NoteTakerController();

        final String note = "aNote";

        assertTrue(noteTakerController.saveNote(note));
    }
}