package unidad2;

/**
 * Universidad Tecnologiaca del Norte de Gunajuato
 * Materia: Estructura de Datos.
 * Unidad 2
 * Profesor: Jose Eduardo Barrientos.
 * Alumno: christian ivan carreon moya.
 * Grupo: Gsi-1241.
 *
 */
import java.util.*;

public class Ahorcado{
 
    String categoria[] = {"SUPERHEROES","CUENTOS DE HADAS"};
 
    String heroes[] = {"BATMAN", "GATUBELA","SUPERMAN", "HULK",
    "EL CHAPULIN COLORADO"} ;
    String cuentos[] = { "CENICIENTA", "BLANCA NIEVES", "CAPERUCITA ROJA",
    "LA BELLA DURMIENTE","LA SIRENITA"};
    // GENERA UNA PALABRA ALEATORIAMENTE DE LOS ARREGLOS DE ARRIBA
    public String generaPalabra(int categoria){
    int n=0;
        n = (int)(Math.random()*4);
        if (categoria == 0)
          return heroes[n];
        else
            return cuentos[n];
 
    }
 
    // CHECA SI LA LETRA ESTA EN LA PALBRA, REGRESA TRUE SI ESTA.
    public boolean checaLetra(char letra, String palabra){
        boolean mensaje=false;
        for(int i=0; i<palabra.length() ;i++){
             if( letra == palabra.charAt(i) ){
               mensaje = true;
               break;
             }
             else{
               mensaje = false;  
             }
        }
        return mensaje;
    }
 
    // SACA LAS LETRAS DIFERENTES QUE TIENE LA PALABRA Y LAS REGRESA COMO SET
    public Set letrasEnPalabra(String palabra){
        Set letras = new HashSet();
        for (int i=0;i<palabra.length() ;i++){
            if(palabra.charAt(i) != ' '){
              letras.add(palabra.charAt(i));
            }
        }
        return letras;
    }
 
    public boolean checaGanaste(Set conjunto, Set correctas){
        if( conjunto.size() == correctas.size()){
           return true;
          }
        else{
             return false;
            }
    }
 
    public boolean checaPerdiste(Set incorrectas, int intentos){
        if (incorrectas.size() == intentos){
        return true;
        }
        else{
    return false;
        }
    }
    // Actualiza la palabra que ve el jugador, el parametro de visible ya no esta 
    
    public String actualizaVisible(Set correctas, String palabra, String visible){
                visible =""; boolean bandera = false;
                Iterator it = correctas.iterator();
                for(int i=0; i<palabra.length() ;i++){
                    while(it.hasNext()){
                        char a = it.next().toString().charAt(0);
                        System.out.println(" "+a+"  "+palabra.trim().charAt(i) );
                        if ( a == palabra.trim().charAt(i) ){
                           visible += a; bandera = true;
                            break;
                        }
                    } 
                    if (bandera == false){
                            visible += "_";
                        } 
                    bandera=false; it = correctas.iterator(); 
               }
        return visible;
    }    
    // Solo para probar si funcionaba, se puede borrar este main.
    public static void main(String args[]){
    String prueba = "TAMAULINAS"; String visible="";
    Set con = new HashSet(); con.add('T'); con.add('A'); con.add('M');con.add('U');
    con.add('L'); con.add('I');con.add('P'); con.add('S');
    Ahorcado ob = new Ahorcado();
    System.out.println(ob.actualizaVisible(con, prueba, visible));
 
    }
}

