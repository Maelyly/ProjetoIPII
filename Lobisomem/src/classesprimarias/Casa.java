package classesprimarias;

public class Casa {
    private int estado;
    private String nome;
    
    public Casa()
    {
    	estado = 100;
    	setNome();
    }
    public void setNome()
    {
    	if(estado==100)
    	{
    		 nome = "Sua Casa é de tijolo";
    	}
    	else if(estado<100 && estado>=40)
    	{
    		nome = "Sua Casa é de madeira";
    	}
    	else
    	{
    		nome = "Sua Casa é de palha";	
    	}
    	
    }
    public String getNome()
    {
    	return nome;
    }
    
    public void destruir(int n)
    {
    	estado = estado-n;
    	setNome();
    }
    public void reconstruir()
    {
    	estado = estado+20;
    	setNome();
    }
	public int getEstado() {
		return estado;
	}
	
	
	
	
	
}
