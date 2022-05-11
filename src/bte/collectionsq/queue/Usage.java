package bte.collectionsq.queue;

import java.util.ArrayList;

public class Usage {
    public static void main(String[] args) {
        BtaQueue<Integer> queue = new BtaQueue<>(6);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        // queue.add(6);

        queue.remove(4);
        System.out.println(queue);
        System.out.println("Queue size = " + queue.size());

        queue.clear();

        System.out.println(queue.isEmpty());

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue.contains(3));

        queue.remove();
        System.out.println(queue);

        queue.offer(3);
        System.out.println(queue);

        BtaQueue<Integer> queueToBeRemoved = new BtaQueue<>(5);
        queueToBeRemoved.add(3);
        queueToBeRemoved.add(15);
        queue.removeAll(queueToBeRemoved);
        System.out.println(queue);

        BtaQueue<Integer> queueContainedAll = new BtaQueue<>(5);
        queueContainedAll.add(2);
        queueContainedAll.add(4);
        queueContainedAll.add(5);
        //      queueContainedAll.add(15);
        System.out.println(queue.containsAll(queueContainedAll));
        System.out.println(queue);

        queue.setCapacity(10);

        queue.add(6);
        queue.add(7);
        queue.add(8);
        System.out.println(queue);
        queue.retainAll(queueContainedAll);
        System.out.println(queue);

        final ArrayList<Integer> objects = new ArrayList<>(5);
        objects.add(2);
        objects.add(4);
        System.out.println(queue.containsAll(objects));
        System.out.println(queue);

        System.out.print("[");
        boolean f = false;
        for (Integer i : queue) {
            if (f) {
                System.out.print(", ");
            } else {
                f = true;
            }

            System.out.print(i);
        }
        System.out.println("]");

    }
}
