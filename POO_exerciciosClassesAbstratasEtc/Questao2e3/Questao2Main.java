package POO_exerciciosClassesAbstratasEtc.Questao2e3;

import java.util.ArrayList;

public class Questao2Main {

    public static void main(String[] args) {
        ArrayList<CarbonFootprint> lista = new ArrayList<>();
    
        Construcao construcao1 = new Construcao(1, 10.0f, 100.0f);
        Construcao construcao2 = new Construcao(10, 100.0f, 100.0f);

        Carro carro1 = new Carro("gasolina", 5.0f, 10.0f);
        Carro carro2 = new Carro("Diesel", 2.0f, 10.0f);

        Bicicleta bicicleta1 = new Bicicleta("preta", 10);
        Bicicleta bicicleta2 = new Bicicleta("vermelha", 12);

        lista.add(construcao1);
        lista.add(construcao2);
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
