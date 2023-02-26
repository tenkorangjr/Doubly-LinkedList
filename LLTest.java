public class LLTest {

    public static void main(String[] args) {
        {
            // Test addFirst
            LinkedList<Integer> l1 = new LinkedList<>();
            LinkedList<Integer> l2 = new LinkedList<>();
            l1.addFirst(5);
            l1.addFirst(10);
            l1.addFirst(15);
            l1.addFirst(20);
            l2.addFirst(20);
            l2.addFirst(15);
            l2.addFirst(10);
            l2.addFirst(5);

            // Test removeFirst
            l1.removeFirst();
            l1.removeFirst();
            l1.removeLast();

            // Verify
            System.out.println(l1 + " == [5]");
            System.out.println(l2 + " == [5, 10]");
        }

        {
            // Test addLast
            LinkedList<Integer> ll = new LinkedList<>();
            ll.addLast(1);
            ll.addLast(2);
            ll.addLast(3);
            ll.addLast(4);

            ll.removeLast();
            ll.removeFirst();
            ll.removeLast();

            // Verify
            System.out.println(ll + " == [1, 2, 3, 4]");
        }

        {
            // Testing addLast and addFirst simultaneously
            LinkedList<String> ll = new LinkedList<>();
            ll.addFirst("c");
            ll.addLast("h");
            ll.addFirst("i");
            ll.addLast("a");
            ll.addFirst("M");
            ll.addLast("e");
            ll.addLast("l");

            // Verify
            System.out.println(ll + " == [M, i, c, h, a, e, l]");
        }

        {
            // Testing addLast and addFirst simultaneously
            LinkedList<String> ll = new LinkedList<>();
            ll.addFirst("c");
            ll.addLast("h");
            ll.addFirst("i");
            ll.addLast("a");
            ll.addFirst("M");
            ll.addLast("e");
            ll.addLast("l");

            // Verify
            System.out.println(ll + " == [M, i, c, h, a, e, l]");
        }
    }
}
