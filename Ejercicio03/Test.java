public class Test{
	public static void main(String[] args){
		AVL<Integer> arbol = new AVL<Integer>();
		arbol.add(11);
		System.out.println(arbol.inOrder());
		arbol.add(12);
		System.out.println(arbol.inOrder());
		arbol.add(16);
		System.out.println(arbol.inOrder());
		arbol.add(17);
		System.out.println(arbol.inOrder());
		arbol.add(15);
		System.out.println(arbol.inOrder());
		arbol.add(13);
		System.out.println(arbol.inOrder());
	}
}

