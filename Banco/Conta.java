public class Conta 
{
	int numero;
	String dono;
	String cpf;
	double saldo;
	double limite;
	Cliente titular;

	
	boolean saca(double valor)
	{
		if (this.saldo < valor)
		{
			return true;
		}
		else
		{

			this.saldo =- valor;
			return false;
		}
	}

	void deposita(double valor)
	{
		this.saldo += valor;
	}

	boolean transfere(Conta destino, double valor)
	{
		boolean retirou = this.saca(valor);
		if (retirou == false)
		{
			// nao deu para sacar
			return false;
		}
		else
		{
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}

		//this.saldo -= valor;
	//	destino.saldo += valor;

	}

}


