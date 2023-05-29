package PkLibreria;

public class Autor extends Persona {
    @Override
	public String toString() {
		return "Autor [toString()=" + super.toString() + ", getNombre()=" + getNombre() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

	public Autor(String nombre) {
		super( nombre);
	}
}
