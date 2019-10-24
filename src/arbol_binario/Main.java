package arbol_binario;

public class Main {
    public static void main(String [] args) {

        Tree tree = new Tree();

        tree.insert(99);
        tree.insert(39);
        tree.insert(59);
        tree.insert(129);
        tree.insert(259);
        tree.insert(249);
        tree.insert(279);
        tree.insert(219);
        tree.insert(209);

        tree.countNodes(tree.root);
        System.out.println(tree.totalNodes);

    }
}
