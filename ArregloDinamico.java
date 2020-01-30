/**
 *
 * @author Luis Manuel Martínez Dámaso
 */
import java.util.Iterator;

public class ArregloDinamico<T> implements Iterable<T> {

    private T[] arreglo;
    private int elementos;

    private class Iterador<T> implements Iterator<T> {

        private int siguiente;

        public Iterador() {

        }

        @Override
        public boolean hasNext() {
            //Aquí va tu código
            return false;
        }

        @Override
        public T next() {
            //Aquí va tu código
            return null;
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }

    }

    /**
     * Constructor por omisión
     */
    public ArregloDinamico() {
        //Aquí va tu código
    }

    /**
     * Constructor que recibe el tamaño con el cual queremos inicializar el
     * arreglo dinámico.
     *
     * @param n
     */
    public ArregloDinamico(int n) {
        //Aquí va tu código
    }

    /**
     * Método para insertar un elemento al final del arreglo dinamico. Si el
     * arreglo no tiene espacio, crecer el arreglo al doble de tamaño.
     *
     * @param elem
     */
    public void agrega(T elem) {
        //Aquí va tu código
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
        //Aquí va tu código
        return null;
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
        //Aquí va tu código
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
        //Aquí va tu código
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
     * 
     * @param <T>
     * @param a
     * @param ini
     * @param fin 
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
    	//Aquí va tu código
        return null;
    }
}
