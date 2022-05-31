
public class Main {
	
	public static void main (String[] args) {
		Cliente marifer = new Cliente();
		marifer.setNome("Marifer");
		
		Conta cc = new ContaCorrente(marifer);
		Conta poupanca = new ContaPoupanca(marifer);
		
		cc.depositar(100);
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
