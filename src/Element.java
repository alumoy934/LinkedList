public class Element {

    private Object object;
    private Element next;

    public Element (Object newObject){
        object = newObject;
        next = null;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object newObject) {
        this.object = newObject;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public void delete(){
        object = null;
        next = null;
    }

}
