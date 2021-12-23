/**
 * 
 */
package com.code.challenge;

/**
 * @author NARESH
 *
 */
public class BinaryTree {

	Node root;

	public void addNode(int key, String name) {

		Node newNode = new Node(key, name);

		if (root == null) { // Step 1: When root node is null
			root = newNode; /* 1.1 : When root node is null assign it as rootNode */
		} else { // Step 2 : When root Node is not null
			Node focusNode = root;// 2.1: make root node as focus node
			Node parent;
			while (true) {
				parent = focusNode; // 2.1.1 : Make focus node as parent node

				if (key < focusNode.key) {//

					focusNode = focusNode.leftChild;

					if (focusNode == null) {
						parent.leftChild = newNode;
						return;
					}

				} else {
					focusNode = focusNode.rightChild;
					if (focusNode == null) {
						parent.rightChild = newNode;
						return;
					}

				}

			}
		}

	}

	/*
	 * InOrder traverse --small to big number
	 */

	public void inOrderTraversal(Node focusNode) {
		if (focusNode != null) {

			inOrderTraversal(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraversal(focusNode.rightChild);

		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.addNode(50, "Boss");
		tree.addNode(10, "Reception");
		tree.addNode(25, "Manager sales");
		tree.addNode(30, "Officer");
		tree.addNode(49, "Cleaning staff");
		tree.addNode(45, "Security staff");
		tree.addNode(60, "CEO");
		tree.inOrderTraversal(tree.root);

	}

}

class Node {
	int key;
	String name;

	Node leftChild;
	Node rightChild;

	public Node(int key, String name) {
		super();
		this.key = key;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", name=" + name + "]";
	}

}