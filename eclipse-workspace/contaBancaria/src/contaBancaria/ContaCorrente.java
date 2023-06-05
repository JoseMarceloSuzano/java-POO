package contaBancaria;

public class ContaCorrente {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	@Override
	public String toString() {
		return "ContaCorrente [numConta=" + numConta + ", tipo=" + tipo + ", dono=" + dono + ", saldo=" + saldo
				+ ", status=" + status + "]";
	}

	public ContaCorrente() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	
    public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo == "CC") {
			this.setSaldo(50);
		} else if (tipo == "CP") {
			this.setSaldo(150);
		}
		
		System.out.println("Conta aberta com sucesso!");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Não é possivel encerrar a conta pois há saldo!");
		} else if (this.getSaldo() < 0) {
			System.out.println("Não é possivel encerrar a conta pois saldo negativo!");
		} else {
			this.setStatus(false);
			System.out.println("Conta encerrada!");
		}
	}
	
	public void depositar(float valor) {
		if (this.getStatus() == true) {
			this.setSaldo(getSaldo() + valor);
			System.out.println("Depósito realizado com suceso na conta de " + this.getDono());
		} else {
			System.out.println("Impossivel depositar!");
		}
	}
	
    public void sacar(float valor) {
		if (this.getStatus() == true) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getDono());
		} else {
			System.out.println("Impossivel sacar, saldo insuficiente!");
		}
	    } else {
	    	System.out.println("Impossivel sacar de uma conta fechada!");
	    }
	}
    
    public void pagarMensal() {
    	int valor = 0;
		if (this.getTipo() == "CC") {
			valor = 12;
		} else if (this.getTipo() == "CP"){
			valor = 20;
		} if(this.getStatus() == true) {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Mensalidade paga com sucesso por " + this.getDono());
		} else {
			System.out.println("Impossivel pagar uma conta fechada!");
		}
	}
	
	public int getNumConta() {
		return this.numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return this.dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return this.saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
