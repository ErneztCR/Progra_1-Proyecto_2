package Proyecto_2_Calculadora;


   public class PI {
    float valor1, total;

    public PI(float v1) {
        this.valor1 = v1;
    }
  
    public PI(){}
    
    public  float Pi(){
        total = valor1 * (float) Math.PI; 
        return total;
    } 
 }
