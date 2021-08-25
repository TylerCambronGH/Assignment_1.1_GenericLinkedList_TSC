
/**
 * @author tylercambron
 * Application testing linked nodes and linked lists with different generic values.
 */
public class Application {
	public static void main(String[] args) {
		LinkedNode<String> headNode = new LinkedNode<String>("String List");
		GenericLinkedList<String> linkedList = new GenericLinkedList<String>(headNode);
		linkedList.printData();
		LinkedNode<Integer> headNode2 = new LinkedNode<Integer>(147);
		GenericLinkedList<Integer> linkedList2 = new GenericLinkedList<Integer>(headNode2);
		linkedList2.addNode(34);
		linkedList2.addNode(1135513);
		linkedList2.printData();
	}
}
