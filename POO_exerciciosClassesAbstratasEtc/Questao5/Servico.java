package POO_exerciciosClassesAbstratasEtc.Questao5;

public class Servico implements Recebivel{
    private String descricao;
    private int horas;
    private double precoHora;

    public Servico(String descricao, int horas, double precoHora){
        this.descricao = descricao;
        this.horas = horas;
        this.precoHora = precoHora;
        RegistroRecebimentos.registro.add(this);
    }

    public String getDescricao(){
        return this.descricao;
    }

    public int getHoras(){
        return this.horas;
    }

    public double getPrecoHora(){
        return this.precoHora;
    }

    public double totalizarReceita(){
        return this.getHoras() * this.getPrecoHora();
    }

    public void exibirInfo(){
        System.out.println("descricao: " + this.getDescricao());
        System.out.println("horas: " + this.getHoras());
        System.out.println("preco hora: " + this.getPrecoHora());
    }
}
