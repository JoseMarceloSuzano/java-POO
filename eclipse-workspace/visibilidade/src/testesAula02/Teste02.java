package testesAula02;

public class Teste02 {
	public static void main(String[] args) {
		Computador c1 = new Computador();
		c1.modelo = "I3 7GEN";
		c1.marca = "Centrium";
		c1.ligado = false;
		c1.nucleos = 5;
		
		c1.status();
		c1.ligar();
	}
}
