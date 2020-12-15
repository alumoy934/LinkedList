public class Stack {

    private LinkedList list;

    public Stack(){
        list = new LinkedList();
    }

    public void push(Object obj){
        list.insertFirst(obj);
    }

    public Object pop() throws EmptyListException, ObjectNotFoundException {
        Object elem = list.getFirstObject();
        list.remove(elem);
        return elem;
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void empty(){
        list = new LinkedList();
    }

    public void printStack(){
        list.print();
    }
}
