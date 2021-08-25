
public class GenericLinkedList<T> {
	private LinkedNode<T> firstNode;
	private LinkedNode<T> lastNode;
	
	public GenericLinkedList(LinkedNode<T> firstNode) {
		this.firstNode = firstNode;
		this.lastNode = firstNode;
	}
	
	public void addNode(T nextNodeData) {
		LinkedNode<T> newNode = new LinkedNode<T>(nextNodeData);
		lastNode.setNextNode(newNode);
		lastNode = newNode;
	}
	
	public LinkedNode<T> getFirstNode() {
		return firstNode;
	}
	
	public LinkedNode<T> getLastNode() {
		return lastNode;
	}
	
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
