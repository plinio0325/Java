

public class Programa
{
	public static void main(String[] args)
	{
		Conta minhaConta = new Conta();
		Cliente c = new Cliente();
		minhaConta.titular = c;

		Cliente clienteMinhaConta = minhaConta.titular;
		clienteMinhaConta.nome = "Duke";
		
		System.out.println("Cliente: "+clienteMinhaConta.nome);
		

	


	}

}