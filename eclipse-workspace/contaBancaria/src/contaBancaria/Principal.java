package contaBancaria;

public class Principal {
	public static void main(String[] args) {
		ContaCorrente p1 = new ContaCorrente();
		p1.setNumConta(1111);
		p1.setDono("Jubileu");
		p1.abrirConta("CC");
		
		ContaCorrente p2 = new ContaCorrente();
		p2.setNumConta(2222);
		p2.setDono("Creuza");
		p2.abrirConta("CP");
		
		p1.depositar(100);
		p2.depositar(500);
		
		
		p2.sacar(100);
		p1.sacar(150);
		
		p1.fecharConta();
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
