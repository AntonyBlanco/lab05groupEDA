public class AVL<T extends Comparable<T>>{
	private Node<T> root;
	private boolean height;

	public AVL(){
		root = null;
	}

	public boolean isEmpty(){
		return root == null;
	}
	public void add(T nuevo){
		height = false;
		root = addNew(root, nuevo);
	}
	private Node<T> addNew(Node<T> actual, T nuevo){
		System.out.println("Inserting " + nuevo.toString() + " at " + actual);
		if(actual == null){
			height = true;
			actual = new Node<T>(nuevo);
			System.out.println("Inserted " + nuevo.toString());
		} else {
			int comp = actual.getData().compareTo(nuevo);
			if(comp < 0){
				actual.setRight(addNew(actual.getRight(), nuevo));
				if(height){
					switch(actual.getBalanceFactor()){
						case -1:
							actual.setBalanceFactor(0);
							height = false;
							break;
						case 0:
							actual.setBalanceFactor(1);
							height = true;
							break;
						case 1:
							//res.balanceFactor = 2;
							actual = balanceLeft(actual);
							height = false;
							break;
					}
				}
			} else if (comp > 0){
				actual.setLeft(addNew(actual.getLeft(), nuevo));
			} else {
				System.out.println("Elemento repetido");
			}
		}
		return actual;
	}
	private Node<T> balanceLeft(Node<T> actual){
		Node<T> hijo = actual.getRight();
		switch(hijo.getBalanceFactor()){
			case 1:
				actual.setBalanceFactor(0);
				hijo.setBalanceFactor(0);
				actual = rotacionSimpIzq(actual);
				break;
			case -1:
				Node<T> nieto = hijo.getLeft();
				switch(nieto.getBalanceFactor()){
					case -1:
						actual.setBalanceFactor(0);
						hijo.setBalanceFactor(-1);
						break;
					case 0:
						actual.setBalanceFactor(0);
						hijo.setBalanceFactor(0);
						break;
					case 1:
						actual.setBalanceFactor(1);
						hijo.setBalanceFactor(0);
						break;
				}
				nieto.setBalanceFactor(0);
				actual.setRight(rotacionSimpDer(hijo));
				actual = rotacionSimpIzq(actual);
				break;
		}
		return actual;
	}

	private Node<T> rotacionSimpIzq(Node<T> actual){
		Node<T> hijo = actual.getRight();
		actual.setRight(hijo.getLeft());
		hijo.setLeft(actual);
		actual = hijo;
		return actual;
	}
	private Node<T> rotacionSimpDer(Node<T> actual){
		Node<T> hijo = actual.getLeft();
		actual.setLeft(hijo.getRight());
		hijo.setRight(actual);
		actual = hijo;
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

