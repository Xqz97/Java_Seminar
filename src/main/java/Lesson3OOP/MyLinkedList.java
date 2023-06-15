package Lesson3OOP;

import java.util.Iterator;

public class MyLinkedList implements Iterable{
    private Element start;
    private Element end;
    private int count = 0;

    @Override
    public Iterator iterator() {
        return new Iterator<Object>() {
            Element firstElement = new Element("0");
            {
                firstElement.setNext(start);
            }
            Element currentElement = firstElement;

            @Override
            public boolean hasNext() {
                return currentElement.getNext() != null;
            }

            @Override
            public Object next() {
                currentElement = currentElement.getNext();
                return currentElement.getData();
            }
        };
    }

    public int size() {
        return count;
    }

    private Element getElement(int index){
        if (index >= count){
            throw new IndexOutOfBoundsException();
        }
        Element result = start;
        for (int i = 1; i <= index; i++){
            result = result.getNext();
        }
        return result;
    }

    public Object get(int index){
        Element element = getElement(index);
        return element.getData();
    }

    public void remove(int index){
        Element currentElement = getElement(index);
        Element nextElement = currentElement.getNext();
        Element previousElement = currentElement.getPrevious();
        if (index == 0){
            start = nextElement;
            if (end == currentElement){
                end = null;
            }
        }
        if (index == count - 1){
            end = previousElement;
            if (start == currentElement){
                start = null;
            }
        }
        count--;
        if (nextElement != null){
            nextElement.setPrevious(previousElement);
        }
        if (previousElement != null){
            previousElement.setNext(nextElement);
        }
    }

    public void add(int index, Object data){
        if (count == index){
            add(data);
            return;
        }
        count++;

        Element currentElement = new Element(data);

        if (index == 0){
            start = currentElement;
        }

        Element nextElement = getElement(index);
        Element previousElement = nextElement.getPrevious();

        currentElement.setNext(nextElement);
        currentElement.setPrevious(previousElement);

        if (previousElement != null) {
            previousElement.setNext(currentElement);
        }

    }

    public void add(Object data){
        count++;
        Element element = new Element(data);
        if (start == null){
            start = element;
            end = element;
            return;
        } else if (end == null) {
            end = element;
            return;
        }
        end.setNext(element);
        element.setPrevious(end);
        end = element;
    }
}
