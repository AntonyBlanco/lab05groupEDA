public class AVL<T extends Comparable<T>>{
	private Node<T> root;

	public AVL(){
		root = null;
	}

	public boolean isEmpty(){
		return root == null;
	}
	public void add(T nuevo){
		root = addNew(root, nuevo);
	}
	private Node<T> addNew(Node<T> actual, T nuevo){
		System.out.println("Inserting " + nuevo.toString() + " at " + actual);
		if(actual == null){
			actual = new Node<T>(nuevo);
			System.out.println("Inserted " + nuevo.toString());
		} else {
			int comp = actual.getData().compareTo(nuevo);
			if(comp < 0){
				actual.setRight(addNew(actual.getRight(), nuevo));
			} else if (comp > 0){
				actual.setLeft(addNew(actual.getLeft(), nuevo));
			} else {
				System.out.println("Elemento repetido");
			}
		}
		return actual;
	}

	public String inOrder(){
		return inOrder(root);
	}
	private String inOrder(Node<T> nodo){
		if(root == null){
			return "";
		}
		String str = "";
		Node<T> aux = nodo.getLeft();
		if(aux != null){
			str += this.inOrder(aux) + ", ";
		}
		str += nodo.toString();
		aux = nodo.getRight();
		if(aux != null){
			str += ", " + this.inOrder(aux);
		}
		return str;
	}
}

