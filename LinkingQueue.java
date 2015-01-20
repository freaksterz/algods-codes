import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.Scanner;


class LinkingQueue {
    private class Node {
        public Object data;
        public Node next;
        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }
        public void displayNode() {
            System.out.print(data+" ");
        }
    }

    private Node head = null;
    private Node tail = null;

    public void enqueue(Object item) {
        Node newNode = new Node(item, null);
        if (isEmpty()) {head = newNode;} else {tail.next = newNode;}
        tail = newNode;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        Object item = head.data;
        if (tail == head) {
            tail = null;
        }
        head = head.next;
        return item;
    }

    public Object peek() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        return head.data;
    }
    
    public void display() {
        Node current = head;

        while (current != null) {
            current.displayNode();
            current = current.next;
        }

        //System.out.println(" ");
    }
    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        for (Node node = head; node != null; node = node.next) {
            count++;
        }
        return count;
    }
    
    public static void main(String[] args) throws IOException {
	   
	   LinkingQueue lq = new LinkingQueue();
	   //Node node = new LinkedQueue.Node(node, node);
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       Scanner sc = new Scanner(System.in);
	   //String line = br.readLine();
       //int N = Integer.parseInt(line);
       int count = sc.nextInt();
       //sc.nextLine(); // throw away the newline.
       int data;
       //int [] numbers = new int[count];
       
       for (int i = 0; i < count; i++) {
           if (sc.hasNextInt()) {
        	   data = sc.nextInt();
        	   lq.enqueue(data);
           } else {
               System.out.println("You didn't provide enough numbers");
               break;
           }
       }
     /*  for (int i = 0; i < N; i++) {
           //System.out.println("hello world");
    	   //BufferedReader element = new BufferedReader(new InputStreamReader(System.in));
    	   String dataString = br.readLine();
    	   int data = Integer.parseInt(dataString);
    	   lq.enqueue(data);
       }*/
	   
       //String thirdLine = br.readLine();
       
       //int thirdNumber = Integer.parseInt(thirdLine);
       int thirdNumber = sc.nextInt(); 
       if(thirdNumber == 1){
    	   int forthNumber = sc.nextInt();
    	   lq.enqueue(forthNumber);
    	   
       }else {
    	   lq.dequeue();
       }
       
       lq.display();
	
}
}