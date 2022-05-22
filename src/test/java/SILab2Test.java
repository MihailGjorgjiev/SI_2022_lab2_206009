import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void testEveryStatement(){
        RuntimeException ex;
        ArrayList<String> testcase1=new ArrayList<String>();
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(testcase1));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ArrayList<String> testcase2=new ArrayList<String>(Arrays.asList("#","0"));
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(testcase2));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));


        ArrayList<String> testcase3=new ArrayList<String>(Arrays.asList("0","#","#","0","0","0","#","0","#"));
        assertEquals(SILab2.function(testcase3),new ArrayList<String>(Arrays.asList("1","#","#","1","1","2","#","2","#")));

    }

    @Test
    public void testEveryBranch(){
        RuntimeException ex;
        ArrayList<String> testcase1=new ArrayList<String>();
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(testcase1));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ArrayList<String> testcase2=new ArrayList<String>(Arrays.asList("#","0"));
        ex=assertThrows(RuntimeException.class, () -> SILab2.function(testcase2));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));


        ArrayList<String> testcase3=new ArrayList<String>(Arrays.asList("0","#","#","0","0","0","#","0","#"));
        assertEquals(SILab2.function(testcase3),new ArrayList<String>(Arrays.asList("1","#","#","1","1","2","#","2","#")));
    }
}
