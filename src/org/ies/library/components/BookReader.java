package org.ies.library.components;

import org.ies.library.model.Author;
import org.ies.library.model.Book;

import java.util.Scanner;

public class BookReader {
    private final Scanner scanner;
    private final AutorReader autorReader;

    public BookReader(Scanner scanner, AutorReader autorReader) {
        this.scanner = scanner;
        this.autorReader = autorReader;
    }

    public Book read() {
        System.out.println("Introduce los datos del libro: ");
        System.out.println("ISBN: ");
        String isbn = scanner.nextLine();

        System.out.println("Titulo: ");
        String title = scanner.nextLine();

        System.out.println("Año de publicación: ");
        int year = scanner.nextInt();

        System.out.println("Cuantos autores tiene el libro? ");
        int size = scanner.nextInt();

        Author[] authors = new Author[size];
        for (int i = 0; i < authors.length; i++) {
            authors[i] = autorReader.read();
        }
        return new Book(
                isbn,
                title,
                year,
                authors
        );
    }
}
