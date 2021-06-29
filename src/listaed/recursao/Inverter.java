package listaed.recursao;

public class Inverter {
    public static String fun(String s) {

        if(s.length()<=1){
            return s;
        }

        else{
            return fun(s.substring(1)) + s.charAt(0);
        }

    }
}
