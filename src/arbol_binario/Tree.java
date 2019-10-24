package arbol_binario;

class Tree {
    Node root;
    int totalNodes = 0;

    Tree() {
        root = null;
    }

    private static class Node {
        Node father;
        Node right;
        Node left;
        int key;

        Node(int index) {
            key = index;
            right = null;
            left = null;
            father = null;
        }
    }

    public void countNodes(Node n) {
        if (n != null) {
            totalNodes++;
            countNodes(n.left);
            countNodes(n.right);
            System.out.println("index " + n.key);
        }
    }

    public void insert(int i) {
        Node n = new Node(i);

        if (root == null) {
            root = n;
        } else {
            // DE LO CONTRARIO CREAMO UN NO AUXILIAR ARA BUSCAR EN DONDE COLOCARLO, SI A LA DER O IZQ
            Node aux = root;
            //MIENTRAS EL AUXILIAR NO SEA NULO HAGAMOS QUE EL PADRE DEL NODO SEA EL AUXILIAR,
            //ASI VAMOS SUBIENDO EN EL ARBOL
            while (aux != null) {

                n.father = aux;
                //VALIDAMOS, SI EL INDICE ES MAYOR ENTONCES VA A LA DERECHA
                if (n.key >= aux.key) {
                    aux = aux.right;
                } else {
                    //SI NO VA A LA IZQUIERDA
                    aux = aux.left;
                }
            }
            // si la llave del nodo actual es menor al indice del nodo padre entonces enlazo la direccion
            // dentro del arbol
            if (n.key < n.father.key) {
                n.father.left = n;
            } else {
                n.father.right = n;
            }
        }
    }
}
