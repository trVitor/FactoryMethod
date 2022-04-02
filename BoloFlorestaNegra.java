package FactoryMethodConfeitaria;

public class BoloFlorestaNegra extends FazerBolos {
	
	 public BoloFlorestaNegra() {
	    	setNome("Bolo Floresta Negra:");
	    	setTipo("SOBREMESA");
	    	setPreco(69.95f);
	    }
	    	
	public void SobreoBolo() {
		
		System.out.println(getNome() + "\nTipo: "+getTipo() + "\nPre�o: R$"+getPreco()+"\n"
				+ "\nBolo Floresta Negra consiste de algumas camadas de bolo de chocolate, \ncom chantilly e cerejas entre cada camada.\n");			
	}
	
	@Override
    public void Receita() {
    	System.out.println("RECEITA: \n"
    			+ "Ingredientes para 1 receita, voc� vai precisar de 2, assadas separadamente para um bolo grande,\r\n"
				+ "6 ovos,\r\n"
				+ "6 colheres de chocolate em p� nestl�,\r\n"
				+ "1 x�cara de ch� de �gua,\r\n"
				+ "1 x�cara de ch� de a��car,\r\n"
				+ "1 e 1/2 x�caras de ch� de farinha,\r\n"
				+ "1 colher de sobremesa de fermento Royal,"
				+ "800 g de cerejas picadas ao meio ou em 4,\r\n"
				+ "Cerejas com cabinho para decorar,\r\n"
				+ "�gua,\r\n"
				+ "A��car,\r\n"
				+ "O caldo da cereja,\r\n"
				+ "Chantilly de sua prefer�ncia,\r\n"
				+ "600 a 800 g de chocolate picado, depende da decora��o que vai fazer.");
	 
 }
    
}
