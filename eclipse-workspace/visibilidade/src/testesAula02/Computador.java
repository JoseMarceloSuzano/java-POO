package testesAula02;

public class Computador {
	String marca;
	String modelo;
	int nucleos;
	boolean ligado;
	
	void ligar() {
		if(this.ligado == true) {
			System.out.println("Computador ligado!");
		} else {
			System.out.println("Computador desligado!");
		}
	}
	
	void status() {
		System.out.println("Marca : " + this.marca);
		System.out.println("Modelo : " + this.modelo);
		System.out.println("Nucleos : " + this.nucleos);
		System.out.println("Está ligado? " + this.ligado);
	}

}
