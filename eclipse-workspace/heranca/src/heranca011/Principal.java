package heranca011;

public class Principal {
	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa(); não pode ser instanciado pois a class pessoa é abstrata
		Visitante v1 = new Visitante();
		v1.setNome("Juvenal");
		v1.setIdade(22);
		v1.setSexo("M");
		System.out.println(v1.toString());
		System.out.println("");
		
		Aluno a1 = new Aluno();
		a1.setNome("Cláudio");
		a1.setMatricula(1111);
		a1.setCurso("Informática");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();
		
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(1112);
		b1.setNome("Jubileu");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();	
		
		
		Professor f1 = new Professor();
		f1.setEspecialidade("Geografia");
		f1.setIdade(50);
		f1.setSalario(1500.0f);
		f1.setNome("Carlão");
		f1.setSexo("M");
		System.out.println(f1.toString());
		
	}
}
