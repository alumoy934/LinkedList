public class Queue {

    private LinkedList list;

    public Queue(){
        list = new LinkedList();
    }

    public void push(Object obj){
        list.insertLast(obj);
    }

    public Object pop() throws EmptyListException, ObjectNotFoundException {
        Object elem = list.getLastObject();
        list.remove(elem);
        return elem;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void empty(){
        list = new LinkedList();
    }

    public void printQueue(){
        list.print();
    }
}
