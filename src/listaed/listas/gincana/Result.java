package listaed.listas.gincana;

public class Result {

    private static NoResult elemento;
    private static int tamanhoLista = 0;

    public static void addToOrderedList(String value) {
        if(elemento == null){
            elemento = new NoResult(value);
            tamanhoLista++;
        }else{
            NoResult temp = elemento;
            int tamanhoListaTemp = tamanhoLista;

            while(tamanhoLista < tamanhoListaTemp+1){//PARAR QUANDO COLOCAR UM ELEMENTO NA LISTA
                //PARA SE FOR COLOCAR NO MEIO DA LISTA
                if((temp.getP() != null && temp.getE().compareToIgnoreCase(value) < 0 && temp.getP().getE().compareToIgnoreCase(value) > 0)){
                    NoResult novo = new NoResult(value);
                    novo.setP(temp.getP());
                    temp.setP(novo);
                    tamanhoLista++;
                }
                //PARA SE FOR O PRIMEIRO DA LISTA
                else if(temp.equals(elemento) && temp.getE().compareToIgnoreCase(value) > 0) {
                    NoResult novoPrimeiro = new NoResult(value);
                    novoPrimeiro.setP(temp);
                    elemento = novoPrimeiro;
                    tamanhoLista++;
                }
                //PARA SE FOR NO FINAL DA LISTA
                else if(temp.getP()==null){
                    temp.setP(new NoResult(value));
                    tamanhoLista++;
                }

                temp = temp.getP();
            }
        }

    }


    public static String orderedListToString() {
        String lista = "";
        NoResult temp = elemento;
        for(int i = 0; i<tamanhoLista; i++){
            lista = lista + temp.getE() + "\n";
            temp = temp.getP();
        }
        return lista;
    }

}