package com.example.expenses.application;

import com.example.expenses.readers.*;
// import com.example.expenses.readers.file.*; Compile error. Package is not visible.

public class ExpensesApplication {

    public static void main(String[] args) {
        System.out.println("From main...");
        Reader httpReader = ReaderFactory.getReader("http");
        Reader fileReader = ReaderFactory.getReader("file");

        System.out.println("HTTP: "+ httpReader.read());
        System.out.println("FILE: "+ fileReader.read());
    }

}
