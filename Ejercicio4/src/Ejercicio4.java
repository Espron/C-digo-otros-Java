package com.generation;
import java.util.Scanner; 
public class Ejercicio4 { 
//En las líneas 1 a 3 estamos creando el paquete, se importa para hacer uso de scanner y nombramos la clase
	public static void main(String[] args) {

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): "); //Jugador 1
		Scanner s = new Scanner(System.in); // Se añade la entrada
		String j1 = s.nextLine();
    
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); //Jugador 2
		Scanner s2 = new Scanner(System.in); // Se añade la entrada
		String j2 = s.nextLine();
    
    if (j1.== (j2)) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2. == ("tijeras")) {
            g = 1;
          }

        case "papel":
          if (j2. == ("piedra")) {
            g = 1;
          }
        case "tijeras":
          if (j2. == ("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
  s.close();
  s2.close();
  //Cierran scanners
}
}