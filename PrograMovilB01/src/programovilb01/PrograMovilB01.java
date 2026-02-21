
package programovilb01;

public class PrograMovilB01 {

   
    public static void main(String[] args) {
       //tipado 
       /*int edad = 15;
       boolean estado = true;
       
       //cadenas
       String frase = "Bienvenido a Incos Nocturno";
       
       System.out.println("salto de linea");//una sola linea
       System.out.print("una linea");//una sola linea
       
        System.out.println("Tamaño de la cadena: "+frase.length());
        System.out.println("Caracter posicion 1: "+ frase.charAt(1));
    */
       
       //ejercicio 1
       int dado1 = 5;
       int dado2 = 6;
       int dado3 = 6;
       int aux = 0;
       
       if(dado1==6){
           aux++;
       }
       if(dado2==6){
           aux++;
       }if(dado3==6){
           aux++;
       }
       //salida de resultados
       if(aux==1){
           System.out.println("Regular");
       }else
       if(aux==2){
           System.out.println("Muy Bien");
       }else
       if(aux==3){
           System.out.println("Excelente");
       }else{
           System.out.println("Pesimo");
       }
       
       //ejercicio 2 - for
       int fila = 4;
       int col = 4;
       
       /*
       1 2 3 4 5 
       2 4 6 8 10
       3 6 9 12 15
       */
       
       for(int i=1;i<=fila;i++){
           for(int j=1;j<=col;j++){
               if(j<col)
               {
                  System.out.print(i*j+"-"); 
               }
               else
                   System.out.print(i*j);
           }
           System.out.println("");
       }
       
       
       
       
       
       
       
       
       
       /*if((dado1==6)&&(dado3==6)&&(dado2==6)){
           System.out.println("Excelente");
       }else if(((dado1!=6)||(dado2!=6))||(dado3!=6)){
               System.out.println("Muy Bien");
       }else if((dado1==6)||(dado2==6)||(dado3==6)){
           System.out.println("Regular");
       }else{
           System.out.println("Pesimo");
       }*/
       
       
        
    }
    
}
