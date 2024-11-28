package org.ies.library.model;

import java.util.Objects;

public class Author {
    private String nif;
    private String name;
    private String surname;

    public Author(String NIF, String name, String surname) {
        this.nif = NIF;
        this.name = name;
        this.surname = surname;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author autor = (Author) o;
        return nif == autor.nif && Objects.equals(name, autor.name) && Objects.equals(surname, autor.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, name, surname);
    }

    @Override
    public String toString() {
        return "Autor{" +
                "NIF=" + nif +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
