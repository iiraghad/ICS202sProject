public abstract class Node {

    protected String name;
    protected Directory parent;

    public Node(String name) {
        this.name = name;
        this.parent = null;
    }

    public String getName() {
        return name;
    }

    public Directory getParent() {
        return parent;
    }

    public void setParent(Directory parent) {
        this.parent = parent;
    }


    public abstract int getSize();
}

