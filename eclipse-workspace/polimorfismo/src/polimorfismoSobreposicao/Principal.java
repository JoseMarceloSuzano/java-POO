package polimorfismoSobreposicao;

public class Principal {
	public static void main(String[] args) {
		//Animal n = new Animal();
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		
		m.setPeso(35.3f);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		a.locomover();
		p.locomover();
		r.locomover();
		
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		Goldfish g = new Goldfish();
		Arara e = new Arara();
	
		c.locomover();
		k.locomover();
		j.locomover();
		t.locomover();
		g.locomover();
		e.locomover();
		k.emitirSom();
	}
}
