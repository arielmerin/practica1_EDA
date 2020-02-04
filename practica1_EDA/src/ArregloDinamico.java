/**
 *
 * @author Luis Manuel Martínez Dámaso
 */
//import org.omg.CORBA.Object;

import java.util.Iterator;


public class ArregloDinamico<T> implements Iterable<T> {

    private T[] arreglo;
    private int elementos;

    public T[] getArreglo() {
        return arreglo;
    }

    public int getElementos() {
        return elementos;
    }

    /**
     * No importa el nombre que se le ponga a la clase, solo es para fines didácticos
     * @param <T>
     */
    private class Iterador<T> implements Iterator<T> {

        /**
         * Es una convención, poner siguiente, es el pivote que indicará donde buscar
         * Permitira saber donde estamos iterando
         */
        private int siguiente;

        public Iterador() {
            this.siguiente = 0;
        }

        @Override
        public boolean hasNext() {
            return elementos > siguiente;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T aux = (T) arreglo[siguiente];
                siguiente++;
                return aux;
            }else {
                return null;
            }
        }

        @Override
        public void remove() {
            /**
             * Nuncahay que implementar este método, no tiene sentido en la encapsulacion
             */
            Iterator.super.remove();
        }

    }

    /**
     * Constructor por omisión
     */
    public ArregloDinamico() {
        /**
         * Crear un arreglo de este tamaño
         */
        this(2);
    }

    /**
     * Constructor que recibe el tamaño con el cual queremos inicializar el
     * arreglo dinámico.
     *
     * @param n
     */
    public ArregloDinamico(int n) {
        arreglo = (T[])new Object[n];
        elementos = 0;
        /**
         * Crear un arreglo de este tamaño
         */
    }

    /**
     * Método para insertar un elemento al final del arreglo dinamico. Si el
     * arreglo no tiene espacio, crecer el arreglo al doble de tamaño.
     *
     * @param elem
     */
    public void agrega(T elem) {
        /**
         * No debe de haber huecos en el arreglo
         * si se nos acaba el espacio hay que crecer el arreglo
         */
        if (elementos == arreglo.length-1){
            T[] a = (T[])new Object[elementos+2];
            for (int i = 0; i < arreglo.length ; i++) {
                a[i] = arreglo[i];
            }
            this.arreglo = a;
        }
        this.arreglo[elementos] = elem;
        elementos++;
    }

    /**
     * Método para acceder al elemento n-esimo del arreglo dinámico. El método
     * debe devolver el elemento buscado. Si no existe elemento n-esimo,
     * devolver null.
     *
     * @param n
     * @return
     */
    public T busca(int n) {
        if (n < elementos && arreglo[n] != null){
            return arreglo[n];
        }else {
            return null;
        }
    }

    /**
     * Método para eliminar al elemento n-esimo del arreglo dinámico, no debe
     * haber espacios sin elementos. El método debe devolver el elemento
     * eliminado. Si no existe elemento n-esimo, devolver null.
     *
     * @param n
     * @return
     */
    public T elimina(int n) {
        /**
         * Tenemos que borrar el primer elemento, luego de la posición donde se elimina hay que volver a pegar
         * hay que recorrer los elementos
         */
        T result = arreglo[n];
        T[] aux = (T[])new Object[elementos];
        for (int i = 0; i < n; i++){
            aux[i] = arreglo[i];
        }
        for (int i = n +1; i < elementos; i++){
            aux[i-1] = arreglo[i];
        }
        arreglo = aux;
        elementos--;


        return result;
    }

    /**
     * Método para saber si un elemento esta en el arreglo dinámico, devuelve
     * true si esta en el arreglo, false en otro caso.
     *
     * @param elem
     * @return
     */
    public boolean contiene(T elem) {
        /**
         * == sirve para localidad de memoria y el .equals() para comparar
         */
        for (int i = 0; i < elementos; i++){
            if (busca(i).equals(elem)){
                return true;
            }
        }
        return false;
    }
    /**
     *
     * @param <T>
     * @param array
     */

    public static <T extends Comparable<T>> void quickSort(ArregloDinamico<T> array) {
        quickSort(array.arreglo, 0, array.elementos);
    }

    /**
     * Se pone esta parte para que entienda que los cpmparables son de tipo T y así ahorrarnos el cast
     * si en algún momento fuera necesario
     * @param a
     * @param ini
     * @param fin
     * @param <T>
     */

    public static <T extends Comparable<T>> void quickSort(T[] a, int ini, int fin) {
        T pivote =  a[ini];
        int i = ini +1;
        int j = fin;

        while (i < j){
            if (a[i].compareTo(pivote) > 0){
                i++;
            }else if (pivote.compareTo(a[i]) > 0 ){
                j--;
            } else {
                T aux = a[i];
                a[i] = a[j];
                a[i] = aux;
            }
        }
        a[ini] = a[i-1];
        a[i -1] = pivote;
        
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new Iterador();
    }

    /**
     * Método para representar el arreglo en una cadena.
     *
     * @return
     */
    @Override
    public String toString() {
        /**
         * tiene que regresar esto
         */
        StringBuilder std = new StringBuilder();
        Iterador it = new Iterador();
        while (it.hasNext()){
            std.append(it.next() + ", ");
        }
        String result = "";
        if (std.length() > 1){
            result = std.substring(0,std.length() - 2);
        }
        return "[" + result + "]";
    }
}

/**
 * usuario:     sarojasr
 * contraseña:  du0N.Inc1
 * ok pues las instrucciones fueron que pusiera mi arreglo de tipo object y que luego en el método to string hiciera un for nomal, lo vamos a intentar a ver qué pasa
 *
 *
 */
