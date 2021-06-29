package listaed.recursao;

public class ConverterDecimal {


    public static int convertToDecimal(String inputNumber, int base) {
        if(inputNumber.isEmpty())
            return 0;
        else{
            int algarismoConvertido;
            int potenciaDeDez = (int) Math.pow(base, inputNumber.length()-1);
            if(Character.isDigit(inputNumber.charAt(0))){
                algarismoConvertido = (Character.getNumericValue(inputNumber.charAt(0)) * potenciaDeDez);
            }
            else{
                algarismoConvertido = (Character.toUpperCase(inputNumber.charAt(0)) - 55) * potenciaDeDez;
            }

            return algarismoConvertido + convertToDecimal(inputNumber.substring(1), base);
        }

    }



}
