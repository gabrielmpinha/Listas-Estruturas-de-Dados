package listaed.arvores.contarfolhas;

public class Result {
    public static int contaFolha(String a,ArvoreBi<String>arvore) {
        String[] elementos = a.split(" ");
        for(String elemento : elementos){
            arvore.inserir(elemento);
        }
        return arvore.contarFolhas();
    }
}
