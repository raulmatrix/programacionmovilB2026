
package programovilb02;


public class PrograMovilB02 {
   
    public static void main(String[] args) {
        
        //while
        /*int valor = 10;
        while(valor<=20){
            System.out.println(""+valor);
            valor++;
        }
        
        //do while
        do{
            System.out.println("Ingreso a Do");
        }while(valor<5);*/
        
        
        //arreglos
        
        int edades[]=new int[5];
        
        
        edades[0]=20;
        edades[1]=25;
        edades[2]=23;
        edades[3]=100;
        edades[4]=40;
        int mayor=edades[0];
        for(int i=0;i<edades.length;i++){
            if(edades[i]>mayor){
                
                mayor=edades[i];
            }
        }
        System.out.print("El mayor es: "+mayor);
        
        System.out.println("La sumas es: "
                +sumar(5,4));
        
    }
    
    public static int sumar(int dato1, int dato2){
        return dato1+dato2;
    }
    
}
