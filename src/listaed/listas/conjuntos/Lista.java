package listaed.listas.conjuntos;

public class Lista {

    private static Node elemento;
    private static int tamanhoLista = 0;
    private static String[] numeros;
    private static int tamanhoString;

    public static void addLista(String value){

        numeros = value.split(" ");//SEPARA POR ESPACO
        tamanhoString = 0;
        while(tamanhoString < numeros.length) {
            if(!checarRepetido(numeros[tamanhoString])) { //SE NAO FOR NUM REPETIDO ELE ADICIONA NA LISTA
                if (elemento == null) {
                    elemento = new Node(numeros[tamanhoString]);
                } else {
                    Node temp = elemento;
                    while (temp.getP() != null) {
                        temp = temp.getP();
                    }
                    temp.setP(new Node(numeros[tamanhoString]));
                }

                tamanhoLista++;
            }
            tamanhoString++;
        }
    }

    private static boolean checarRepetido(String numero) {
        boolean r = false;
        Node temp = elemento;
        for(int i = 0; i < tamanhoLista; i++){
            if(numero.equals(temp.getE())) {
                r = true;
                break;
            }
            temp = temp.getP();
        }
        return r;
    }

    public static String listaToString(){
        String lista = "";
        Node temp = elemento;
        for(int i = 0; i < tamanhoLista; i++){
            lista = lista + temp.getE() + " ";
            temp = temp.getP();
        }
        return lista;
    }

}
