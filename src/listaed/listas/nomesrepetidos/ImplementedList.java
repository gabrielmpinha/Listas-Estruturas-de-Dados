package listaed.listas.nomesrepetidos;

public class ImplementedList {

    private static Node elemento;
    private static int tamanhoLista = 0;

    public static void addLista(String value){

        String[] nomes = value.split("\n");

        int tamanhoNomes = 0;

        while (tamanhoNomes < nomes.length) {
            if (elemento == null) {
                elemento = new Node(nomes[tamanhoNomes]);
                tamanhoLista++;
            } else {
                if(checarInedito(nomes[tamanhoNomes])) {
                    Node temp = elemento;
                    while (temp.getP() != null)
                        temp = temp.getP();
                    temp.setP(new Node(nomes[tamanhoNomes]));
                    tamanhoLista++;
                }
            }

            tamanhoNomes++;
        }

    }

    private static boolean checarInedito(String novoNome){
        boolean r = true;
        Node temp = elemento;
        String[] novoNomeDividido = novoNome.split(" ");
        for(int i = 0; i < tamanhoLista; i++){

                for(int k = 0; k < novoNomeDividido.length; k++) {
                    if (temp.getE().toLowerCase().contains(novoNomeDividido[k].toLowerCase())) {
                        r = false;
                    }
                    else{
                        r = true;
                        break;
                    }
                }
            temp = temp.getP();

        }

        return r;
    }

    public static int getTamanhoLista(){
        return tamanhoLista;
    }




    private static void remover(Node nomeRemover) {
        if (tamanhoLista != 0) {
            if (elemento == nomeRemover) {
                elemento = elemento.getP();
                tamanhoLista--;
            } else {
                Node temp = elemento;
                while (temp.getP() != null) {
                    if (temp.getP()== nomeRemover) {
                        temp.setP(temp.getP().getP());
                        tamanhoLista--;
                        break;
                    } else {
                        temp = temp.getP();
                    }
                }
            }
        }
    }


//    private static void remover(String nomeRemover) {
//        if (tamanhoLista != 0) {
//            if (elemento.getE().equalsIgnoreCase(nomeRemover)) {
//                elemento = elemento.getP();
//                tamanhoLista--;
//            } else {
//                Node temp = elemento;
//                while (temp.getP() != null) {
//                    if (temp.getP().getE().equalsIgnoreCase(nomeRemover)) {
//                        temp.setP(temp.getP().getP());
//                        tamanhoLista--;
//                        break;
//                    } else {
//                        temp = temp.getP();
//                    }
//                }
//            }
//        }
//    }

    public static String listaToString(){
        String lista = "";
        Node temp = elemento;
        for(int i = 0; i < tamanhoLista; i++){
            lista = lista + temp.getE() + "\n";
            temp = temp.getP();
        }
        return lista;
    }

}
