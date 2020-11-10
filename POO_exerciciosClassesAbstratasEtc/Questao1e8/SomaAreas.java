package POO_exerciciosClassesAbstratasEtc.Questao1e8;

// classe para a questao 8

public class SomaAreas {
    public static float somarAreas(FormaGeometrica[] arr){
        float somaAreas = 0.0f;

        for (FormaGeometrica f : arr){
            somaAreas += f.area;
        }

        return somaAreas;
    }
}
