import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


public class tests {
    
@Test
public void add_TestDynamicGrowth(){
    StringList list = new DynamicStringList();
    for(int i=0; i<15; i++){
        list.add("hi" + i);
    }
    assertEquals(15, list.size());
}

@Test
public void add_TestDynamicInput(){
    StringList list = new DynamicStringList();
    for(int i=0; i<=12; i++){
        list.add("index" + i);
    }
    list.add(("i13"));
    assertEquals("index11", list.get(11));
}

@Test
public void add_TestDynamicCopy(){
    StringList list = new DynamicStringList();
    for(int i=0; i<=12; i++){
        list.add("index" + i);
    }
    list.add(("i13"));
    assertEquals("index8", list.get(8));
}

@Test
public void add_TestDynamicCopyNine(){
    StringList list = new DynamicStringList();
    for(int i=0; i<=12; i++){
        list.add("index" + i);
    }
    list.add(("i13"));
    assertEquals("index9", list.get(9));
}

@Test
public void add_TestDynamicAddsAfterCopy(){
    StringList list = new DynamicStringList();
    for(int i=0; i<=12; i++){
        list.add("index" + i);
    }
    list.add(("i13"));
    assertEquals("index11", list.get(11));
}

@Test
public void add_TestNormalAdd(){
    StringList list = new DynamicStringList();

        list.add("hi");
    
    System.out.println();
    assertEquals("hi", list.get(0));
}

@Test
public void get_TestNormalGet(){
    StringList list = new DynamicStringList();

    list.add("hi");
    
    System.out.println();
    assertEquals("hi", list.get(0));
}

@Test
public void remove_TestNormalRemoveFirst(){
    StringList list = new DynamicStringList();
    for(int i=0; i<=5; i++){
        list.add("hi" + i);
    }    
    assertEquals("hi3", list.remove(3));
}

@Test
public void set_TestNormalFirstIndex(){
    StringList list = new DynamicStringList();
    for(int i=0; i<=5; i++){
        list.add("hi" + i);
    }    
    list.set(0,"TESTING");
    assertEquals("TESTING", list.get(0));
}

@Test
public void set_TestNormalMiddleIndex(){
    StringList list = new DynamicStringList();
    for(int i=0; i<=5; i++){
        list.add("hi" + i);
    }    
    list.set(3,"TESTING");
    assertEquals("TESTING", list.get(3));
}

@Test
public void set_TestNormalLastIndex(){
    StringList list = new DynamicStringList();
    for(int i=0; i<=5; i++){
        list.add("hi" + i);
    }    
    list.set(5,"TESTING");
    assertEquals("TESTING", list.get(5));
}

@Test
public void size_TestNormalSize(){
    StringList list = new DynamicStringList();
    for(int i=0; i<=10; i++){
        list.add("hi" + i);
    }    
    assertEquals(11, list.size());
}

@Test
public void capacity_TestLessThanTen(){
    StringList list = new DynamicStringList();
    for(int i=0; i<=5; i++){
        list.add("hi" + i);
    }    
    assertEquals(10, list.capacity());
}

@Test
public void capacity_TestEqualsTen(){
    StringList list = new DynamicStringList();
    for(int i=0; i<=10; i++){
        list.add("hi" + i);
    }    
    assertEquals(20, list.capacity());
}

@Test
public void capacity_TestGreaterThanTen(){
    StringList list = new DynamicStringList();
    for(int i=0; i<=13; i++){
        list.add("hi" + i);
    }    
    assertEquals(20, list.capacity());
}
}
