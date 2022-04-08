public class Pro3_64010972 {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        for (int i = 1; i <= 20; i++) {
            q.enqueue(i);
        }
        while (!q.empty()) {
            System.out.print(q.dequeue() + " ");
        }
    }
}

class MyQueue {
    private int[] elements;
    private int size = 0;

    public MyQueue() {
        elements = new int[8];
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = v;
    }

    public int dequeue() {
        if (this.empty()) {
            return 0;
        }
        int temp = elements[0];
        System.arraycopy(elements, 1, elements, 0, --size);
        return temp;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}