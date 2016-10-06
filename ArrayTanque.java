package unidad2;

/**
 *Universidad Tecnologiaca del Norte de Gunajuato
 * Materia: Estructura de Datos.
 * Unidad 2
 * Profesor: Jose Eduardo Barrientos.
 * Alumno: christian ivan carreon moya.
 * Grupo: Gsi-1241.
 * 
 */
public class ArrayTanque {
    

    private static int[][] cantidad;

    public static int[][] defineArreglo() {   //Declarar  Arreglo
        int[][] mostrar = {{25, 20, 20, 50, 50, 30},
        {20, 15, 15, 90, 80, 90},
        {15, 10, 10, 40, 30, 40}, //{1,2,3,4,5,6}
    };
        //cantidad=mostrar;
        cantidad = mostrar;
        return mostrar;
    }

    public static String mostrarDatos(int mostrar[][]) {  //Inicializa el metodo para los datos
        String result = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                result = result + mostrar[i][j] + " , ";
            }
            result = result + "\n";
        }
        return result;
    }

    public static void sumaColumnas(int mostrar[][]) {   //Inicializara el metodo para que realice la suma
        System.out.println("La suma de las columnas es:");
        double suma = 0.0;
        for (int i = 0; i < 3; i++) {
            suma = 0;
            for (int j = 0; j < 6; j++) {
                suma = suma + mostrar[i][j];

            }
            System.out.println("La suma es igual a:" + suma);

        }

    }

    public static void sumaFilas(int mostrar[][]) {   //en este metodo se realizara la sume de filas.
        System.out.println("");
        System.out.println("La suma De las Filas es:");
        double suma = 0.0;
        for (int i = 0; i < 6; i++) {
            suma = 0;
            for (int j = 0; j < 3; j++) {
                suma = suma + mostrar[j][i];

            }
            System.out.println("La suma es igual a:" + suma);
        }
    }

    public static void main(String[] args) {
        System.out.println(mostrarDatos(defineArreglo()));
        ArrayTanque ejer = new ArrayTanque();

        sumaFilas(cantidad);   //mostrara en consola el resultado.
        sumaColumnas(cantidad);

    }

}  
   