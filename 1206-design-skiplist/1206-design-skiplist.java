class Skiplist {

    private ListNode head;
    private int size;
    public Skiplist() {
        this.head=new ListNode();
        this.size=0;
    }
    
    public boolean search(int target) {
        
      ListNode node=this.head.next;
      while(node!=null){
        if(node.val==target)
          return true;
        node=node.next;
      }
      
      return false;
    }
    
    public void add(int num) {
        
      this.size++;
      ListNode node=this.head.next;
      if(node==null){
        this.head.next=new ListNode(num);
        return;
      }
        
      while(node.next!=null){ 
        node=node.next;
      }
      node.next=new ListNode(num);
    }
    
    public boolean erase(int num) {
        
      ListNode node=this.head.next;
      if(node==null){
        return false;
      }
      
      if( num==node.val){
        this.head.next=this.head.next.next;
        this.size--;
        return true;
      }
        
      while(node.next!=null && node.next.next!=null){
        if(node.next.val==num)
          break;
        node=node.next;
      }
      if(node.next!=null && node.next.next!=null){
        node.next=node.next.next;
        this.size--;
        return true;
      } 
      if(node.next!=null && node.next.val==num){
        node.next=null;
        this.size--;
        return true;
      }
        
      return false;
    }
}
class ListNode {
  public int val;
  public ListNode next;
  public ListNode(){}
  public ListNode(int val){
    this.val=val;
  }
}