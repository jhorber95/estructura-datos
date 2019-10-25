package arbol_binario;

public class Main {
    public static void main(String [] args) {

        Tree tree = new Tree();

        tree.insert(99, "a");
        tree.insert(39, "b");
        tree.insert(59, "c");
        tree.insert(129, "d");
        tree.insert(259, "e");
        tree.insert(249, "f");
        tree.insert(279, "g");
        tree.insert(219, "h");
        tree.insert(209, "i");

        tree.countNodes(tree.root);
        System.out.println(tree.totalNodes);

    }
}
