package Class4_LinkedList;

public class ReverseLinkedList {
	public ListNode IterativeSolution(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode prev = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
			if (nextNode != null) nextNode = nextNode.next;
		}
		return prev;
	}
	
	public ListNode RecursiveSolution(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = RecursiveSolution(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		ReverseLinkedList solution = new ReverseLinkedList();
		System.out.println("=================Case 1 Iterative=========================");
		ListNode head1 = new ListNode(1);
		ListNode curr = head1;
		curr.next = new ListNode(2);
		curr = curr.next;
		curr.next = new ListNode(4);
		curr = curr.next;
		curr.next = new ListNode(5);
		curr = curr.next;
		curr.next = new ListNode(7);
		curr = curr.next;
		curr.next = new ListNode(8);
		curr = curr.next;
		curr.next = new ListNode(10);
		curr = curr.next;
		curr.next = new ListNode(14);
		curr = curr.next;
		
		head1 = solution.IterativeSolution(head1);
		curr = head1;
		while (curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
		System.out.println("=================Case 2 Iterative=========================");
		ListNode head2 = new ListNode(1);
		head2 = solution.IterativeSolution(head2);
		curr = head2;
		while (curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
		System.out.println("=================Case 3 Iterative=========================");
		ListNode head3 = null;
		head3 = solution.IterativeSolution(head3);
		curr = head3;
		while (curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
		
		System.out.println("=================Case 4 Iterative=========================");
		ListNode head4 = new ListNode(1);
		curr = head4;
		curr.next = new ListNode(2);
		head4 = solution.IterativeSolution(head4);
		curr = head4;
		while (curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
		
		
		
		
		
		System.out.println("=================Case 5 Recursive=========================");
		ListNode head5 = new ListNode(1);
		curr = head5;
		curr.next = new ListNode(2);
		curr = curr.next;
		curr.next = new ListNode(4);
		curr = curr.next;
		curr.next = new ListNode(5);
		curr = curr.next;
		curr.next = new ListNode(7);
		curr = curr.next;
		curr.next = new ListNode(8);
		curr = curr.next;
		curr.next = new ListNode(10);
		curr = curr.next;
		curr.next = new ListNode(14);
		curr = curr.next;
		
		head5 = solution.RecursiveSolution(head5);
		curr = head5;
		while (curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
		System.out.println("=================Case 6 Recursive=========================");
		ListNode head6 = new ListNode(1);
		head6 = solution.RecursiveSolution(head6);
		curr = head6;
		while (curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
		System.out.println("=================Case 7 Recursive=========================");
		ListNode head7 = null;
		head7 = solution.RecursiveSolution(head7);
		curr = head7;
		while (curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
		
		System.out.println("=================Case 8 Recursive=========================");
		ListNode head8 = new ListNode(1);
		curr = head8;
		curr.next = new ListNode(2);
		head8 = solution.RecursiveSolution(head8);
		curr = head8;
		while (curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
		
	}

}
