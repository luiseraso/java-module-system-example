package com.example.expenses.readers.file;

import com.example.expenses.readers.Reader;

public class FileReader implements Reader {

    @Override
    public String read() {
        return "Reading from file";
    }
}
