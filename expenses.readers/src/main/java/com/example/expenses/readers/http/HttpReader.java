package com.example.expenses.readers.http;

import com.example.expenses.readers.Reader;

public class HttpReader implements Reader {

    @Override
    public String read() {
        return "Reading from Http";
    }
}
