package day18;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        addNode(14, root);
        addNode(23, root);
        addNode(11, root);
        addNode(16, root);
        addNode(22, root);
        addNode(27, root);
        addNode(5, root);
        addNode(15, root);
        addNode(18, root);
        addNode(24, root);
        addNode(150, root);
        addNode(8, root);

        sort(root);
    }

    public static void addNode(int key, Node root) {
        if (key < root.getKey() && root.getLeftSon() == null) {
            Node leftSon = new Node(key);
            root.setLeftSon(leftSon);
        } else if (key < root.getKey() && root.getLeftSon() != null) {
            addNode(key, root.getLeftSon());
        } else if (key >= root.getKey() && root.getRightSon() == null) {
            Node rightSon = new Node(key);
            root.setRightSon(rightSon);
        } else {
            addNode(key, root.getRightSon());
        }
    }

    public static void sort(Node root) {
        if (root.getLeftSon() != null) {
            sort(root.getLeftSon());
            System.out.print(root.getKey() + " ");
        } else {
            System.out.print(root.getKey() + " ");
        }
        if (root.getRightSon() != null) {
            sort(root.getRightSon());
        }

    }
}