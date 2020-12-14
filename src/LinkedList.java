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

    public void insertLast(Object obj){
        Element element = new Element(obj);
        element.setNext(null);
        lastElement = element;
        if (firstElement == null){
            firstElement = element;
        }
    }

    public void print() {
        Element e = firstElement
        while (e != null) {
            if (e != firstElement) {
                System.out.print(", ");
            }
            System.out.print(e.getObject());
            e = e.getNext();
        }
        System.out.println();
    }

} // main
