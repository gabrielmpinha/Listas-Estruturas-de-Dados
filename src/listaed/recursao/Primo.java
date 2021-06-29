package listaed.recursao;

public class Primo {

    public static boolean isPrime(int number) {
        if(number < 2)
            return false;
        else{
            return primeLoop(number, 2);
        }

    }


    public static boolean primeLoop(int number, int cont){

        if(cont >= number)
            return true;
        else {
            if (number % cont == 0)
                return false;
        }
        return primeLoop(number, ++cont);

    }
}
