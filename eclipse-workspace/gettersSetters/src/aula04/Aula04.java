package aula04;

public class Aula04 {
	
	public static void main(String[] args) {
	
	/*c1.setModelo("BIC");
	c1.modelo = "BIC";
	
	c1.setPonta(0.5f);
	c1.ponta = 0.5f;
	
	System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
   }*/
		
	Caneta c1 = new Caneta("NIC", 0.5f, "Amarelo");
	c1.status();
	
	Caneta c2 = new Caneta("KKK", 1.5f, "Laranja");
	c2.status();
   }
}