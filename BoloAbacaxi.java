package FactoryMethodConfeitaria;

public class BoloAbacaxi extends FazerBolos {

	public BoloAbacaxi() {
		setNome("Bolo de Abacaxi:");
		setTipo("SOBREMESA");
		setPreco(55.99f);
	}
		
	public void SobreoBolo() { 
				System.out.println(getNome() + "\nTipo: "+getTipo() + "\nPre�o: R$"+getPreco()+"\n"
						+ "\nO bolo de abacaxi � uma massa doce tradicional e sobremesa contendo manteiga,"
				         + "\nfarinha, ovo, a��car e gel�ia de abacaxi ou fatias.\n");		
	}
	
	
	@Override
	public void Receita() {
		System.out.println("RECEITA: \n"
				+ "2 x�caras de a��car,\r\n"
    			+ "3 ovos inteiros,\r\n"
    			+ "2 colheres de (sopa) de margarina,\r\n"
    			+ "1 e 1/2 x�caras de farinha de trigo,\r\n"
    			+ "200 ml de leite ou 1 copo pequeno,\r\n"
    			+ "1 colher (sopa) de fermento para bolo,\r\n"
    			+ "Calda:\r\n"
    			+ "1 e 1/2 x�caras de a��car,\r\n"
    			+ "1 abacaxi cortadinho ou em rodelas grossas ou picado, como preferir.");
		
	}

}
