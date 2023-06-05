package heranca011;

public class Tecnico extends Aluno{
	private String registroProfissional;
	
	public void praticar() {
		System.out.println("Praticando aula!");
	}

	public String getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(String registroProfissional) {
		this.registroProfissional = registroProfissional;
	}

	@Override
	public String toString() {
		return "Tecnico [registroProfissional=" + registroProfissional + ", getMatricula()=" + getMatricula()
				+ ", getCurso()=" + getCurso() + ", toString()=" + super.toString() + ", getNome()=" + getNome()
				+ ", getIdade()=" + getIdade() + ", getSexo()=" + getSexo() + "]";
	}
	
	
}
