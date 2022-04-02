package FactoryMethodConfeitaria;

public class BoloChoconinho extends FazerBolos {
	
	public BoloChoconinho() {
		setNome("Bolo Choconinho: ");
		setTipo("SOBREMESA");
		setPreco(65.99f);
	}
	
	public void SobreoBolo() {
		System.out.println(getNome() + "\nTipo: "+getTipo() + "\nPre�o: R$"+getPreco()+"\n"
				+ "\nBolo de Choconinho, consiste em um bolo com recheio de brigadeiro e, \ncobertura de leite Ninho trufado.");	
	}
	@Override
	public void Receita() {
		 System.out.println("\nRECEITA:\n"
		 		    + "2 colheres de leite ninho,\r\n"
		    		+ "3 colheres de cocolate,\r\n"
		    		+ "20 ml de �gua,\r\n"
		    		+ "1 pitada de a��car,\r\n"
		    		+ "Confete ou barra de chocolate a gosto." );
	}
	
}
