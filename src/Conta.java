public abstract class Conta implements IConta
{
	
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	
	protected int agency;
	protected int number;
	protected double balance;
	private Cliente cliente;
	
	public Conta(Cliente cliente) 
	{
		this.agency = Conta.AGENCIA_PADRAO;
		this.number = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	@Override
	public void sacar(double value)
	{
	
		this.balance -= value;
		
	}
	
	@Override
	public void depositar(double value) 
	{
		
		this.balance += value;
		
	}
	
	@Override
	public void transferir(double value, Conta destinnationAccount) 
	{
		
		this.sacar(value);
		destinnationAccount.depositar(value);
		
	}
	
	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	
	protected void extract() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agency));
		System.out.println(String.format("Conta: %d", this.number));
		System.out.println(String.format("Saldo: %.2f", this.balance));
	}
	
}
