import uaslp.objetos.list.List.List;
import uaslp.objetos.list.List.arrayList.ArrayList;
import uaslp.objetos.list.List.linkedList.LinkedList;

public class Main {
    public static void main(String[] args) {

        List linkedList = new LinkedList();
        List arrayList = new ArrayList();

        linkedList.addAtTail("15");
        arrayList.addAtTail("15");

        linkedList.addAtFront("5");
        arrayList.addAtFront("5");

        linkedList.removeIndex(1);
        arrayList.removeIndex(1);

        linkedList.removeAll();
        arrayList.removeAll();

    }
}
