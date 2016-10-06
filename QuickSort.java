package unidad2;

 import java.util.Random;
import java.util.ArrayList;
/**
 *
  *Universidad Tecnologiaca del Norte de Gunajuato
 * Materia: Estructura de Datos.
 * Unidad 2
 * Profesor: Jose Eduardo Barrientos.
 * Alumno: christian ivan carreon moya.
 * Grupo: Gsi-1241.
 */
public class QuickSort {
  
Random x;
int aux=0;

private static ArrayList <Integer> cambio;

public void cambio( ArrayList loscambios )
{
cambio = new ArrayList( );
for( int i = 0; i < loscambios.size( ); i++ )
{
cambio cambio = (cambio)loscambios.get( i );
cambio.add( cambio );
}
}


public void inicializarVector(int arreglo [])
{ 
x= new Random ();

for(int i=0;i<cambio.size();i++)
{
aux=x.nextInt(20);
arreglo[i]=aux;
}

}

public void imprimirArreglo(int arreglo [])
{
String salida="";
for(int i=0;i<cambio.size();i++)
{
salida+=" "+arreglo[i];
}
System.out.println(salida);
}


public void ordenarQuicksort(int[] vector, int primero, int ultimo){
int i=primero, j=ultimo;

int pivote=vector[(primero + ultimo) / 2];
System.out.println(pivote);
int auxiliar;
String salida="";
do{
while(vector[i]<pivote) i++;
while(vector[j]>pivote) j--;
}
