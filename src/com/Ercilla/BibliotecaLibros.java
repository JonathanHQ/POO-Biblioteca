package com.Ercilla;

public class BibliotecaLibros {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(new Terror("Stephen King","It", 9));
        biblioteca.agregarLibro(new CienciaFiccion("Asimov","Fundacion","Trantor"));
        biblioteca.agregarLibro(new NovelaNegra("Agata Cristie","Diez negritos","Wargrave"));
        biblioteca.agregarLibro(new NovelaRomantica("Jane Austen","Orgullo y Prejuicio",true));

        biblioteca.mostrarLibros();

        System.out.println("________Prestamos________");
        biblioteca.prestarLibros();
        System.out.println("----------Prestar otra vez__________");
        biblioteca.prestarLibros();
    }
}
