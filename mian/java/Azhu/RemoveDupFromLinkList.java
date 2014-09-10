
public class RemoveDupFromLinkList {
	Node startNode=null;
	public RemoveDupFromLinkList(){
		Node x1= new Node(1);
		//x1.addNode(2).addNode(3).addNode(4).addNode(5).addNode(2).addNode(6).addNode(7);
		//x1.addNode(2).addNode(2).addNode(3);
		startNode=x1;
	}
	public static Node removeDup(Node startNode){
		Node current=startNode;
		Node other=current;
		while (current!=null && current.next!=null) {
			other=current;
			while (other!=null && other.next!=null){
				if (current.data==other.next.data){
					System.out.println("Found it"+current.data);
					if (other.next.next!=null)
						other.next=other.next.next;
					else other.next=null;
				}
				other=other.next;
			}
			current=current.next;
		}
		return startNode;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDupFromLinkList r =new RemoveDupFromLinkList();
		r.startNode=r.removeDup(r.startNode);
		r.printNode(r.startNode);
	}
		
	public void printNode(Node node){
		while(node!=null){
			System.out.println(node.data);
			node=node.next;
			
		}
	}

	
	public class Node{
		public Node next;
		public int data;
		public Node(int d){
			data=d;
			next=null;
		}
		public Node getNext(){
			return next;
		}
		public Object getData(){
			return data;
		}
		public void setData(int d){
			data=d;
		}
		public Node addNode(int data) {
			Node n =new Node(data);
			this.next =n ;
			return n;
		}
	}
}

