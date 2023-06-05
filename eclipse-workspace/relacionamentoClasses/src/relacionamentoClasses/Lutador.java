package relacionamentoClasses;

public class Lutador implements Apresentar{
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	
	
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	@Override
	public void apresentar() {
		System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
		System.out.println("Origem " + getNacionalidade());
		System.out.println(getIdade() + " anos");
		System.out.println(getAltura() + " metros de altura");
		System.out.println("Pesando: " + getPeso() + " KG");
		System.out.println("Ganhou: " + getVitorias());
		System.out.println("Empatou: " + getEmpates());
		System.out.println("Perdeu: " + getDerrotas());
	}
	
	@Override
	public void status() {
		System.out.println(getNome() + " é um peso " + getCategoria());
		System.out.println(getVitorias() + " vitórias");
		System.out.println(getEmpates() + " empates");
		System.out.println(getDerrotas() + " derrotas");
	}
	
	@Override
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	
	@Override
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	@Override
	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria(); //essa linha foi utilizada pois peso nao será passado como parâmetro
		//em categoria, mas sim em peso
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (peso < 52.2) {
			this.categoria = "Inválido";
		} else if (peso <= 70.3) {
			this.categoria = "Leve";
		} else if (peso <= 83.9) {
			this.categoria = "Médio";
		} else if (peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}


}
