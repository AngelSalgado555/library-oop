package org.ies.library.components;

import org.ies.library.model.Author;

import java.util.Scanner;

public class AutorReader {
    private final Scanner scanner;

    public AutorReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Author read() {
        System.out.println("Introduce los datos del autor");
        System.out.println("NIF: ");
        int nif = scanner.nextInt();

        System.out.println("Introduce un nombre: ");
        String name = scanner.nextLine();

        System.out.println("Introduce los apellidos: ");
        String surname = scanner.nextLine();

        return new Author(
            nif,
            name,
            surname
        );
    }
}
