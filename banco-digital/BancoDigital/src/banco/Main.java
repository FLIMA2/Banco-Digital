package banco;

public class Main {
	
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanca();
		
		cc.depositar(100);
		cc.transferir(1000, poupanca);
		
		((ContaCorrente) cc).imprimirExtrato();
		((ContaPoupanca) poupanca).imprimirExtrato();
	}

}
