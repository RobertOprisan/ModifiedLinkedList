public class MainForQueue {
    public static void main(String[] args) throws EmptyListException {
        Stack2<String> st = new Stack2<String>();
        st.push("a");
        st.push("b");
        st.push("c");
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
    }
}