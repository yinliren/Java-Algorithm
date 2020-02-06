package Class4_LinkedList;

public class LinkedListPalidrom {
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null)
			return true;
		ListNode slow = head;
		ListNode fast = head;
		ListNode prev = null;
		while (fast.next != null && fast.next.next != null) {
			prev = slow;
			fast = fast.next.next;
			slow = slow.next;
		}
		if (fast.next == null) {
			// The # of list node is odd
			prev.next = null;
			ListNode newHead = reverse(slow);
			while (head != null && newHead != null) {
				if (head.value != newHead.value)
					return false;
				head = head.next;
				newHead = newHead.next;
			}
			if (head != null || newHead != null)
				return false;
			else
				return true;
		} else {
			// The # of list node is even
			slow.next = null;
			ListNode newHead = reverse(fast);
			while (head != null && newHead != null) {
				if (head.value != newHead.value)
					return false;
				head = head.next;
				newHead = newHead.next;
			}
			if (head != null || newHead != null)
				return false;
			else
				return true;
		}
	}

	private ListNode reverse(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode prev = null;
		ListNode curr = head;
		ListNode currNext = curr.next;
		while (currNext != null) {
			curr.next = prev;
			prev = curr;
			curr = currNext;
			currNext = currNext.next;
		}
		curr.next = prev;
		return curr;
	}
	
	
	public static void main(String[] args) {
		LinkedListPalidrom solution = new LinkedListPalidrom();
		ListNode n1 = new ListNode(1);
		System.out.println(solution.isPalindrome(n1));
		
		ListNode n2 = new ListNode(1);
		ListNode curr = n2;
		curr.next = new ListNode(2);
		curr = curr.next;
		curr.next = new ListNode(1);
		System.out.println(solution.isPalindrome(n2));
		
		ListNode n3 = new ListNode(1);
		curr = n3;
		curr.next = new ListNode(2);
		curr = curr.next;
		curr.next = new ListNode(2);
		curr = curr.next;
		curr.next = new ListNode(1);
		System.out.println(solution.isPalindrome(n3));
		
		ListNode n4 = new ListNode(1);
		curr = n4;
		curr.next = new ListNode(2);
		curr = curr.next;
		curr.next = new ListNode(3);
		curr = curr.next;
		curr.next = new ListNode(2);
		curr = curr.next;
		curr.next = new ListNode(1);
		System.out.println(solution.isPalindrome(n4));
		
		ListNode n5 = new ListNode(1);
		curr = n5;
		curr.next = new ListNode(2);
		curr = curr.next;
		curr.next = new ListNode(3);
		curr = curr.next;
		curr.next = new ListNode(3);
		curr = curr.next;
		curr.next = new ListNode(2);
		curr = curr.next;
		curr.next = new ListNode(1);
		System.out.println(solution.isPalindrome(n5));
		
		
		
	}
}
