import uaslp.objetos.list.List.arrayList.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayListTest {

    @Test
    public void testAddAtFront(){

        ArrayList test_array=new ArrayList();

        test_array.addAtFront("3");
        test_array.addAtFront("2");
        test_array.addAtFront("1");

        Assertions.assertEquals("1",test_array.getAt(0));
        Assertions.assertEquals("2",test_array.getAt(1));
        Assertions.assertEquals("3",test_array.getAt(2));
    }

    @Test
    public void testAddAtTail(){

        ArrayList arrayList = new ArrayList();

        arrayList.addAtTail("1");
        arrayList.addAtTail("2");
        arrayList.addAtTail("3");

        Assertions.assertEquals("1",arrayList.getAt(0));
        Assertions.assertEquals("2",arrayList.getAt(1));
        Assertions.assertEquals("3",arrayList.getAt(2));
    }

    @Test
    public void testRemoveIndex(){

        ArrayList arrayList=new ArrayList();

        Assertions.assertFalse(arrayList.removeIndex(0));

        arrayList.addAtTail("1");
        arrayList.addAtTail("2");
        arrayList.addAtTail("3");

        arrayList.removeIndex(0);

        Assertions.assertEquals("2",arrayList.getAt(0));

        arrayList.removeIndex(2);

    }

    @Test
    public void testRemoveAll(){

        ArrayList arrayList=new ArrayList();

        arrayList.addAtTail("3");
        arrayList.addAtTail("2");
        arrayList.addAtTail("1");

        arrayList.removeAll();

        Assertions.assertNull(arrayList.getAt(0));
    }

    @Test
    public void testSetAt(){

        ArrayList arrayList=new ArrayList();

        Assertions.assertFalse(arrayList.setAt(0,"1"));

        arrayList.addAtTail("1");

        arrayList.setAt(0,"5");

        Assertions.assertEquals("5",arrayList.getAt(0));
    }

    @Test
    public void testRemoveAllWithValue(){

        ArrayList arrayList = new ArrayList();

        Assertions.assertFalse(arrayList.removeAllWithValue("1"));

        arrayList.addAtTail("10");
        arrayList.addAtTail("10");
        arrayList.addAtTail("5");
        arrayList.addAtTail("5");
        arrayList.addAtTail("5");
        arrayList.addAtTail("1");

        arrayList.removeAllWithValue("10");

        Assertions.assertEquals(arrayList.getAt(0),"5");
        Assertions.assertEquals(4,arrayList.getSize());

        arrayList.removeAllWithValue("5");
    }

    @Test
    public void testGetIterator(){

        ArrayList arrayList = new ArrayList();

        arrayList.addAtFront("3");
        arrayList.addAtFront("2");
        arrayList.addAtFront("1");


        ArrayListIterator iterator = arrayList .getIterator();

        int i=0;
        while (iterator.hasNext()){
            Assertions.assertEquals(arrayList .getAt(i),iterator.Next());
            i++;
        }
    }
}
