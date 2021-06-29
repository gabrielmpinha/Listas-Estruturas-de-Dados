package listaed.hashmapgrafos1.mensagensecreta;

public class Result {

    public static String encrypt(String dictionary, String phrase) {

        Hashtable hashtable = new Hashtable(23);
        String r = "";
        hashtable.add(" -0");
        String[] valores = dictionary.split(" ");
        for(String i : valores){
            hashtable.add(i);
        }

        for(int i = 0; i < phrase.length(); i++){
            r = r + hashtable.valorEncriptado(Character.toString(phrase.charAt(i))) + " ";
        }

        return r;
    }

}
