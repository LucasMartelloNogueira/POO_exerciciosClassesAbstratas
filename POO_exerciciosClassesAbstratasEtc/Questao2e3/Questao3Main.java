package POO_exerciciosClassesAbstratasEtc.Questao2e3;

import java.util.ArrayList;

public class Questao3Main {
    // resposta da pergunta 3-a) 
    // Devido ao fato da classe "Edificio" ser abstrata,
    // caso ela fosse usada no programa da lista (que esta no arquivo "Questao2Main.java")
    // o programa não iria funcionar, pois classes abstratas não podem ser usadas para istanciar objetos,
    // teria que modificiar o programa e usar as subclasses concretas 

    public static void main(String[] args) {
        ArrayList<CarbonFootprint> lista = new ArrayList<>();
    
        Casa casa = new Casa(1, 10.0f, 100.0f);
        Escola escola = new Escola(10, 100.0f, 100.0f);

        Carro carro1 = new Carro("gasolina", 5.0f, 10.0f);
        Carro carro2 = new Carro("Diesel", 2.0f, 10.0f);

        Bicicleta bicicleta1 = new Bicicleta("preta", 10);
        Bicicleta bicicleta2 = new Bicicleta("vermelha", 12);

        lista.add(casa);
        lista.add(escola);
        lista.add(carro1);
        lista.add(carro2);
        lista.add(bicicleta1);
        lista.add(bicicleta2);

        for (CarbonFootprint c : lista){
            c.exibirInfo();
            System.out.println("carbon footprint: " + c.getCarbonFootprint());
            System.out.println("-------------------------------------------");
        }
    }
}
