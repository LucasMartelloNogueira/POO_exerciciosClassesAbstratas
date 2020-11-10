package POO_exerciciosClassesAbstratasEtc.Questao5;

public class ItemVenda implements Recebivel{
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public ItemVenda(String produto, int quantidade, double precoUnitario){
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        RegistroRecebimentos.registro.add(this);
    }

    public String getProduto(){
        return this.produto;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double getPrecoUnitario(){
        return this.precoUnitario;
    }

    public double totalizarReceita(){
        return this.getQuantidade() * this.getPrecoUnitario();
    }

    public void exibirInfo(){
        System.out.println("produto: " + this.getProduto());
        System.out.println("quantidade: " + this.getQuantidade());
        System.out.println("preco Unitario: " + this.getPrecoUnitario());
    }
}
