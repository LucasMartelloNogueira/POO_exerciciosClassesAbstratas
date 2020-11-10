package POO_exerciciosClassesAbstratasEtc.Questao2e3;

public class Carro implements CarbonFootprint{
    private String combustivel;
    private float emissaoCarbonoPorKm;
    private float distanciaPercorrida;

    public Carro(String combustivel, Float emissaoCarbonoPorKm, float distanciaPercorrida){
        this.combustivel = combustivel;
        this.emissaoCarbonoPorKm = emissaoCarbonoPorKm;
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public String getCombustivel(){
        return this.combustivel;
    }

    // retorna emissao de carbono em gramas por kilometro
    public float getEmissaoCarbonoPorKm(){
        return this.emissaoCarbonoPorKm;
    }

    public float getDistanciaPercorrida(){
        return this.distanciaPercorrida;
    }

    public void AlterarCombustivel(String novoCombustivel){
        this.combustivel = novoCombustivel;
    }

    // retorna emissao de carbono total feita pelo carro
    public float getCarbonFootprint(){
        float emissaoCarbono = getEmissaoCarbonoPorKm() * getDistanciaPercorrida();
        return emissaoCarbono;
    }

    public void exibirInfo(){
        System.out.println("classe: Carro / combustivel usado: "+ this.combustivel);
    }
}
