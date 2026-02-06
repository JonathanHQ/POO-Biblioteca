package com.Ercilla;

public class CienciaFiccion extends Libro {

    private  String planeta;

    public CienciaFiccion (String autor,String titulo, String planeta){
        super(autor,titulo,Genero.CienciaFiccion);
        this.planeta = planeta;
    }

    @Override
    public String getDescripcion(){
        return "Ambientada en el planeta " + planeta;
    }
}
