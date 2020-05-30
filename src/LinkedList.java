
public class LinkedList<T> {
    public class Node<T> {
        T val;
        Node next = null;

         public Node(T val) {
            this.val = val;
        }
    }

    Node root = null;

    public LinkedList(T val) {
        if (root == null) {
            root = new Node(val);

        } else {
            this.add(val);
        }
    }
    public LinkedList(){}

    public void add(T val) {
        Node node = new Node(val);
        if (root == null)
            root = node;
        else {
            Node temp = root;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void remove(T val) {
        if (root == null)
            return;
        if (root.val == val) {
            root = root.next;
        }
        Node slow = root;
        Node current = root.next;
        int i = 0;
        while (current != null) {
            if (current.val == val) {
                slow.next = current.next;
                break;
            }
            current = current.next;
            slow = slow.next;
        }
    }

    public int search(T val) {
        if (root == null)
            return -1;
        int i = 0;
        Node current = root;
        while (current.next != null) {
            if (current.val == val) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void display(){
        Node current = root;
        while(current!=null){
            System.out.println(current.val);
            current = current.next;
        }
    }


}

