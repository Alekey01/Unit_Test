import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uaslp.objetos.list.List.linkedList.LinkedList;
import uaslp.objetos.list.List.linkedList.LinkedListIterator;

public class LinkedListTest {

    @Test
    public void testAddAtFront(){

        LinkedList list=new LinkedList();

        list.addAtFront("3");

        Assertions.assertEquals("3",list.getAt(0));
        list.addAtFront("5");
        Assertions.assertEquals("5",list.getAt(0));
        Assertions.assertEquals("3",list.getAt(1));
        Assertions.assertEquals(2,list.getSize());
    }


    @Test
    public void testAddAtTail(){

        LinkedList Linkedlist=new LinkedList();

        Linkedlist.addAtTail("0");

        Assertions.assertEquals("0",Linkedlist.getAt(0));

        Linkedlist.addAtTail("1");

        Assertions.assertEquals("0",Linkedlist.getAt(0));
        Assertions.assertEquals("1",Linkedlist.getAt(1));
        Assertions.assertEquals(2,Linkedlist.getSize());
    }

    @Test
    public void testRemoveIndex(){

        LinkedList Linkedlist=new LinkedList();

        Assertions.assertFalse(Linkedlist.removeIndex(1));

        Linkedlist.addAtFront("1");
        Linkedlist.addAtFront("2");
        Assertions.assertTrue(Linkedlist.removeIndex(0));

        Linkedlist.removeAll();

        Linkedlist.addAtFront("1");
        Linkedlist.addAtFront("2");
        Linkedlist.addAtFront("3");
        Linkedlist.addAtFront("4");
        Linkedlist.addAtFront("5");
        Linkedlist.addAtFront("6");

        Assertions.assertTrue(Linkedlist.removeIndex(4));

        Linkedlist.removeAll();

        Linkedlist.addAtTail("3");
        Linkedlist.addAtTail("2");
        Linkedlist.addAtTail("1");


        Linkedlist.removeIndex(2);

        Assertions.assertEquals("3",Linkedlist.getAt(0));

        Linkedlist.removeIndex(1);

        Assertions.assertEquals("3",Linkedlist.getAt(0));

        Linkedlist.removeIndex(0);

        Assertions.assertEquals(0,Linkedlist.getSize());
    }

    @Test
    public void testRemoveAll(){

        LinkedList linkedList = new LinkedList();

        linkedList.addAtTail("1");
        linkedList.addAtTail("2");
        linkedList.addAtTail("3");

        linkedList.removeAll();

        Assertions.assertNull(linkedList.getAt(0));
        Assertions.assertEquals(0,linkedList.getSize());
    }

    @Test
    public void testSetAt(){

        LinkedList linkedList=new LinkedList();

        linkedList.addAtTail("1");
        linkedList.setAt(0,"4");

        Assertions.assertEquals("4",linkedList.getAt(0));
        boolean flag=linkedList.setAt(5,"4");

        Assertions.assertFalse(flag);
    }

    @Test
    public void testGetAt(){

        LinkedList linkedList=new LinkedList();

        linkedList.addAtTail("15");

        String aux= linkedList.getAt(0);

        Assertions.assertEquals("15",aux);
    }
    @Test
    public void testRemoveAllWithValue(){

        LinkedList linkedList = new LinkedList();

        Assertions.assertFalse(linkedList.removeAllWithValue("10"));

        linkedList.addAtTail("10");
        Assertions.assertTrue(linkedList.removeAllWithValue("10"));

        linkedList.removeAll();
        linkedList.addAtTail("10");
        linkedList.addAtTail("10");
        linkedList.addAtTail("10");
        linkedList.addAtTail("15");
        linkedList.addAtTail("15");
        linkedList.addAtTail("25");
        linkedList.addAtTail("25");
        linkedList.addAtTail("20");
        linkedList.addAtTail("20");
        linkedList.addAtTail("20");

        linkedList.removeAllWithValue("10");

        Assertions.assertEquals(linkedList.getAt(0),"15");
        Assertions.assertEquals(7,linkedList.getSize());

        linkedList.removeAllWithValue("20");
    }

    @Test
    public void testGetSize(){

        LinkedList linkedList =new LinkedList();

        linkedList.addAtTail("3");
        linkedList.addAtTail("2");
        linkedList.addAtTail("1");

        int size= linkedList.getSize();

        Assertions.assertEquals(3,size);
    }

    @Test
    public void testGetIterator(){

        LinkedList linkedList = new LinkedList();

        linkedList.addAtFront("3");
        linkedList.addAtFront("2");
        linkedList.addAtFront("1");

        LinkedListIterator iterator = linkedList.getIterator();

        int index=0;
        while (iterator.hasNext()){
            Assertions.assertEquals(linkedList.getAt(index),iterator.Next());
            index++;
        }
    }

}