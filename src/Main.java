public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.insertFirst("one");
        list.insertFirst("two");
        list.insertFirst("three");
        list.print();
        while (!list.isEmpty()) {
            try {
                String obj = list.getLastObject();
                System.out.println(obj);
                list.remove(obj);
            } catch (EmptyListException ex) {
                System.out.println("Empty list");
            } catch (ObjectNotFoundException e) {
                System.out.println("error");
            }
        }
    }
}