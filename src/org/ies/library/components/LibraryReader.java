package org.ies.library.components;

import org.ies.library.model.Book;
import org.ies.library.model.Library;

import java.util.Scanner;

public class LibraryReader {
    private final Scanner scanner;
    private final BookReader bookReader;

    public LibraryReader(Scanner scanner, BookReader bookReader) {
        this.scanner = scanner;
        this.bookReader = bookReader;
    }

    public Library read() {
        System.out.println("Introduce los datos de la biblioteca: ");
        System.out.println("Introduce el nombre de la biblioteca: ");
        String name = scanner.nextLine();

        System.out.println("Cuantos libros tiene la biblioteca?: ");
        int size = scanner.nextInt();
        while (size <= 0) {
            System.out.println("Numero invalido , introduzca uno mayor que cero ");
        }
        Book[] books = new Book[size];
        for (int i = 0; i < books.length; i++) {
            books[i] = bookReader.read();
        }
        return new Library(
                name,
                books
        );
    }
}
