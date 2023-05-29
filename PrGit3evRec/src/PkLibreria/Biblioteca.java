package PkLibreria;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Biblioteca {
  Hashtable <String,Libro> libros;
  Vector <PersonalIES> lectores;
  int diaActual=1;  //Indica el n�mero de d�a actual. Se ir� incrementando cada d�a
  Teclado t= new Teclado();

  Biblioteca() throws IOException{

  }
  Libro buscarLibro(String codigo){
     return null;
  }
  PersonalIES buscarPersona(String nombre){
	  for (PersonalIES l:lectores)
		  if (l.getNombre().equalsIgnoreCase(nombre))
			  return l;
	  return null;
  }
  boolean prestarLibro(Libro l, PersonalIES p){
	  return (l.anadirPrestamo(p,diaActual));
  }
  void prestar () throws IOException{
	  
  }
  ErroresDevolucion devolverLibro(Libro l, PersonalIES p){
	  return (l.devolverPrestamo(p,diaActual));
  }
  void devolver () throws IOException{
	  
  }
  void mostrarPrestamos(){
	  for (Libro l:libros.values())
		  System.out.println(l);
  }
  void restarPenalizaciones(){
	  
  }
  void altaLibro() throws IOException {
	  System.out.println("T�tulo");
	  String titulo= t.leerString();
	  System.out.println("C�digo");
	  String cod= t.leerString();
	  System.out.println("Num Ejemplares");
	  int numEjemplares=t.leerInt();
	  System.out.println("Autores. L�nea en blanco para finalizar");
	  
  }
  void altaLector() throws IOException {
	  PersonalIES p=null;
	  System.out.println("Tipo: A-Alumno P-Profesor");
	  String tipo= t.leerString();
	  System.out.println("nombre");
	  String nombre= t.leerString();
	  
  }
  void menu() throws IOException{
  	int opc=0;
  	do {
  	  mostrarMenu();
  	  opc=t.leerInt();
  	  seleccionarOpcion(opc);
  	}while (opc!=0);
  }
void seleccionarOpcion(int opc) throws IOException {
	switch (opc){
  	    case 1: prestar(); break;
  	    case 2: devolver(); break;
  	    case 3: mostrarPrestamos(); break;
  	    case 4: diaActual++; break;
  	    case 5: restarPenalizaciones(); break;
  	    case 6: altaLibro(); break;
  	    case 7: altaLector(); break;
  	  }
}
void mostrarMenu() {
	System.out.println("1-Prestar");
  	  System.out.println("2-Devolver");
  	  System.out.println("3-Mostrar");
  	  System.out.println("4-Incrementar dia");
  	  System.out.println("5-Restar Penalizaciones");
  	  System.out.println("6-Alta Libro");
  	  System.out.println("7-Alta Lector");
  	  System.out.println("0-Fin");
}
  public static void main (String arg[]) throws IOException{
	  Biblioteca b=new Biblioteca();
	  b.menu();
  }
}
