class Node {
    int key;
    int val;
    Node prev;
    Node next;

    public Node(int key, int val) {
        this.key = key;
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}
class LRUCache {
    int capacity;
    HashMap<Integer,Node> map=new HashMap<>();
    Node head,tail;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
        if(!map.containsKey(key))return -1;
        Node oldNode=map.get(key);
        this.deleteNode(oldNode);
        this.addNode(oldNode);
        return oldNode.val;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node oldNode=map.get(key);
            this.deleteNode(oldNode);
            map.remove(key);
        }
        if(map.size()==capacity){
            Node oldNode=tail.prev;
            this.deleteNode(oldNode);
            map.remove(oldNode.key);
        }
        Node cache=new Node(key,value);
        map.put(key,cache);
        Node newNode=map.get(key);
        this.addNode(newNode);
    }
    public void addNode(Node newNode){
        Node node=head.next;
        head.next=newNode;
        newNode.prev=head;
        node.prev=newNode;
        newNode.next=node;
    }
    public void deleteNode(Node node){
        Node back=node.prev;
        Node front=node.next;
        back.next=front;
        front.prev=back;
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */