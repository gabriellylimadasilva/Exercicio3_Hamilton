
package hamilton_orientacao_objeto;

public class Time {
    private String nomeTime;
    private int idadeClube;
    private int nJogadores;

    public Time (String t, int c, int j)
    {
        nomeTime = t;
        idadeClube = c;        
        nJogadores = j;                    
    }
        public void setNomeTime(String t)
    {
        nomeTime = t;
    }
    public String getNomeTime(){
        return nomeTime;
    }
    public void setIdadeClube(int c)
    {
        idadeClube = c;
    }
    public int getIdadeClube(){
        return idadeClube;
    }
    public void setNJogadores(int j)
    {
        nJogadores = j;
    }
    public int getNJogadores() {
        return nJogadores;   
    }
}