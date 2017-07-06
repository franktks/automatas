package automata1;
/**
 *
 * @author Alejandra
 */
public class Estados {
char caracter;
String q="q0";


void cValida() 
{
    System.out.println("Cadena valida");
}
void cInvalida() 
{
    System.out.println("Cadena no valida");
}

    
String  qo(String cadena1, int posicion)       
{     
    int longitud=cadena1.length();
    if(posicion!=longitud)//permite leer solo las posicione sposibles dentro de la cadena
     caracter=cadena1.charAt(posicion);
    if(posicion==(longitud))//Opcion que rompe la recursividad cuando se termina de leer la cadena
    {
      return q;  
    }
    else
    {
    if(caracter=='a')     
    {
        if("q0".equals(q))
        {
            q="q1";
        }else
        {
            q="q0";
        }  
        qo(cadena1, posicion+1);
    }else 
        { 
          if("q0".equals(q))
            {
            q="q0";
            }else
            {
            q="q1";
            }   
         qo(cadena1, posicion+1); 
        }
     }   
   return q;  
}//fin del metodo
}
