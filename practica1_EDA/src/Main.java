public class Main {
    public static void main(String[] args) {
        ArregloDinamico<Integer> arregloDinamico = new ArregloDinamico<>();
        arregloDinamico.agrega(541);
        arregloDinamico.agrega(948);
        arregloDinamico.agrega(84);
        arregloDinamico.agrega(2);

        Integer[] aux = {54,484,784,5,2,4844,45,59,999,948,99999,3,2,2};
        for (Integer s:aux){
            System.out.println(s);
        }

        System.out.println(arregloDinamico);
        arregloDinamico.quickSort(aux,0,aux.length-1);
        for (Integer s:aux) {
            System.out.println(s);
        }
        System.out.println(arregloDinamico.getClass().getSimpleName());

        System.out.println(arregloDinamico);
        
    }
}
