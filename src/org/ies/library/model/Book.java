package org.ies.library.model;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String isbn;
    private String Title;
    private int year;
    private Author[] authors;

    public Book(String ISBN, String title, int year, Author[] autores) {
        this.isbn = ISBN;
        Title = title;
        this.year = year;
        this.authors = autores;
    }

    public boolean hasAuthor (String nif ) {
        for (Author author : authors){
            if (author.getNif().equals(nif)){
                return true;
            }
        }
        return false;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(isbn, book.isbn) && Objects.equals(Title, book.Title) && Objects.deepEquals(authors, book.authors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, Title, year, Arrays.hashCode(authors));
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + isbn + '\'' +
                ", Titulo='" + Title + '\'' +
                ", year=" + year +
                ", autor=" + Arrays.toString(authors) +
                '}';
    }
}
