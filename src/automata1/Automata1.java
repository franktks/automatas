/*
Mancera Patiño Daniela Alejandra

Diseñar AFD sobre el Σ={a,b}  donde las cadenas
reconocidas contengan una cantidad impar de a's
 
 ejemplo de cadenas
 a, ab, ba, aaa, baaa, aaab
 */
package automata1;

import java.util.Scanner;

public class Automata1 {
public static void main(String[] args) {
   
 Scanner lectura=new Scanner(System.in);
 String cadena,res;
 System.out.println("Ingrese la cadena");
 cadena=lectura.next();
 Estados2 valida=new Estados2();
 res=valida.qo(cadena, 0);
  
 if(res=="q3")
 {
     valida.cValida();
 }else
      {
       valida.cInvalida();
      }
    }
}
