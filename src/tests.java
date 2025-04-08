import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


public class tests {
    
@Test
public void add_TestDynamicAdd(){
    StringList list = new DynamicStringList();
    for(int i=0; i<=9; i++){
        list.add("hi" + i);
    }
    assertEquals(20, list.size());
   
}


}
