public class Main {
    public static void main(String[] args) {
        ArregloDinamico<Integer> arregloDinamico = new ArregloDinamico<>();
        arregloDinamico.agrega(541);
        arregloDinamico.agrega(948);
        arregloDinamico.agrega(84);
        arregloDinamico.agrega(2);

        String[] aux = {"r","a","h","e","k"};
        for (String s:aux){
            System.out.println(s);
        }


        //System.out.println(arregloDinamico);
/**
        ArregloDinamico<String> arregloDinamic = new ArregloDinamico<>(3);
        arregloDinamic.agrega("Ari1");
        arregloDinamic.agrega("Ari2");
        arregloDinamic.agrega("Ari3");
        //arregloDinamic.agrega("Ari4");
 */
        System.out.println(arregloDinamico);
        ArregloDinamico.quickSort(aux,0,4);
        for (String s:aux) {
            System.out.println(s);
        }

        System.out.println(arregloDinamico);

/**
        if (arregloDinamico.contiene("Arielin3")){
            System.out.println("Sí lo encontró");
        }*/


    }
}
