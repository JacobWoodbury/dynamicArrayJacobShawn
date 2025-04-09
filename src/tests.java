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

}
