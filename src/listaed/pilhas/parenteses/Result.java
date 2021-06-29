package listaed.pilhas.parenteses;

public class Result {

    public static boolean contBrackets(String input) {
        boolean r = true;
        Pilha pilha = new Pilha();

        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(c == '(' || c == '[' || c == '{')
                pilha.push(c);
            else if(c == ')' || c == ']' || c== '}'){

                if(hierarquia(pilha.top()) == hierarquia(c) && !pilha.isEmpty()){
                    pilha.pop();
                }
                else {
                    r = false;
                    break;
                }
            }

        }
        if(!pilha.isEmpty())
            r = false;
        return r;
    }

    private static int hierarquia(Character elemento){
        int r= 0;
        switch (elemento){
            case '(': case ')': r = 1; break;
            case '[': case ']': r = 2; break;
            case '{': case '}': r = 3; break;
        }
        return r;
    }

}
