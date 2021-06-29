package listaed.hashmapgrafos1.grafotransposto;

import java.util.List;

public class Grafo<T extends Comparable<T>> {
    private ImplementedList<Vertex<T>> vertices;
    private ImplementedList<Edges<T>> arestas;

    public Grafo(){
        vertices = new ImplementedList<>();
        arestas = new ImplementedList<>();
    }

    public void addEdge(T src, T dst) {
        Vertex<T> vertice1 = new Vertex<>(src);
        Vertex<T> vertice2 = new Vertex<>(dst);
        Edges<T> novaAresta = new Edges(vertice1, vertice2);

        if(!vertices.contains(vertice1))
            vertices.add(vertice1);
        if(!vertices.contains(vertice2))
            vertices.add(vertice2);
        if(!arestas.contains(novaAresta))
            arestas.add(novaAresta);
        ordenarVertices();

    }

    public void transporGrafo(){

        for(int i = 0; i < arestas.size(); i++){
            Vertex<T> origem =  arestas.get(i).getOrigem();
            Vertex<T> destino = arestas.get(i).getDestino();
            arestas.get(i).setOrigem(destino);
            arestas.get(i).setDestino(origem);
        }

    }

    public void imprimirGrafo(){
        String s = "";
        for (int i =0; i< vertices.size();i++) {
            s += String.format("%s\n",NodesPointingTo(vertices.get(i)));
        }
        System.out.println(s);
    }

    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public static void Resultado(List<String> entrada){
        Grafo grafo = new Grafo();
        String[] entradaVertices = entrada.toArray(new String[0]);
        for (int i = 0; i < entradaVertices.length; i++) {
            String vertice = entradaVertices[i].replaceAll("(?:--.*)","");
            String[] arrayLigacoes = entradaVertices[i].replaceAll("^[0-9]-->", "").split(" ");



            for (int j = 0; j < arrayLigacoes.length; j++) {
                if(isNumeric(arrayLigacoes[j]) && isNumeric(vertice)){
                    Integer verticeValue = Integer.parseInt(vertice);
                    Integer ligacao= Integer.parseInt(arrayLigacoes[j]);

                    grafo.addEdge(verticeValue, ligacao);
                }
            }



        }
        grafo.transporGrafo();
        grafo.imprimirGrafo();

    }

    private void ordenarVertices(){
        T temp;
        boolean ordenado = false;

        while (!ordenado) {
            ordenado = true;
            for (int i = 0; i < vertices.size()-1; i++) {
                if (vertices.get(i).compareTo(vertices.get(i + 1)) > 0) {
                    temp = (T)vertices.get(i);
                    vertices.set(i, vertices.get(i + 1));
                    vertices.set(i + 1, (Vertex<T>) temp);
                    ordenado = false;
                }
            }
        }
    }

    public String NodesPointingTo(Vertex vertex) {
        String r = "";
        if(vertices.contains(vertex)){
            for(int i = 0; i < arestas.size(); i++){
                if(arestas.get(i).getOrigem().compareTo(vertex) == 0)
                {
                    if(!r.equals(""))
                        r = r + " ";
                    r = r + arestas.get(i).getDestino().getValor();
                }
            }

        }
        return vertex.getValor() + "-->" + r;
    }
}
