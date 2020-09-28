package hamilton_orientacao_objeto;

import java.util.Scanner;

public class TesteJogador {
    public static void main (String arg[]){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a idade do Jogador1: ");       
        int idade1 = entrada.nextInt();
        
        System.out.print("Digite o nome do Jogador1: ");        
        String nome1 = entrada.next(); 
        
        
        System.out.print("Digite a idade do Jogador2: ");       
        int idade2 = entrada.nextInt();
        
        System.out.print("Digite o nome do Jogador2: ");        
        String nome2 = entrada.next();
                
        Jogador jogador1 = new Jogador(idade1, nome1);
        Jogador jogador2 = new Jogador(idade2, nome2);
        

        //jogador1.setIdade(30);
        //jogador1.setNome ("Carlos");

        //jogador2.setIdade(40);
        //jogador2.setNome ("Edu");
        
        
        System.out.println("Idade: "+jogador1.getIdade()+"\nNome: "+jogador1.getNome());
        
        System.out.println("Idade: "+jogador2.getIdade()+"\nNome: "+jogador2.getNome());
    } 
}