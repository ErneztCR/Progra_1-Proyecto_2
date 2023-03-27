package Proyecto_2_Calculadora;

public class Elevado {
    float valor1, valor2, total;

    public Elevado(float v1, float v2) {
        this.valor1 = v1;
        this.valor2 = v2;
    }
  
    public Elevado(){}
    
    public  float Eleva(){
        total = (float) Math.pow(valor1, valor2); 
        return total;
    }
    
}
 