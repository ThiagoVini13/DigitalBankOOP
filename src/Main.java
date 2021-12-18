
public class Main {

	public static void main(String[] args) {
		
		Cliente Thiago = new Cliente();
		Thiago.setNome("Thiago");
		
		Conta cc = new  ContaCorrente(Thiago);
		Conta cp = new  ContaPoupanca(Thiago);
		
		cc.depositar(100);
		cc.transferir(100, cp);
		
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
