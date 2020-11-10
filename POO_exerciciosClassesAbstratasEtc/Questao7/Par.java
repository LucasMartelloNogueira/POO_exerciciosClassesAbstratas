package POO_exerciciosClassesAbstratasEtc.Questao7;

public class Par<F, S> {
    private F primeiro;
    private S segundo;

    public F getPrimeiro(){
        return this.primeiro;
    }

    public void setPrimeiro(F novoPrimeiro){
        this.primeiro = novoPrimeiro;
    }

    public S getSegundo(){
        return this.segundo;
    }

    public void setSegundo(S novoSegundo){
        this.segundo = novoSegundo;
    }
}
