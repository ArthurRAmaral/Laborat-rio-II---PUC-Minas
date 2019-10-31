public class app {
    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.pushLeft(3);
        deque.pushLeft(2);
        deque.pushLeft(1);
        deque.pushRight(4);
        deque.pushRight(5);
        deque.pushLeft(0);
        deque.pushLeft(-1);
        deque.pushRight(6);
        deque.popLeft();
        deque.popLeft();
        deque.popLeft();
        deque.popLeft();
        deque.pushLeft(2);
        deque.pushLeft(1);
        deque.popRight();
        while (deque.size() != 0) {
            System.out.println("deque.popLeft() = " + deque.popLeft());
        }
    }
}
