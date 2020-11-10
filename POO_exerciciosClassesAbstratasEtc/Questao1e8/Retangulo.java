package POO_exerciciosClassesAbstratasEtc.Questao1e8;

public class Retangulo extends FormaGeometrica{
    
    void calcularArea(float lado1, float lado2){
        float area = lado1 * lado2;
        this.area = area;
    }

    void calcularPerimetro(float lado1, float lado2){
        float perimetro = 2*lado1 + 2*lado2;
        this.perimetro = perimetro;
    }
}
