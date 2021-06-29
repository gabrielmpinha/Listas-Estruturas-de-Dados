package listaed.recursao;

public class Aula {


    public static void main(String[] args) {

        Aula t = new Aula();
        ConverterDecimal converter = new ConverterDecimal();
        Desenho d = new Desenho();

        String x = "a\nb";
        char a = '1';
        System.out.println(d.draw(30, 3, 1));
       // System.out.print(x);
    }





    public static String substituir(String s, char problema, char solucao) {

        if(s.isEmpty())
            return s;
        else {
            char novaLetra;
            if (s.charAt(0) == problema)
                novaLetra = solucao;
            else
                novaLetra = s.charAt(0);
            return novaLetra + substituir(s.substring(1), problema, solucao);
        }
    }





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

    public void alg(int n){

        if(n<10) {
            System.out.println(n);
        }
        else{
            int a = (int) Math.pow(10, String.valueOf(n).length()-1);

            int n2 = (int) (n/(a));

            System.out.println(n2);

            alg((int) (n - n2*(a)));

        }
    }


    public static String fun(String s) {

        if(s.length()<=1){
            return s;
        }

        else{
            return fun(s.substring(1)) + s.charAt(0);
        }

    }

}
/*    public static boolean aux(int number, int cont){

        if(cont < number){
            if(number % cont == 0)
                return false;
            else
                aux(number, ++cont);
        }
           return true;
    }
*/