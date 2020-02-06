package Class4_LinkedList;

public class ReverseKGroup {
	
	public static ListNode reverseKGroup(ListNode head, int k) {
	    if (head == null || head.next == null) {
	      return head;
	    }

	    int count = 0;
	    ListNode curr = head;
	    while (curr != null) {
	      count++;
	      curr = curr.next;
	    }
	    if (k > count) {
	      return head;
	    }
	    else {
	    	  curr = head;
		      ListNode prev = null;
		      for (int i = 0 ; i < k ; i++) {
		        if (curr != null) {
		          ListNode nextNode = curr.next;
		          curr.next = prev;
		          prev = curr;
		          curr = nextNode;
		        }
		        else {
		          break;
		        }
		      }
		      head.next = reverseKGroup(curr, k);
		      return prev;
	    }
	  }

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode curr = head;
		for (int i = 0 ; i < 7 ; i++) {
			curr.next = new ListNode(i + 2);
			curr = curr.next;
		}
		printLinkedList(head);
		printLinkedList(reverseKGroup(head, 3));
	}
	
	private static void printLinkedList(ListNode head) {
		ListNode curr = head;
		while (curr != null) {
			System.out.print(curr.value + " ");
			curr = curr.next;
		}
		System.out.println();
	}

}