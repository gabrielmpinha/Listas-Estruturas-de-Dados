package listaed.listas.conjuntos;

public class Result {

    private static Lista lista = new Lista();

    public static String uniaoConjuntos(String conj1, String conj2) {

        lista.addLista(conj1);
        lista.addLista(conj2);

        return lista.listaToString();
    }
}
