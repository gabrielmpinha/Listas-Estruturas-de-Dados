package listaed.pilhas.gabarito;

public class Result {

    public static boolean isPalindrome(String phrase) {
        boolean r = true;
        Pilha pilha = new Pilha();
        String reverso = "";
        String naoReverso = "";

        for(int i = 0; i < phrase.length(); i++)
            if(phrase.charAt(i) != ' ')
                pilha.push(phrase.charAt(i));

        while (pilha.size() != 0) {
            naoReverso = pilha.top() + naoReverso;
            reverso = reverso + pilha.pop();
        }

        if(!reverso.equalsIgnoreCase(naoReverso))
            r = false;


        return r;
    }

}
