package com.Ercilla;

import java.time.LocalDate;

public class NovelaRomantica extends Libro implements Prestable{

    private boolean finalFeliz;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public NovelaRomantica(String autor,String titulo,boolean finalFeliz){
        super(autor,titulo,Genero.NovelaNegra);
        this.finalFeliz = finalFeliz;
    }

    @Override
    public String getDescripcion(){
        return "Final feliz" + (finalFeliz?"SI.":"NO.");
    }

    @Override
    public void prestar(LocalDate fechaPrestamo){
        if (this.fechaPrestamo != null){
            System.out.println("EL libro " + titulo + "ya esta prestado.");
            return;
        }
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaPrestamo.plusDays(30);
    }
    @Override
    public void devolver(LocalDate fechaDevolucion){
        if (this.fechaDevolucion == null){
            System.out.println("EL libro " + titulo + "ya esta prestado");
            return;
        }
        System.out.println("Novela romantica devuelta " + fechaDevolucion);
        this.fechaPrestamo = null;
        this.fechaDevolucion = null;
    }
}

