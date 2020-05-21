import org.junit.Test;
import static org.junit.Assert.*;

public class ADTest {
    @Test
    public void addTest(){
        ArrayDeque<Integer> A = new ArrayDeque<>();
        A.addFirst(1);
        A.addLast(2);
        int expected = 2;
        int actual = A.get(1);
        assertEquals(expected,actual);

        ArrayDeque<String> B = new ArrayDeque<>();
        B.addFirst("a");
        B.addLast("b");
        B.addLast("c");
        B.removeFirst();
        String expected2= "c";
        String actual2 = B.get(1);
        assertEquals(expected2,actual2);
    }

    @Test
    public void removeTest(){
        ArrayDeque<Integer> z = new ArrayDeque<>();
        z.addFirst(1);
        z.addLast(2);
        int expected = 1;
        int actual = z.removeFirst();
        assertEquals(expected,actual);
    }

    @Test
    public void resizeTest(){
        ArrayDeque<Integer> A = new ArrayDeque<>();
        A.addFirst(1);
        A.addLast(2);
        A.resize(100);
        int expected = 100;
        int actual = A.getLength();
        assertEquals(expected,actual);
    }

    @Test
    public void truncateTest(){
        ArrayDeque<Integer> A = new ArrayDeque<>();
        A.addFirst(1);
        A.addLast(2);
        A.resize(100);
        A.truncate();
        int expected = 8;
        int actual = A.getLength();
        assertEquals(expected,actual);
        A.addLast(3);
        A.addLast(4);
        A.resize(1000);
        int expected2 = 1000;
        int actual2 = A.getLength();
        assertEquals(expected2, actual2);
        A.truncate();
        int expected3 = 16;
        int actual3 = A.getLength();
        assertEquals(expected3,actual3);
    }

    @Test
    public void getTest(){
        ArrayDeque<Integer> A = new ArrayDeque<>();
        A.addFirst(1);
        A.addLast(2);
        assertNull(A.get(4));
    }

    @Test
    public void addNget(){
        ArrayDeque<Integer> A = new ArrayDeque<>();
        A.addLast(0);
        A.addLast(1);
        A.addLast(2);
        A.addLast(3);
        A.addLast(4);
        A.addLast(5);
        A.addLast(6);
        A.addLast(7);
        A.addLast(8);
        A.addLast(9);
        A.addLast(10);
        A.addLast(10);
        A.addLast(10);
        A.addLast(10);
        A.addLast(10);
        A.addLast(10);
        A.addLast(10);
        A.addLast(10);
        A.addLast(10);
        A.addLast(10);
        int expected = 0;
        int actual = A.get(0);
        assertEquals(expected,actual);
        int expected2 = 10;
        int actual2 = A.get(15);
        assertEquals(expected2,actual2);
    }

    @Test
    public void getTest2(){
        ArrayDeque<Integer> A = new ArrayDeque<>();
        A.addFirst(0);
        A.addLast(1);
        A.removeFirst();
        A.get(0);
        A.addFirst(4);
        A.addFirst(5);
        A.addLast(6);
        A.addFirst(7);
        A.get(1);
        A.removeLast();
        A.addFirst(10);
        A.addFirst(11);
        A.get(2);
        A.get(5);
        A.addLast(14);
        A.addFirst(15);
        A.addLast(16);
        int expected = 15;
        int actual = A.removeFirst();
        assertEquals(expected,actual);
    }

    @Test
    public void resizeTest2(){
        ArrayDeque<Integer> A = new ArrayDeque<>();
        A.addFirst(1);
        A.addFirst(1);
        A.addFirst(1);
        A.addFirst(1);
        A.addLast(2);
        A.addLast(2);
        A.addLast(2);
        A.addLast(2);
        A.addLast(2);
        A.addLast(2);
        A.addLast(2);
        A.addLast(2);
        A.addLast(2);
        int expected = 2;
        int actual = A.get(11);
        assertEquals(expected,actual);
    }

    @Test
    public void saveMemoryTest(){
        ArrayDeque<Integer> A = new ArrayDeque<>();
        for (int i = 0;i < 10000; i++){
            A.addLast(1);
        }
        for(int i = 0; i < 9999; i++) {
            A.removeFirst();
        }
        int exp_size = 1;
        int act_size = A.size();
        assertEquals(exp_size,act_size);
        int expected = 4;
        int actual = A.getLength();
        assertEquals(expected,actual);
    }

    @Test
    public void RandomTest(){
        ArrayDeque<Integer> A = new ArrayDeque<>();
        A.isEmpty();
        A.addFirst(1);
        int expected = 1;
        int actual = A.removeFirst();
        assertEquals(expected,actual);
    }
}
