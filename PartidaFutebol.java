
package hamilton_orientacao_objeto;

public class PartidaFutebol {
    public int quantArbitros;
    public int quantGol;
    
    public PartidaFutebol (int a, int g)
    {
        quantArbitros = a;
        quantGol = g;                    
    }
    public void setQuantArbitros(int a)
    {
        quantArbitros = a;
    }
    public int getQuantArbitros(){
        return quantArbitros;
    }
    public void setQuantGol(int g)
    {
        quantGol = g;
    }
    public int getQuantGol() {
        return quantGol;   
    }
}