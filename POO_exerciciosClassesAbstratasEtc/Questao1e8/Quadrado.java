package POO_exerciciosClassesAbstratasEtc.Questao1e8;

public class Quadrado extends Retangulo{
    
    void calcularArea(float lado){
        float area = lado * lado;
        this.area = area;
    }

    void calcularPerimetro(float lado){
        float perimetro = 4 * lado;
        this.perimetro = perimetro;
    }

    //n sei se é por causa do meu compilador, sistema operacional ou versao do java,
    // mas aparentemente eu n preciso botar o "@override" para sobrescrever os metodos
    // "calcular area" e "calcularPerimetro" herdados da classe Retangulo, isso pode ser
    // provado nos meus testes na classe "Questao1Main.java"
}
