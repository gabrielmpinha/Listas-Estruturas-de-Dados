package listaed.pilhas.adega;

public class Result {

    public static String ocasiaoEspecial(Pilha<Vinho> adega) {
        String r = "";
        if(adega.size() != 0) {
            Vinho vinho = adega.pop();
            r = vinho.getNome() + "(" + vinho.getAno() + ")";
        }
        return r;
    }


    public static Pilha<Vinho> inserirVinho(Pilha<Vinho> adega, Vinho novo) {
        Pilha<Vinho> novaPilha = adega;
        Pilha<Vinho> temp = new Pilha<Vinho>();

        if(novo.getAno() < novaPilha.top().getAno()){
            while (novaPilha.size() > 0 && novo.getAno() < novaPilha.top().getAno()){
                temp.push(novaPilha.pop());
            }
            novaPilha.push(novo);
            while (temp.size() != 0){
                novaPilha.push(temp.pop());
            }
        }else {
            novaPilha.push(novo);
        }
        return novaPilha;
    }



}
