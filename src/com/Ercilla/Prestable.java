package com.Ercilla;
import java.time.LocalDate;
public interface Prestable {
    void prestar (LocalDate fechaPrestamo);

    void devolver (LocalDate fechaDevolucion);

}
