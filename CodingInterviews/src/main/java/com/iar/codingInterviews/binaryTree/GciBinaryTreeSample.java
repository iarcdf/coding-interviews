package com.iar.codingInterviews.binaryTree;

public class GciBinaryTreeSample {

	public static GciBinaryTreeNode<String> createSample0BinaryTree() {
		return null;
	}

	public static GciBinaryTreeNode<String> createSample1BinaryTree() {
		GciBinaryTreeNode<String> a = new GciBinaryTreeNode<>();
		a.setValue("a");
		return a;
	}

	public static GciBinaryTreeNode<String> createSample6BinaryTree() {
		GciBinaryTreeNode<String> a = new GciBinaryTreeNode<>();
		a.setValue("a");
		GciBinaryTreeNode<String> b = new GciBinaryTreeNode<>();
		b.setValue("b");
		GciBinaryTreeNode<String> c = new GciBinaryTreeNode<>();
		c.setValue("c");
		GciBinaryTreeNode<String> d = new GciBinaryTreeNode<>();
		d.setValue("d");
		GciBinaryTreeNode<String> e = new GciBinaryTreeNode<>();
		e.setValue("e");
		GciBinaryTreeNode<String> f = new GciBinaryTreeNode<>();
		f.setValue("f");
		a.setLeft(b);
		a.setRight(c);
		b.setLeft(d);
		b.setRight(e);
		c.setRight(f);
		return a;
	}
	
	public static GciBinaryTreeNode<String> createSample66BinaryTree() {
		GciBinaryTreeNode<String> a = new GciBinaryTreeNode<>();
		a.setValue("a");
		GciBinaryTreeNode<String> b = new GciBinaryTreeNode<>();
		b.setValue("b");
		GciBinaryTreeNode<String> c = new GciBinaryTreeNode<>();
		c.setValue("c");
		GciBinaryTreeNode<String> d = new GciBinaryTreeNode<>();
		d.setValue("d");
		GciBinaryTreeNode<String> e = new GciBinaryTreeNode<>();
		e.setValue("e");
		GciBinaryTreeNode<String> f = new GciBinaryTreeNode<>();
		f.setValue("f");
		a.setLeft(b);
		a.setRight(c);
		b.setLeft(d);
		c.setRight(e);
		d.setRight(f);
		return a;
	}

	public static GciBinaryTreeNode<Integer> createSampleInt0BinaryTree() {
		return null;
	}

	public static GciBinaryTreeNode<Integer> createSampleInt1BinaryTree() {
		GciBinaryTreeNode<Integer> a = new GciBinaryTreeNode<>();
		a.setValue(3);
		return a;
	}

	public static GciBinaryTreeNode<Integer> createSampleInt06BinaryTree() {
		GciBinaryTreeNode<Integer> a = new GciBinaryTreeNode<>();
		a.setValue(3);
		GciBinaryTreeNode<Integer> b = new GciBinaryTreeNode<>();
		b.setValue(11);
		GciBinaryTreeNode<Integer> c = new GciBinaryTreeNode<>();
		c.setValue(4);
		GciBinaryTreeNode<Integer> d = new GciBinaryTreeNode<>();
		d.setValue(2);
		GciBinaryTreeNode<Integer> e = new GciBinaryTreeNode<>();
		e.setValue(4);
		GciBinaryTreeNode<Integer> f = new GciBinaryTreeNode<>();
		f.setValue(1);
		a.setLeft(b);
		a.setRight(c);
		b.setLeft(d);
		b.setRight(e);
		c.setRight(f);
		return a;
	}

	public static GciBinaryTreeNode<Integer> createSampleInt16BinaryTree() {
		GciBinaryTreeNode<Integer> a = new GciBinaryTreeNode<>();
		a.setValue(5);
		GciBinaryTreeNode<Integer> b = new GciBinaryTreeNode<>();
		b.setValue(11);
		GciBinaryTreeNode<Integer> c = new GciBinaryTreeNode<>();
		c.setValue(3);
		GciBinaryTreeNode<Integer> d = new GciBinaryTreeNode<>();
		d.setValue(4);
		GciBinaryTreeNode<Integer> e = new GciBinaryTreeNode<>();
		e.setValue(15);
		GciBinaryTreeNode<Integer> f = new GciBinaryTreeNode<>();
		f.setValue(12);
		a.setLeft(b);
		a.setRight(c);
		b.setLeft(d);
		b.setRight(e);
		c.setRight(f);
		return a;
	}
	
	public static GciBinaryTreeNode<Integer> createSampleInt26BinaryTree() {
		GciBinaryTreeNode<Integer> a = new GciBinaryTreeNode<>();
		a.setValue(5);
		GciBinaryTreeNode<Integer> b = new GciBinaryTreeNode<>();
		b.setValue(11);
		GciBinaryTreeNode<Integer> c = new GciBinaryTreeNode<>();
		c.setValue(3);
		GciBinaryTreeNode<Integer> d = new GciBinaryTreeNode<>();
		d.setValue(4);
		GciBinaryTreeNode<Integer> e = new GciBinaryTreeNode<>();
		e.setValue(2);
		GciBinaryTreeNode<Integer> f = new GciBinaryTreeNode<>();
		f.setValue(1);
		a.setLeft(b);
		a.setRight(c);
		b.setLeft(d);
		b.setRight(e);
		c.setRight(f);
		return a;
	}

}