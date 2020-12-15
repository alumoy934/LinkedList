import com.sun.source.tree.WhileLoopTree;

public class LinkedList{

    private Element firstElement;
    private Element lastElement;

    public LinkedList(){
        firstElement = null;
        lastElement = null;
    }

    public void insertFirst(Object obj){
        Element element = new Element(obj);

        if (firstElement == null && lastElement == null){
            firstElement = element;
            lastElement = element;
        }else{
            element.setNext(firstElement);
            firstElement = element;
            if(lastElement == null){
                lastElement = element;
            }
        }
    }

   /* public void insertLast(Object obj){
        Element element = new Element(obj);
        element.setNext(null);
        lastElement = element;
        if (firstElement == null){
            firstElement = element;
        }
    }*/

    public void insertLast(Object obj){
        Element element = new Element(obj);
        element.setNext(null);
        if (lastElement != null){
            lastElement.setNext(element);
        }
        lastElement = element;
        if (firstElement == null){
            firstElement = element;
        }
    }

    public void print() {
        Element e = firstElement;
        while (e != null) {
            if (e != firstElement) {
                System.out.print(", ");
            }
            System.out.print(e.getObject());
            e = e.getNext();
        }
        System.out.println();
    }

    public boolean isEmpty(){
        if (firstElement == null)
            return true;
        else
            return false;
    }

    public void remove (Object obj) throws ObjectNotFoundException, EmptyListException{
        Element ant = firstElement;
        Element e = firstElement;

        if (firstElement == null) throw new EmptyListException();

        while ((e != null) && (e.getObject() != obj)){
            ant = e;
            e = e.getNext();
        }

        if (e == null) throw new ObjectNotFoundException();
        if (firstElement == lastElement){
            firstElement = null;
            lastElement = null;
        }else{
            if (firstElement == e){
                firstElement = e.getNext();
            }
            if (lastElement == e){
                lastElement = ant;
            }
            ant.setNext((e.getNext()));
        }
        e.delete();

    }

    public Object getLastObject() throws EmptyListException{
        if (firstElement == null) throw new EmptyListException();
        return lastElement.getObject();
    }

    public Object getFirstObject() throws EmptyListException{
        if (firstElement == null) throw new EmptyListException();
        return firstElement.getObject();
    }

    public Object getObjectAtPosition(int i) throws EmptyListException, InvalidIndexException{
        if (firstElement == null) throw new EmptyListException();
        Element e = firstElement;
        int cont = 0;
        while ((e != null) && (cont <i)){
            e = e.getNext();
            cont++;
        }
        if ((cont == i) && (e != null)){
            return e.getObject();
        }else {
            throw new InvalidIndexException();
        }

    }

} // main
