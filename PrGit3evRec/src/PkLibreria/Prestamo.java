package PkLibreria;

public class Prestamo {
  PersonalIES persona;
  int diaPrestamo;  //Indica el n�mero de d�a en el que se realiz� el prestamo
  public Prestamo(PersonalIES p, int diaPrestamo) {
	super();
	persona = p;
	this.diaPrestamo = diaPrestamo;
  }

}
