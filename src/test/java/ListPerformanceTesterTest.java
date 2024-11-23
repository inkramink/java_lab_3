import org.collections.ListPerformanceTester;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ListPerformanceTesterTest {

    @Test
    public void testArrayListAdd() {
        ListPerformanceTester tester = new ListPerformanceTester();
        List<Integer> arrayList = new ArrayList<>();
        long time = tester.testAdd(arrayList, 1000);
        assertTrue(time > 0, "Time should be greater than 0");
    }

    @Test
    public void testArrayListGet() {
        ListPerformanceTester tester = new ListPerformanceTester();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        long time = tester.testGet(arrayList, 1000);
        assertTrue(time > 0, "Time should be greater than 0");
    }

    @Test
    public void testArrayListRemove() {
        ListPerformanceTester tester = new ListPerformanceTester();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arrayList.add(i);
        }
        long time = tester.testRemove(arrayList, 1000);
        assertTrue(time > 0, "Time should be greater than 0");
    }

    @Test
    public void testLinkedListAdd() {
        ListPerformanceTester tester = new ListPerformanceTester();
        List<Integer> linkedList = new LinkedList<>();
        long time = tester.testAdd(linkedList, 1000);
        assertTrue(time > 0, "Time should be greater than 0");
    }

    @Test
    public void testLinkedListGet() {
        ListPerformanceTester tester = new ListPerformanceTester();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }
        long time = tester.testGet(linkedList, 1000);
        assertTrue(time > 0, "Time should be greater than 0");
    }

    @Test
    public void testLinkedListRemove() {
        ListPerformanceTester tester = new ListPerformanceTester();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            linkedList.add(i);
        }
        long time = tester.testRemove(linkedList, 1000);
        assertTrue(time > 0, "Time should be greater than 0");
    }
}
