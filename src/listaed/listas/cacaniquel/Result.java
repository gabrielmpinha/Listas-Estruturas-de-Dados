package listaed.listas.cacaniquel;

public class Result {

    static ListaCircular lc1 = new ListaCircular();
    static ListaCircular lc2 = new ListaCircular();
    static ListaCircular lc3 = new ListaCircular();

    //Preencha os tambores utilizando as instancias de listas e os parametros recebidos
    public static void preencherTambores(String[] tambor1,String[] tambor2,String[] tambor3){

        for(int i = 0; i < tambor1.length; i++){
            lc1.inserir(tambor1[i]);
        }
        for (int j = 0; j < tambor2.length; j++){
            lc2.inserir(tambor2[j]);
        }
        for(int k = 0; k < tambor3.length; k++){
            lc3.inserir(tambor3[k]);
        }

    }


    //FAZER
    public static String girarTambores(int nDesloc1, int nDesloc2, int nDesloc3) {
        String resultado;

        //use alguma estrategia para a lista apontar pro proximo elemento, faça isso para cada lista
        //pode usar laços de repetição

        lc1.selecionarElemento(nDesloc1);
        lc2.selecionarElemento(nDesloc2);
        lc3.selecionarElemento(nDesloc3);
        resultado = lc1.getElementoSelecionado() + " " + lc2.getElementoSelecionado() + " " + lc3.getElementoSelecionado();

        //quando terminar de girar os tambores
        //1. pegue a posição atual de cada lista
        //2. concatene as String com espaços entre elas -> tambor1 + space + tambor2 + space + tambor3
        return resultado;
    }

}
