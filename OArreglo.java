package unidad2;

/**
 *Universidad Tecnologiaca del Norte de Gunajuato
 * Materia: Estructura de Datos.
 * Unidad 2
 * Profesor: Jose Eduardo Barrientos.
 * Alumno: christian ivan carreon moya.
 * Grupo: Gsi-1241.
 */
public class OArreglo {
    
    public static int[] ordenaArreglo (int arre[]){
        int aux;
        for(int i =1; i<(arre.length); i++){
            for(int j = 0; i<arre.length-1;j++){
                if(arre[j]<arre[j+1]){
                    aux = arre[j];
                    arre[j]=arre[j+1];
                    arre[j+1]=aux;
                }
            }
        }
        return arre;
        
    }
    public static String imprimeArreglo(int arre[]){
        String cadena = "";
        for (int i = 0; i<arre.length; i++){
            cadena = cadena + arre[i] + " , ";
        }
        return cadena;
    }
    public static void main(String[] args) {
        int arreglo[]= {4,5,22,10,9,8,5,1,0,-9,5};
        System.out.println("Arreglo Original: " + imprimeArreglo(arreglo));
        System.out.println("Arreglo Ordenado: " + imprimeArreglo(ordenaArreglo(arreglo)));
    }
} 
    
    
   