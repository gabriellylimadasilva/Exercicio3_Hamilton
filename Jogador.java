/*
1. Escreva uma classe para representar jogadores de futebol. Ela deve ter ao menos dois atributos, ambos encapsulados. Adicione também dois métodos.

2. Escreva uma classe de teste que:

2.1 Instancia dois jogadores.
2.2 Obtém valores para seus atributos e os atribui adequadamente.
2.3 Chama cada um dos métodos que você criou.
2.4 Exibe os valores das variáveis, usando os métodos getters.

3. Rescreva a classe do exercício 1 adicionando a ela um construtor que recebe valores a serem atribuídos às duas variáveis de instância da classe Jogador.

4. Note que a classe de teste deixou de funcionar após a adição do construtor. Faça os ajustes necessários para que ela volte a funcionar.

5. Escreva uma classe para representar um time do campeonato brasileiro. Quais tributos ela tem? Escreva pelo menos dois, ambos encapsulados.

6. Escreva uma classe para representar uma partida do campeonato brasileiro. Escolha atributos e métodos que lhe pareçam razoáveis.

7. Em uma classe de teste geral, instancie alguns times e partidas e chame seus métodos.

 */
package hamilton_orientacao_objeto;

public class Jogador {
    private int idade;
    private String nome;
    
    public Jogador (int i, String n)
    {
        idade = i;
        nome = n;                    
    }
    public void setIdade(int i)
    {
        idade = i;
    }
    public int getIdade()
    {   
        return idade;
    }
    public void setNome(String n)
    {
        nome = n;
    }
    public String getNome()
    {
        return nome;
    }
}
