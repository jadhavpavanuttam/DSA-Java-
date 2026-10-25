package arraySeries;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.Thread.sleep;

public class FaslAndSlowPointers {
    public static void main(String[] args) {
//        FaslAndSlowPointers faslAndSlowPointers = new FaslAndSlowPointers();
        System.out.println("Which number you want to skipped? ");
        int num = new Scanner(System.in).nextInt();
        List<ListNode> list = Arrays.asList(new ListNode(12),
                new ListNode(34),
                new ListNode(45),
                new ListNode(65),
                new ListNode(12),
                new ListNode(67),
                new ListNode(21)
        );
        AtomicInteger a = new AtomicInteger();
        list.stream().filter(z -> z.val != num).
                forEach(x ->
                        System.out.println((a.getAndIncrement()) + " : next -->  " + x.val));
    }

    private static int isRight(ListNode list) {
        list.next = list;
        return hasCycle(list) ? 1 : 0;
    }

    private static boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {

            try {
                sleep(1000L);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }

            System.out.println("Fast  : " + fast + "  , Slow  " + slow);

        }

        return false;
    }
}


class ListNode {
    int val;
    int slow;
    int fast;
    ListNode next;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ListNode listNode = (ListNode) o;
        return val == listNode.val && slow == listNode.slow && fast == listNode.fast && Objects.equals(next, listNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, slow, fast, next);
    }

    ListNode(int data) {
        this.val = data;
    }

}