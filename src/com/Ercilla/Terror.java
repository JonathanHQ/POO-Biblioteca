package com.Ercilla;

import java.time.LocalDate;

public class Terror extends Libro implements Prestable{

    private int nivelMiedo;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Terror (String autor, String titulo, int nivelMiedo){
        super(autor,titulo,Genero.Terror);
        this.nivelMiedo = nivelMiedo;
    }

    @Override
    public String getDescripcion (){
        return "Nivel miedo: " + nivelMiedo;
    }
    @Override
    public void prestar (LocalDate fechaPrestamo){
        if (this.fechaPrestamo != null){
            System.out.println("El libro ya esta pretado.");
            return;
        }
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaPrestamo.plusDays(15);
        System.out.println("Prestado el " + fechaPrestamo + "devolver antes del " + fechaDevolucion);
    }
    @Override
    public void devolver (LocalDate fechaDevolucion){
        if (this.fechaDevolucion == null){
            System.out.println("El no esta prestado");
            return;
        }
        System.out.println("Devuelto el " + fechaDevolucion);
        this.fechaPrestamo = null;
        this.fechaDevolucion = null;
    }
}
