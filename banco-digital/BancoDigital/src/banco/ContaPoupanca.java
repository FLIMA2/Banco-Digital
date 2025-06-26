package banco;

public class ContaPoupanca extends Conta {
	
	public void imprimirExtrato() {
		System.out.println("*** Extrato da conta poupanca ***");
		super.imprimirInfosComuns();
		}
	
}
