package POO_exerciciosClassesAbstratasEtc.Questao1e8;

public class Triangulo extends FormaGeometrica{
    
    void calcularArea(float base, float altura){
        float area = base * altura / 2;
        this.area = area;
    }

    void calcularPerimetro(float lado1, float lado2, float lado3){
        float perimetro = lado1 + lado2 + lado3;
        this.perimetro = perimetro;
    }
}
