package listaed.listas.nomesrepetidos;

public class Result {

    private static ImplementedList lista = new ImplementedList();

    public static int attendance(String value) {
        lista.addLista(value);
        //int r = lista.contarNomes();
        System.out.println(lista.listaToString());
        return lista.getTamanhoLista();
    }
}
