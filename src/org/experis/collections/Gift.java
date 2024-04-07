package org.experis.collections;

public class Gift {

    // Attributo
    private String name;

    // Costruttore
    public Gift(String name) {
        this.name = name;
    }

    // Metodo per ottenere il nome del regalo
    public String getName() {
        return name;
    }

    // Metodo per impostare il nome del regalo
    public void setName(String name) {
        this.name = name;
    }

    // Metodo per stampare il nome del regalo
    @Override
    public String toString() {
        return name;
    }
}

