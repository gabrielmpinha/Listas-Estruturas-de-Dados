package listaed.listas;
import listaed.listas.*;
import listaed.listas.cacaniquel.ListaCircular;
import listaed.listas.conjuntos.Lista;
import listaed.listas.gincana.Result;
import listaed.listas.invertida.ListaDinamica;

import java.util.ArrayList;

public class Main {

    private static Result r = new Result();

    private static listaed.listas.conjuntos.Result conjuntos = new listaed.listas.conjuntos.Result();

    private static listaed.listas.nomesrepetidos.Result nomesRepetidos = new listaed.listas.nomesrepetidos.Result();

    private static ListaDinamica listaDinamica = new ListaDinamica();

    private static ListaCircular listaCircular = new ListaCircular();

    public static void main(String[] args) {
//        r.addToOrderedList("arthur");
//        r.addToOrderedList("lucas");
//        r.addToOrderedList("gabriel");
//        r.addToOrderedList("lucas");
//
//        System.out.print(r.orderedListToString());
       // System.out.println(conjuntos.uniaoConjuntos("1 2 3 4 10", "10 11 12 3 2 1 13"));
//
//        System.out.println(nomesRepetidos.attendance("ROdrigo Antonia barRos\n" +
//                "rodriGo\n" +
//                "rOdrigO aNtoNia baRros\n" +
//                "BarRos\n" +
//                "RoDrigo baRRoS\n" +
//                "roDRigO antonia barrOs\n" +
//                "RodrIgo antonia\n" +
//                "rOdRIgo barros\n" +
//                "rOdRigo antoNia\n" +
//                "rodRigo AnTOnIa barRos\n" +
//                "roDrIgo antOnia bArros"));
//        listaDinamica.add(1);
//        listaDinamica.add(2);
//        listaDinamica.add(3);
//        listaDinamica.add(5);
//        listaDinamica.add(4);
//        listaDinamica.add(5);
//        listaDinamica.add(6);
//        listaDinamica.add(7);
//
//        listaDinamica.print();
//        listaDinamica.listaNova().print();
//        listaDinamica.print();
        String[] a = {"aaa","bbb","ccc"};
        listaCircular.inserir("a");
        listaCircular.inserir("b");
        listaCircular.inserir("c");
        listaCircular.inserir("D");
        listaCircular.inserir("e");
        listaCircular.inserir("f");
        listaCircular.inserir("g");
        listaCircular.print();



    }

}
