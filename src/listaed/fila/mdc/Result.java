package listaed.fila.mdc;

public class Result {

    public static int mdc(int number1, int number2) {
        Fila fila = new Fila();
        int divisor = 2;
        int mdc = 1;
        if(number1 > 0 && number2 > 0) { //SE ALGUM DOS DOIS FOR 0 O MDC VAI SER 1
            while (number1 != 1 && number2 != 1){//REPETIR ENQNT OS 2 FOREM DIFERENTES DE 1
                if(number1 % divisor == 0 && number2 % divisor == 0)
                    fila.add(divisor);
                number1 = (number1%divisor==0)? number1/divisor : number1;
                number2 = (number2%divisor==0)? number2/divisor : number2;
                divisor = (number1 % divisor == 0 || number2%divisor == 0)? divisor : divisor+1;
            }
        }

        while(fila.peek() != null){
            mdc = mdc * fila.remove();
        }

        return mdc;
    }
}
