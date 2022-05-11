package bte.collectionsq.list;

public class Usage {
    public static void main(String[] args) {

        final DoubleLinkedList<Integer> integerDoubleLinkedList = new DoubleLinkedList<>();

       // integerDoubleLinkedList.add(0,66);
        integerDoubleLinkedList.add(3);
        integerDoubleLinkedList.add(5);
        integerDoubleLinkedList.add(7);
        System.out.println(integerDoubleLinkedList);
        integerDoubleLinkedList.add(0,13);
        System.out.println(integerDoubleLinkedList);
        integerDoubleLinkedList.add(1,23);
        System.out.println(integerDoubleLinkedList);
        integerDoubleLinkedList.add(4,33);
        System.out.println(integerDoubleLinkedList);
        integerDoubleLinkedList.add(5,66);
        System.out.println(integerDoubleLinkedList);
        integerDoubleLinkedList.add(7,66);
    }
}
