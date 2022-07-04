package Pratic;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class FIPE {

	public static void main(String[] args) {
		
		int cntAno = 0, cntVal = 0;
		int opx,j, ano=0;
	     ArrayList<String> rede = new ArrayList();
		
		 do
	     {
	     String menu = JOptionPane.showInputDialog("MENU\n1 - CADASTRAR CARRO\n2 - LISTAR\n3 - RESULTADOS\n4 - SAIR");
	     opx = Integer.parseInt(menu);
	     
	     switch (opx)
	        {
	             case 1:
	            	 //o  usuário  deverá  entrar  com  as  seguintes  informações:    Marca, 
	            	 //Modelo, Ano e Valor em seguida salvar os dados em um ArrayList. Exemplo de entrada 
	            	 //de dados: 
	            	if(ano<=2022)
	            	{
	                String marca = JOptionPane.showInputDialog("Digite a marca do veículo: ");
	                String modelo = JOptionPane.showInputDialog("Digite o modelo: ");
	                
	                int anofab = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricação: "));
	                double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do veículo: "));
	               
	                rede.add(marca+"\r\n"+modelo+"\r\n"+ano+"\r\n"+valor+"\r\n");
	            	
	                cntAno+=ano;
	                
	                if(valor>=50000)
	            	{
	            		cntVal++; break;}
	            	}
	            	else 
	            	{
	            		JOptionPane.showMessageDialog(null, "Valor inválido");
	            	}
                
            	
	            	JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
	            
	             case 2:
	            	//Mostrar todos os registros cadastrados no Arraylist.
	            	JOptionPane.showMessageDialog(null, rede);
	                break;
	                
	             case 3:
	            	 //O programa deverá contar o número de carros que possuem valor 
	            	 //acima  ou  igual  a  R$  50.000,00.  E  calcular  a  média  dos  anos  de  todos  os  veículos 
	            	 //cadastrados.     
	            	 int media;
	            	 
	            	 media = cntVal/cntAno;
	            	 JOptionPane.showMessageDialog(null, media);	            	 
			            	             	 
	            	 break;
	             case 4:
	                 break;
	             default:
	                  JOptionPane.showMessageDialog(null, "Escolha uma das opções válidas");
	        }
	     } while (opx!=4);

	}

}
