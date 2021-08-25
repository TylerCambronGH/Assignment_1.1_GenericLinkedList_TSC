
public class LinkedNode<T> {
	private LinkedNode<?> nextNode;
	private T nodeData;
	
	public LinkedNode(T nodeData) {
		this.nextNode = null;
		this.nodeData = nodeData;
	}
	
	public LinkedNode(LinkedNode<?> nextNode, T nodeData) {
		this.nextNode = nextNode;
		this.nodeData = nodeData;
	}
	
	public T getNodeData() {
		return nodeData;
	}
	
	public void setNextNode(LinkedNode<?> nextNode) {
		this.nextNode = nextNode;
	}
	
	public LinkedNode<?> getNextNode() {
		return nextNode;
	}
}
