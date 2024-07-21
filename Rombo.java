public class Rombo
{
    public static void main(String[] args)
    {
        int a =8;
        String salida = "";
        String salida2= "";
        String espacios = "";

        // Triangulo rectangulo superior izquierdo.
        //-----------------
        // Por cada iteración del bucle for, se imprime una linea del triangulo rectangulo superior izquierdo y derecho.
        for(int i=0; i<a; i++) 
        {
            espacios = "";
            // El bucle for acumula tantos espación como hasta donde el iterador "j" llegue, este iterador
            // decrementa o tiene menos rango a medida que el bucle for principal "i" incrementa. 
            // Pues a a la cota superior"a" del bucle secundario se le resta "i".
            for(int j=0; j<(a-i-1); j++) 
            {
                espacios += "  ";
            }
            // Se incrementa en +1 el simbolo "+ " por cada vez que se itera "i".
            salida+="+ ";
            // Se imprimen los espacios 
            System.out.print(espacios); 
            // Se imprime la salida 
            System.out.print(salida);
            // Se deja un espacio para la linea del otro triangulo rectangulo (Para diferenciarlos)
            System.out.print(" ");

            // Triangulo rectangulo superior derecho
            // ---------------
            salida2 = "";
            // Este bucle secundario se itera tantas veces como el iterador "i" del bucle principal valga.
            for(int k =0; k<=i; k++)
            {
                salida2 += "+ ";
            }
            // Se muestra la salida y se da un salto de linea
            System.out.println(salida2);
            // Se reinicia la salida2.
            salida2 = "";
            // ---------------
        }
        // ---------------
        // Se reinicia las sallidas para reutilizarlas 
        salida2 = "";
        salida = "";
        espacios = "";
        // Se separa una linea los 2 triaungulos superiores de los inferiores
        System.out.println("");
        for(int i=0; i<a; i++)
        {
            // Por cada iteración de "i" las variables se reinicia.
            salida = "";
            espacios = "";
            // Se acumulan tantos espacios como el valor de "i" valga.
            for(int j=1; j<=i; j++)
            {
                espacios += "  ";
            }
            // Se muestran en consola sin salto de linea los espacios
            System.out.print(espacios);

            // El número de simbolos "+ " que se acumulan va dismuyendo a medida que "i" incrementa.
            for(int j=0; j<(a-i); j++)
            {
                salida +="+ ";
            }
            // Se muestra en consola sin salto de linea la salida (cantidad de simbolos "+ ")
            System.out.print(salida);
            // Se deja un espacio para mostrar la siguiente linea del triangulo inferior derecho.
            System.out.print(" ");

            // Triangulo inferior derecho
            salida2 = "";
            // El número de acumulación del simbolo "+ ", disminuye a medida que se incrementa "i". 
            for(int k=0; k<(a-i); k++)
            {
                salida2 += "+ ";
            }
            // Se muestra la salida2, con un salto de linea. 
            System.out.println(salida2);
            

        }
    }
}