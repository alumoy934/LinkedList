public class Main {
    public static void main(String[] args) throws ObjectNotFoundException {
        LinkedList list = new LinkedList();
        list.insertFirst("Castellón");
        list.insertFirst("Valencia");
        list.insertLast("Alicante");
        list.print();
        list.remove("Alicante");
        list.print();
    }
}
