
package hamilton_orientacao_objeto;

public class PartidaFutebol {
    public int quantArbitros;
    public int quantBolas;
    
    public PartidaFutebol (int a, int b)
    {
        quantArbitros = a;
        quantBolas = b;                    
    }
    public void setQuantArbitros(int a)
    {
        quantArbitros = a;
    }
    public int getQuantArbitros(){
        return quantArbitros;
    }
    public void setQuantBolas(int b)
    {
        quantBolas = b;
    }
    public int getQuantBolas() {
        return quantBolas;   
    }
}