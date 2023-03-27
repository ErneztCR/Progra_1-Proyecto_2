
package Proyecto_2_Calculadora;


public class Elevado2 {
    float  valor2, total;

    public Elevado2(float v1, float v2) {
        
        this.valor2 = v2;
    }
  
    public Elevado2(){}
    
    public  float Eleva2(){
        total = (float) Math.pow(valor2, 2);
        return total;
    }
}
