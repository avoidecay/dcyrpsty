package PkLibreria;

import java.util.Vector;

public class Libro {
   String titulo;
   String codigo;
   private int ejemplaresTotales;
   private Vector <Persona> autores;
   Vector <Prestamo> prestamos;
   
   public Libro(String titulo, String codigo, int ejemplaresTotales) {
	 super();
	 this.titulo = titulo;
	 this.codigo = codigo;
	 this.ejemplaresTotales = ejemplaresTotales;
	 autores=new Vector <Persona>();
	 prestamos=new Vector <Prestamo>();
   }
   public void addAutor(String a){
	   autores.add(new Autor(a));
   }
   public boolean anadirPrestamo(PersonalIES p, int diaActual){
	   return true;
   }
   public ErroresDevolucion devolverPrestamo(PersonalIES p, int dia){
	   return ErroresDevolucion.SINERROR;
   }
}
