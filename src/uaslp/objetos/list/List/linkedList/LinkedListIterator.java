package uaslp.objetos.list.List.linkedList;

import uaslp.objetos.list.List.Iterator;

public class LinkedListIterator implements Iterator {
    private Node current;

    public LinkedListIterator(Node head) {
        this.current=head;
    }

    public boolean hasNext(){
        return current != null;
    }

    public String Next(){
        String Name = current.getData();
        current=current.getNext();
        return Name;
    }
}
