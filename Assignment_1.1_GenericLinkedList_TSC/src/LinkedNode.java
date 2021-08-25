
/**
 * @author tylercambron
 *
 * @param <T> will be same generic type as the linked list.
 */
public class LinkedNode<T> {
	private LinkedNode<?> nextNode;
	private T nodeData;
	
	/**
	 * @param nodeData class T with data.
	 */
	public LinkedNode(T nodeData) {
		this.nextNode = null;
		this.nodeData = nodeData;
	}// end constructor
	
	/**
	 * @param nextNode setting the next node held in a linked list.
	 * @param nodeData same class T data for the next node in a linked list.
	 */
	public LinkedNode(LinkedNode<?> nextNode, T nodeData) {
		this.nextNode = nextNode;
		this.nodeData = nodeData;
	}// end constructor
	
	/**
	 * @return the class T data.
	 */
	public T getNodeData() {
		return nodeData;
	}
	
	/**
	 * @param nextNode sets the next node for a linked list.
	 */
	public void setNextNode(LinkedNode<?> nextNode) {
		this.nextNode = nextNode;
	}
	
	/**
	 * @return the next node in a linked list.
	 */
	public LinkedNode<?> getNextNode() {
		return nextNode;
	}
}
