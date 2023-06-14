package Lesson3OOP;

public class Element {
    Object data;
    private Element next;
    private Element previous;

    public Element(Object data) {
        this.data = data;
    }
    public Object getData() {
        return data;
    }

    public Element getNext() {
        return next;
    }

    public Element getPrevious() {
        return previous;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public void setPrevious(Element previous) {
        this.previous = previous;
    }
}
