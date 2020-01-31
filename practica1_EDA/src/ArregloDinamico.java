/**
 *
 * @author Luis Manuel Martínez Dámaso
 */
import java.util.Iterator;

public class ArregloDinamico<T> implements Iterable<T> {

    private T[] arreglo;
    private int elementos;

    /**
     * No importa el nombre que se le ponga a la clase, solo es para fines didácticos
     * @param <T>
     */
    private class Iterador<T> implements Iterator<T> {
        /**
         * Es una convención, poner siguiente, es el pivote que indicará donde buscar
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
                /**
                 * Se supone que no de debería de hacer
                 */
                T aux = (T) arreglo[siguiente];
                siguiente++;
                return aux;
            }else return null;
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
        arreglo = (T[]) new ArregloDinamico[0];
        elementos = 0;
    }

    /**
     * Constructor que recibe el tamaño con el cual queremos inicializar el
     * arreglo dinámico.
     *
     * @param n
     */
    public ArregloDinamico(int n) {
        arreglo = (T[]) new ArregloDinamico[n];
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
        if (elementos == arreglo.length){
            arreglo[elementos-1] = elem;
        }else if (elementos < arreglo.length ){
            ArregloDinamico<T> arreglito = new ArregloDinamico(4);
            arreglito.arreglo[elementos] = elem;
        }
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
        if (n < elementos){
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
        return null;
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
        return false;
    }
    /**
     *
     * @param <T>
     * @param array
     */
    public static <T extends Comparable<T>> void quickSort(ArregloDinamico<T> array) {
        //Aquí va tu código
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
        //Aquí va tu código
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
        if (elementos > 0){

            for(T item: arreglo ){
                String cadena = "[";

            }
        }
        return null;
    }
}

/**
 * usuario:     sarojasr
 * contraseña:  du0N.Inc1
 */
