public class ContaCorrente extends Conta
{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		
		System.out.println("___EXTRATO CONTA CORRENTE___");
		super.extract();
		
	}
	
}