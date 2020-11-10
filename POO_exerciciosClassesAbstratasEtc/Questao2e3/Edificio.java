package POO_exerciciosClassesAbstratasEtc.Questao2e3;

abstract class Edificio implements CarbonFootprint{
    private String tipoDeEdificio;
    private int numeroDePessoas;
    private float gastoDeEnergia;
    private float emissaoCarbonoPorKwh;

    public Edificio(int numeroDePessoas, float gastoDeEnergia, float emissaoCarbonoPorKwh){
        this.numeroDePessoas = numeroDePessoas;
        this.gastoDeEnergia = gastoDeEnergia;
        this.emissaoCarbonoPorKwh = emissaoCarbonoPorKwh;
    }

    public String getTipoDeEdificio(){
        return this.tipoDeEdificio;
    }

    public void setTipoDeEdificio(String nomeTipoEdificio){
        this.tipoDeEdificio = nomeTipoEdificio;
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
        System.out.println("classe: " + this.getTipoDeEdificio() + " / quantidade de pessoas: " + this.numeroDePessoas);
    }
}
