
package hamilton_orientacao_objeto;

import java.util.Scanner;

public class TesteGeral {
    public static void main (String arg[]){

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o nome do time1: ");       
        String nomeTime1 = entrada.next();
        
        System.out.print("Digite a idade do Clube: ");       
        int idadeClube1 = entrada.nextInt();
        
        System.out.print("Digite o número de jogadores do clube: ");        
        int quantJogadores1 = entrada.nextInt(); 
               
        System.out.print("Digite o nome do time2: ");       
        String nomeTime2 = entrada.next();
        
        System.out.print("Digite a idade do Clube: ");       
        int idadeClube2 = entrada.nextInt();
        
        System.out.print("Digite o número de jogadores do clube: ");        
        int quantJogadores2 = entrada.nextInt(); 
        
        System.out.print("Digite a quantidade de Arbitros da partida: ");       
        int quantArbitros = entrada.nextInt();
        
        System.out.print("Digite a quantidade de Gol da partida: ");        
        int quantGol = entrada.nextInt();
                
        Time time1 = new Time(nomeTime1, idadeClube1, quantJogadores1);
        Time time2 = new Time(nomeTime2, idadeClube2, quantJogadores2);
        PartidaFutebol campeonato = new PartidaFutebol(quantArbitros, quantGol);
        
        System.out.println("Time: "+time1.getNomeTime()+"/nIdade do Clube: "+time1.getIdadeClube()+"\nQuantidade de Jogadores do Clube: "+time1.getNJogadores());
        System.out.println("Time: "+time2.getNomeTime()+"/nIdade do Clube: "+time2.getIdadeClube()+"\nQuantidade de Jogadores do Clube: "+time2.getNJogadores());
        System.out.println("Quantidade de Arbitros da partida: "+campeonato.getQuantArbitros()+"\nQuantidade de Gol da partida: "+campeonato.getQuantGol());
    }
}
