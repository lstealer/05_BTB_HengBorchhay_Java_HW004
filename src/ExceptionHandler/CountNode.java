package ExceptionHandler;

public class CountNode<T> {
    class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void addNode(T data) throws NullValueException, SameValueExcetption {
        //Create a new node
        Node newNode = new Node(data);
        if(data==null){
            throw new NullValueException("the null is not allow");
        }
        if(duplicated(data)){
            throw new SameValueExcetption("The Value is duplicated");
        }
        //Checks if the list is empty
        if (head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }
    public boolean duplicated(T data){
        Node current = head;
        while (current != null) {
            //Prints each node by incrementing pointer
            if(current.data.equals(data)){
                current.data=data;
                return true;
            }
            current = current.next;
        }
       return false;
    }
    //countNodes() will count the nodes present in the list
    public int countNodes() {
        int count = 0;
        //Node current will point to head
        Node current = head;

        while (current != null) {
            //Increment the count by 1 for each node
            count++;
            current = current.next;
        }
        return count;
    }

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void update(int index,T data) throws NullValueException, SameValueExcetption {
        //Node current will point to head
        Node current = head;
        int count=0;
        if(data==null){
            throw new NullValueException("the null is not allow");
        }
        if(duplicated(data)){
            throw new SameValueExcetption("The Value is duplicated");
        }
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        while (current != null) {
            //Prints each node by incrementing pointer
            if(count==index){
                current.data=data;
                System.out.println("Found and updated the data!!!");
                return;
            }
            count++;
            current = current.next;
        }
       System.out.println("Could not found the Index");
    }
}
