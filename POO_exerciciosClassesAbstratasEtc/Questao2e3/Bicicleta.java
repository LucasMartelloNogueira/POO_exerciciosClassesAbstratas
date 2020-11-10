package POO_exerciciosClassesAbstratasEtc.Questao2e3;

public class Bicicleta implements CarbonFootprint{
    private String cor;
    private int tamanhoQuadro;

    public Bicicleta(String cor, int tamanhoQuadro){
        this.cor = cor;
        this.tamanhoQuadro = tamanhoQuadro;
    }

    public String getCor(){
        return this.cor;
    }

    public int getTamanhoQuadro(){
        return this.tamanhoQuadro;
    }

    public void mudarCor(String novaCor){
        this.cor = novaCor;
    }

    //bicicleta nao emite carbono
    public float getCarbonFootprint() {
        return 0;
    }

    public void exibirInfo(){
        System.out.println("classe: Bicicleta / cor da bicicleta: "+ this.cor);
    }
}
