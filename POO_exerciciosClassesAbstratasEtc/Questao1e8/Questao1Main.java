package POO_exerciciosClassesAbstratasEtc.Questao1e8;

public class Questao1Main {
    public static void main(String[] args) {

        //testando que n preciso botar "@override" para sobrescrever os metodos
        //professora, n sei se os seus testes deram erro, mas no minha maquina funcionou
        Retangulo retangulo = new Retangulo();
        Quadrado quadrado = new Quadrado();

        retangulo.calcularArea(2, 3);
        System.out.println("area: " + retangulo.getArea());

        quadrado.calcularArea(2);
        System.out.println("area: " + quadrado.getArea());
    }
}
