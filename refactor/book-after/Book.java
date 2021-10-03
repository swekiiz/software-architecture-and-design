package com.solid.book;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.ListIterator;

public class Book {
    private String title;
    private String currentPage;
    private List<String> pages;
    private ListIterator<String> iterator;

    public Book(String title, List<String> pages) {
        this.title = title;
        this.pages = pages;
        iterator = pages.listIterator();
        if (iterator.hasNext()) {
            currentPage = iterator.next();
        } else {
            currentPage = null;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getCurrentPage() {
        return currentPage;
    }

    public boolean turnToNextPage() {
        if (!iterator.hasNext())
            return false;

        currentPage = iterator.next();
        return true;
    }
}
