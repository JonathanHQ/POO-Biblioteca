package com.Ercilla;

public class NovelaNegra extends Libro{

    private String detective;

    public NovelaNegra (String autor,String titulo,String detective){
        super(autor,titulo,Genero.NovelaNegra);
        this.detective = detective;
    }

    @Override
    public String getDescripcion(){
    return "Detective protagonista " + detective;
    }
}
