package PkLibreria;

public enum ErroresDevolucion {
  SINERROR, //No hay ning�n error
  PERIODOSUPERADO, //Se ha superado el n�mero de d�as que el usuario pod�a tener el libro
  USUARIOSINPRESTAMO; //El usuario no tiene ese libro en pr�stamo
}
