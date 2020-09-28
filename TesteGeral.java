
package hamilton_orientacao_objeto;

import java.util.Scanner;

public class TesteGeral {
    public static void main (String arg[]){

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome do time: ");       
        String nomeTime = entrada.next();
        
        System.out.print("Digite a idade do Clube: ");       
        int idadeClube = entrada.nextInt();
        
        System.out.print("Digite o número de jogadores do clube: ");        
        int quantJogadores = entrada.nextInt(); 
        
        System.out.print("Digite a quantidade de Arbitros em uma partida: ");       
        int quantArbitros = entrada.nextInt();
        
        System.out.print("Digite a quantidade de bolas em uma partida: ");        
        int quantBolas = entrada.nextInt();
                
        Time time = new Time(nomeTime, idadeClube, quantJogadores);
        PartidaFutebol campeonato = new PartidaFutebol(quantArbitros, quantBolas);
        
        System.out.println("Time: "+time.getNomeTime()+"/nIdade do Clube: "+time.getIdadeClube()+"\nQuantidade de Jogadores do Clube: "+time.getNJogadores());
        
        System.out.println("Quantidade de Arbitros na partida: "+campeonato.getQuantArbitros()+"\nQuantidade de bolas na partida: "+campeonato.getQuantBolas());
    }
}
