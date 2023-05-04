public class Queue {
    int max;
    char[] array;
    int head;
    int tail;
    int cSize;
    
    public Queue(int size) {
        max = size;
        array = new char[size];
        head = 0;
        tail = -1;
        cSize = 0;
    }
    
    public void push(char value) {
        if (tail == max - 1) {
            System.out.println("queue lleno");
            return;
        }
        tail++;
        array[tail] = value;
        cSize++;
    }
    
    public char pull() {
        if (cSize == 0) {
            System.out.println("valor al final de queue esta vacio");
            return '0';
        }
        char var = array[head];
        head++;
        if (head == max) {
            head = 0;
        }
        cSize--;
        return var;
    }
}
