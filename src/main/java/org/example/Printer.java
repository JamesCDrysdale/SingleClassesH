package org.example;

public class Printer {
    private int pages;
    private int toner;

    public Printer(int pages, int toner) {
        this.pages = pages;
        this.toner = toner;
    }

    public int getPages() {
        return pages;
    }

    public int getToner() {
        return toner;
    }

    public int print(int docPages, int copies) {
        int totalPages = docPages * copies;

        if (pages > totalPages && toner > totalPages) {
            toner -= totalPages;
            return pages -= totalPages;
        } else return pages;
    }
}
