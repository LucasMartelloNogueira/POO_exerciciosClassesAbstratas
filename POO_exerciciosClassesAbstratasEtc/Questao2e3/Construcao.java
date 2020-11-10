package POO_exerciciosClassesAbstratasEtc.Questao2e3;

public class Construcao implements CarbonFootprint{
    private int numeroDePessoas;
    private float gastoDeEnergia;
    private float emissaoCarbonoPorKwh;

    public Construcao(int numeroDePessoas, float gastoDeEnergia, float emissaoCarbonoPorKwh){
        this.numeroDePessoas = numeroDePessoas;
        this.gastoDeEnergia = gastoDeEnergia;
        this.emissaoCarbonoPorKwh = emissaoCarbonoPorKwh;
    }

    public int getNumeroDePessoas(){
        return this.numeroDePessoas;
    }

    public float getGastoDeEnergia(){
        return this.gastoDeEnergia;
    }

    // retorna quantidade em gramas de Carbono por QuiloWatthora de energia
    public float getEmissaoCarbonoPorKwh(){
        return this.emissaoCarbonoPorKwh;
    }

    public float getCarbonFootprint(){
        float emissaoCarbono = getGastoDeEnergia() * getEmissaoCarbonoPorKwh();
        return emissaoCarbono;
    }

    public void exibirInfo(){
        System.out.println("classe: Construcao / quantidade de pessoas: " + this.numeroDePessoas);
    }
}
