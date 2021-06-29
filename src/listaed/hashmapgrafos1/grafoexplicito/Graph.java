package listaed.hashmapgrafos1.grafoexplicito;

public class Graph<T extends Comparable<T>> {
    private ImplementedList<Vertex<T>> vertices;
    private ImplementedList<Edges<T>> arestas;

    public Graph(){
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

    public String toString() {
        String s = "";
        for (int i =0; i< vertices.size();i++) {
            s += String.format("(%s)\n",NodesPointingTo(vertices.get(i)));
        }
        return s;
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
        return vertex.getValor() + " [" + r + "]";
    }
}
