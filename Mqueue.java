public class QueueMAIN {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.push('s');
        queue.push('d');
        queue.push('f');
        queue.push('a');
        
        System.out.println(queue.pull()); 
        System.out.println(queue.pull()); 
        System.out.println(queue.pull()); 
        System.out.println(queue.pull());
        System.out.println(queue.pull()); 
    }
}
