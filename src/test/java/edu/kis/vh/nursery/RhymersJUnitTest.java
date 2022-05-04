package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {
    private static final int TEST_VALUE = 4;
    private static final int COUNTIN_VALUE = 888;
    private static final int STACK_CAPACITY = 12;
    private static final int EMPTY_STACK_VALUE = -1;

    //TODO: dodać test sprawdzający poprawność zwracanej wartości przez metodę getTotal() w klasie DefaultCountingOutRhymer
    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        rhymer.countIn(TEST_VALUE);

        int result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertTrue(result);

        rhymer.countIn(COUNTIN_VALUE);

        result = rhymer.callCheck();
        Assert.assertFalse(result);
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertFalse(result);
            rhymer.countIn(COUNTIN_VALUE);
        }

        boolean result = rhymer.isFull();
        Assert.assertTrue(result);
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        rhymer.countIn(TEST_VALUE);

        result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        rhymer.countIn(TEST_VALUE);

        result = rhymer.countOut();
        Assert.assertEquals(TEST_VALUE, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

    @Test
    public void testHanoiRhymersCountIn() {
        HanoiRhymer rhymer = new HanoiRhymer();
        rhymer.countIn(TEST_VALUE);
        final int TEST_VALUE_HANOI = 5;
        final int EXPECTED_REJECTED = 1;

        rhymer.countIn(TEST_VALUE_HANOI);

        int result = rhymer.peekaboo();
        Assert.assertEquals(TEST_VALUE, result);
        Assert.assertEquals(rhymer.reportRejected(), EXPECTED_REJECTED);
    }

    @Test
    public void testFifoRhymersCountOut() {
        FIFORhymer rhymer = new FIFORhymer();
        final int EMPTY_STACK_RET = -1;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_RET, result);

        rhymer.countIn(TEST_VALUE);
        rhymer.countIn(TEST_VALUE + 1);
        result = rhymer.countOut();
        Assert.assertEquals(TEST_VALUE, result);
        result = rhymer.countOut();
        Assert.assertEquals(TEST_VALUE + 1, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_RET, result);
    }

    @Test
    public void testLinkedListEmpty() {
        IntLinkedList linkedList = new IntLinkedList();

        Assert.assertTrue(linkedList.isEmpty());
    }

    @Test
    public void testLinkedListPush_Pop() {
        IntLinkedList linkedList = new IntLinkedList();

        linkedList.push(TEST_VALUE);
        Assert.assertEquals(linkedList.pop(), TEST_VALUE);
    }

    @Test
    public void testLinkedListFull() {
        IntLinkedList linkedList = new IntLinkedList();

        Assert.assertFalse(linkedList.isFull());
    }

    @Test
    public void testLinkedListTop() {
        IntLinkedList linkedList = new IntLinkedList();

        linkedList.push(TEST_VALUE);
        Assert.assertEquals(linkedList.top(), TEST_VALUE);
        Assert.assertEquals(linkedList.top(), TEST_VALUE);
    }
}
