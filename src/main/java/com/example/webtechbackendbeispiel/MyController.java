package com.example.webtechbackendbeispiel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @GetMapping("/todos")
    public List<TodoEntry> greeting() {
        TodoEntry entry = new TodoEntry("Test", "Test", false);
        TodoEntry entry1 = new TodoEntry("Test1", "Test", false);
        TodoEntry entry2 = new TodoEntry("Test2", "Test", false);
        TodoEntry entry3 = new TodoEntry("Test3", "Test", false);
        TodoEntry entry4 = new TodoEntry("Test4", "Test", false);
        return List.of(entry, entry1, entry2, entry3, entry4);
    }

}