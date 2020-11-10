package POO_exerciciosClassesAbstratasEtc.Questao1e8;

public class Circulo extends FormaGeometrica{
    
    void calcularArea(float raio){
        float area = (float) (Math.PI * Math.pow(raio, 2));
        this.area = area;
    }

    void calcularPerimetro(float raio){
        float perimetro = (float) (2 * Math.PI * raio);
        this.perimetro = perimetro;
    }

}
