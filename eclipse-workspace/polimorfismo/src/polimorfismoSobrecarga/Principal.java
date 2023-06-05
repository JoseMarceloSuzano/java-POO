package polimorfismoSobrecarga;

public class Principal {

	public static void main(String[] args) {
		Mamifero x = new Mamifero();
		//x.emitirSom();
		
		Lobo l = new Lobo();
		//l.emitirSom();
		
		Cachorro c = new Cachorro();
		c.reagir("Olá");
		c.reagir("Vai apanhar");
		c.reagir(11, 45);
		c.reagir(19, 00);
		c.regir(true);
		c.regir(false);
		c.reagir(2, 12.5f);
		c.reagir(17, 4.5f);
		
	}

}
