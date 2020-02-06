package Class4_LinkedList;

public class mergeSortLinkedList {
	public ListNode mergeSort(ListNode head) {
		if (head == null || head.next == null) return head;
		ListNode slow = head;
		ListNode fast = head;
		ListNode prev = null;
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = null;
		return merge(mergeSort(head), mergeSort(slow));
	}
	
	private ListNode merge(ListNode n1, ListNode n2) {
		if (n1 == null && n2 == null) return null;
		else if (n1 == null) return n2;
		else if (n2 == null) return n1;
		ListNode dummy = new ListNode(0);
		ListNode curr = dummy;
		while (n1 != null && n2 != null) {
			if (n1.value <= n2.value) {
				curr.next = new ListNode(n1.value);
				curr = curr.next;
				n1 = n1.next;
			}
			else {
				curr.next = new ListNode(n2.value);
				curr = curr.next;
				n2 = n2.next;
			}
		}
		if (n1 != null) {
			while (n1 != null) {
				curr.next = new ListNode(n1.value);
				curr = curr.next;
				n1 = n1.next;
			}
		}
		else {
			while (n2 != null) {
				curr.next = new ListNode(n2.value);
				curr = curr.next;
				n2 = n2.next;
			}
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		mergeSortLinkedList solution = new mergeSortLinkedList();
		ListNode n1 = new ListNode(1);
		ListNode curr = n1;
		curr.next = new ListNode(3);
		curr = curr.next;
		curr.next = new ListNode(1);
		curr = curr.next;
		curr.next = new ListNode(4);
		curr = curr.next;
		curr.next = new ListNode(2);
		curr = curr.next;
		curr.next = new ListNode(2);
		n1 = solution.mergeSort(n1);
		curr = n1;
		while (curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
		System.out.println("=========================================");
		
		ListNode n2 = new ListNode(2);
		curr = n2;
		curr.next = new ListNode(1);
		n2 = solution.mergeSort(n2);
		curr = n2;
		while (curr != null) {
			System.out.println(curr.value);
			curr = curr.next;
		}
		System.out.println("=========================================");
	}
}
