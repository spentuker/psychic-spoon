// Last updated: 10/3/2025, 2:14:24 PM
class Node{
    Node next;
    Node prev;
    int key;
    int value;

    Node(int key,int value){
        this.key=key;
        this.value=value;
        this.prev=null;
        this.next=null;
    }

}

class LRUCache {

    int capacity;
    Node head;
    Node tail;
    HashMap<Integer,Node> hm;

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.head=new Node(-1,-1);
        this.tail=new Node(-1,-1);
        this.head.next=tail;
        this.tail.prev=head;
        this.hm=new HashMap<Integer,Node>();

    }
    
    public int get(int key) {
        if(!hm.containsKey(key)) return -1;

        // Node newNode=new Node(key,hm.get(key).value);
        Node node=hm.get(key);
        delete(node);
        insert(node);

        return hm.get(key).value;
    }
    
    public void put(int key, int value) {
        
        if(hm.size()>=capacity && !hm.containsKey(key)){
            // System.out.println("I am here at put's delete section when my key is "+key+"Val "+value);
            int k=tail.prev.key;
            delete(tail.prev);
            // hm.remove(k);
        }
        else if(hm.containsKey(key))
        {
            delete(hm.get(key));
        }

        Node newNode=new Node(key,value);
        insert(newNode);
        // hm.put(key,newNode);

    }
    void insert(Node newNode){

        hm.put(newNode.key,newNode);
        // System.out.println("Inserted key: "+newNode.key+"Val: "+newNode.value);

        newNode.next=head.next;
        head.next.prev=newNode;
        head.next=newNode;
        newNode.prev=head;


    }

    void delete(Node delNode){
        // Node delNode=tail.prev;
        // delNode.prev.next=tail;
        // tail.prev=delNode.prev;
        // delNode.next=null;
        
        hm.remove(delNode.key);
        // System.out.println("Removed key: "+delNode.key+"Val: "+delNode.value);
        delNode.prev.next=delNode.next;
        // System.out.println("1");
        delNode.next.prev=delNode.prev;
        // System.out.println("2");

        delNode.next=null;
        // System.out.println("3");

        delNode.prev=null;
        // System.out.println("4");


    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);

 * obj.put(key,value);
 */