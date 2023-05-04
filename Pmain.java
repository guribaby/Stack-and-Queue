public class PUSHMain {

    public static void main(String[] args) {
        MyStackPush myStack = new MyStackPush(5);
        myStack.push('h');
        myStack.push('o');
        myStack.push('l');
        myStack.push('a');
        myStack.push('s');
        myStack.push('s');

        char elem;
        while ((elem = myStack.pop()) != 0) {
            System.out.println(elem);
        }
    }
}
