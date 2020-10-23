package com.example.expenses.readers;

import com.example.expenses.readers.file.FileReader;
import com.example.expenses.readers.http.HttpReader;

public abstract class ReaderFactory {

    public static Reader getReader(String type) {
        return switch(type) {
            case "http" -> new HttpReader();
            default -> new FileReader();
        };
    }

}
