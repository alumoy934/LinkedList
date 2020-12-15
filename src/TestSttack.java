public class TestSttack {
    public static void main(String[] args) throws ObjectNotFoundException, EmptyListException {
        Stack s = new Stack();
        Queue q = new Queue();

        s.push("One");
        s.push("Two");
        s.push("Three");
        s.printStack();
        System.out.println("----pop elements-------");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println("----Actual stack-------");
        s.printStack();
        System.out.println("-----Queue--------");
        q.push("A");
        q.push("B");
        q.push("C");
        q.printQueue();
        System.out.println("----pop elements-------");
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println("----Actual Queue-------");
        q.printQueue();

    }

}
