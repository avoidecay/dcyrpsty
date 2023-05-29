package PkLibreria;

public class Alumno extends PersonalIES{
	@Override
	public String toString() {
		return "Alumno [grupo=" + grupo + ", codUsuario=" + codUsuario + ", penalizacion=" + penalizacion
				+ ", toString()=" + super.toString() + ", getNombre()=" + getNombre() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	String grupo;
   public Alumno(String nombre, String grupo) {
		super(nombre);
		this.grupo=grupo;
	}

}
