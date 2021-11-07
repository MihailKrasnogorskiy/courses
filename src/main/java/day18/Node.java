package day18;

public class Node {
    private int key;
    private Node rightSon;
    private Node leftSon;

    public Node(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setRightSon(Node rightSon) {
        this.rightSon = rightSon;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }

    public Node getRightSon() {
        return rightSon;
    }

    public Node getLeftSon() {
        return leftSon;
    }

}