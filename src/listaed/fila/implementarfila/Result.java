package listaed.fila.implementarfila;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Result {
    public static void parseListElements(List<String> operationsList) {
        Fila queue = new Fila(4);


        for(Iterator<String> iter = operationsList.iterator();
            iter.hasNext();) {

            String s = iter.next();

//                match int inside parenthesis
            Matcher m = Pattern.compile("\\(([^)]+)\\)").matcher(s);
            Integer elem = null;

            if(m.find()) {
                elem = Integer.parseInt(m.group(1));
            }

            String op = s.substring(0, 3);

            switch (op) {
                case "add":
                    if(queue.inserir(elem))
                        System.out.println(queue.imprimirFila());
                    break;

                case "pee":
                    System.out.println(queue.peek());
                    break;

                case "rem":
                    System.out.println(queue.remover());

                    break;

                default:
                    break;
            }
        }

    }
}
