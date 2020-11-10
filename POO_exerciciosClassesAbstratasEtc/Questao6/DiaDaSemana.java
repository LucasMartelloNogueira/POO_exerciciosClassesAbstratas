package POO_exerciciosClassesAbstratasEtc.Questao6;

public class DiaDaSemana {
    
    DiasSemana diaSemana;

    public boolean ehDiaUtil(){
        
        switch (this.diaSemana){
            
            case DOMINGO:
                return false;
            
            case SEGUNDA:
                return true;

            case TERCA:
                return true;
            
            case QUARTA:
                return true;
            
            case QUINTA:
                return true;
            
            case SEXTA:
                return true;
            
            case SABADO:
                return false;
            
            default:
                return false;
        }
    }
  
}
