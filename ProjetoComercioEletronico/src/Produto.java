
public class Produto {

	private int codigo;
	private String descricao;
    private double preco;
    
    public Produto(int codigo, String descricao, double preco) {
    	this.codigo = codigo;
    	this.descricao = descricao;
    	this.preco = preco;
    	
    }

    public void setCodigo(int codigo) {
    	this.codigo = codigo;
    }
    
    public int getCodigo() {
    	return codigo;
    }
    
    public void setDescricao(String descricao) {
    	this.descricao = descricao;
    }
    
    public String getDescricao() {
    	return descricao;
    }
    
    public void setPreco(double preco) {
    	this.preco = preco;
    }
    
    public double getPreco() {
    	return preco;
    }
    
    public void mostrarAnuncio() {
    	System.out.println("=======Produtos=========");
    	System.out.println(codigo+" = "+descricao);
    	System.out.printf("R$ %.2f\n", preco);
    }
    
    
    public void aplicarDesconto(double percentual) {
    	preco = preco - preco * percentual/100;
    }
    
    public double simularDesconto(double percentual) {
    	double precoSimulado;
    	precoSimulado = preco - preco * percentual/100;
    	return precoSimulado;
    	
    }
}
