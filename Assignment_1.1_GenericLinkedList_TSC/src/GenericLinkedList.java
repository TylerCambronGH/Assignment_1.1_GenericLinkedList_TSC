
/**
 * @author tylercambron
 *
 * @param <T> Generic
 */
public class GenericLinkedList<T> {
	private LinkedNode<T> firstNode;
	private LinkedNode<T> lastNode;
	
	/**
	 * @param firstNode is the first node created for the list.
	 */
	public GenericLinkedList(LinkedNode<T> firstNode) {
		this.firstNode = firstNode;
		this.lastNode = firstNode;
	} // end constructor
	
	/** Creates a new node and sets it as the "next node" to the current "lastNode".
	 * @param nextNodeData must be generic type T, and is value for next node in the linked list.
	 */
	public void addNode(T nextNodeData) {
		LinkedNode<T> newNode = new LinkedNode<T>(nextNodeData);
		lastNode.setNextNode(newNode);
		lastNode = newNode;
	}
	
	/**
	 * @return the first node added.
	 */
	public LinkedNode<T> getFirstNode() {
		return firstNode;
	}
	
	/**
	 * @return the latest node added.
	 */
	public LinkedNode<T> getLastNode() {
		return lastNode;
	}
	
	// Suppressing the warning happening on the cast for the node checking changes.
	@SuppressWarnings("unchecked")
	public void printData() {
		StringBuilder sb = new StringBuilder();
		LinkedNode<T> checkingNode = firstNode;

		sb.append("Linked List: \n");
		while (true) {
			sb.append(checkingNode.getNodeData() + "\n");
			if (checkingNode.getNextNode() == null) {
				break;
			} else {
				checkingNode = (LinkedNode<T>) checkingNode.getNextNode();
			}
		}
		System.out.println(sb.toString());
	}
}
