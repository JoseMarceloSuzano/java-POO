package heranca011;

public class Bolsista extends Aluno{
	private float bolsa;
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de: " + this.getNome());
		
	/*@Override
		public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista!");
		}*/
	
	}

	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	@Override
	public String toString() {
		return "Bolsista [bolsa=" + bolsa + ", getMatricula()=" + getMatricula() + ", getCurso()=" + getCurso()
				+ ", toString()=" + super.toString() + ", getNome()=" + getNome() + ", getIdade()=" + getIdade()
				+ ", getSexo()=" + getSexo() + "]";
	}
	
	
}
