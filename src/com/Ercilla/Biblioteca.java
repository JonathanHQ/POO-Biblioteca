package com.Ercilla;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca(){
        this.libros = new ArrayList<>();

    }

    public void agregarLibro(Libro libro){
        libros.add(libro);
    }
    public void mostrarLibros(){
        for (Libro l:libros){
           l.mostrarInfo();
        System.out.println("------------------------");
        }
    }
    public void prestarLibros(){
        for (Libro l:libros){
            if (l instanceof Prestable p){
                p.prestar(LocalDate.now());
            }
        }

    }
}
