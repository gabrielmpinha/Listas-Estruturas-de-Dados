package listaed.hashmapgrafos1.mensagensecreta;

public class Hashtable {
    private ListaDinamica<String>[] hashtable;
    private int size;

    public Hashtable(int listSize){
        this.size = 0;
        hashtable = new ListaDinamica[listSize];
        for(int i = 0; i < hashtable.length; i++){
            hashtable[i] = new ListaDinamica<>();
        }
    }

    private int hash(String elemento){
        String[] valores = elemento.split("-");
        return valores[0].hashCode() % this.hashtable.length;
    }

    public void add(String e){
        String[] valores = e.split("-");
        int hash = hash(e);
        if(!contains(e)){
            hashtable[hash].add(e.toLowerCase());
            size++;
        }

    }

    public boolean contains(String e){

        int hash = hash(e);

        return hashtable[hash].contains(e);


    }

    public int valorEncriptado(String valor){
        String letra = valor.toLowerCase();
        Integer r = null;

        int hash = hash(letra);
        for(int i = 0; i < hashtable[hash].size(); i++){
            String[] valores = hashtable[hash].get(i).split("-");
            if(valores[0].equalsIgnoreCase(letra)){
                r = Integer.parseInt(valores[1]);
                break;
            }
        }

        return r;
    }

    public int size(){
        return size;
    }

}
