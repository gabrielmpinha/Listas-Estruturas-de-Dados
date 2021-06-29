package listaed.pilhas.uniao;

public class Result {

    public static Stack createStack(String phrase) {
        Stack rStack = new Stack();
        String[] inputs = phrase.split(" ");
        for (String input : inputs) {
            rStack.push(input);
        }
        return rStack;
    }


    public static void joinStacks(Stack stackA, Stack stackB) {
        Stack temp = new Stack();

        while (stackA.size() != 0)//COLOCA OS ELEMENTOS DE A NO TEMP, ELES VAO FICAR INVERTIDOS LA
            temp.push(stackA.pop());

        while(stackB.size() != 0)//COLOCA OS ELEMENTOS DE B EM A, ELES VAO FICAR EM ORDEM CERTA LA
            stackA.push(stackB.pop());

        while (temp.size() != 0)//COLOCA OS ELEMENTOS DE TEMP EM B PARA DESINVERTER
            stackB.push(temp.pop());

        while (stackB.size() != 0) //COLOCA OS ELEMENTOS DE B EM A, ELES ENTRAM EM ORDEM CERTA
            stackA.push(stackB.pop());


    }

}
