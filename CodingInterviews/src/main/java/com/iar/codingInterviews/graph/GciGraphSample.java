package com.iar.codingInterviews.graph;

public class GciGraphSample {

	public static GciGraphNode<String> createSample0BinaryTree() {
		return null;
	}

	public static GciGraphNode<String> createSample1BinaryTree() {
		GciGraphNode<String> a = new GciGraphNode<>();
		a.setValue("a");
		return a;
	}

	public static GciGraphNode<String> createSample6BinaryTree() {
		GciGraphNode<String> a = new GciGraphNode<>();
		a.setValue("a");
		GciGraphNode<String> b = new GciGraphNode<>();
		b.setValue("b");
		GciGraphNode<String> c = new GciGraphNode<>();
		c.setValue("c");
		GciGraphNode<String> d = new GciGraphNode<>();
		d.setValue("d");
		GciGraphNode<String> e = new GciGraphNode<>();
		e.setValue("e");
		GciGraphNode<String> f = new GciGraphNode<>();
		f.setValue("f");
		a.setLeft(b);
		a.setRight(c);
		b.setLeft(d);
		b.setRight(e);
		c.setRight(f);
		return a;
	}

	public static GciGraphNode<Integer> createSampleInt0BinaryTree() {
		return null;
	}

	public static GciGraphNode<Integer> createSampleInt1BinaryTree() {
		GciGraphNode<Integer> a = new GciGraphNode<>();
		a.setValue(3);
		return a;
	}

	public static GciGraphNode<Integer> createSampleInt06BinaryTree() {
		GciGraphNode<Integer> a = new GciGraphNode<>();
		a.setValue(3);
		GciGraphNode<Integer> b = new GciGraphNode<>();
		b.setValue(11);
		GciGraphNode<Integer> c = new GciGraphNode<>();
		c.setValue(4);
		GciGraphNode<Integer> d = new GciGraphNode<>();
		d.setValue(2);
		GciGraphNode<Integer> e = new GciGraphNode<>();
		e.setValue(4);
		GciGraphNode<Integer> f = new GciGraphNode<>();
		f.setValue(1);
		a.setLeft(b);
		a.setRight(c);
		b.setLeft(d);
		b.setRight(e);
		c.setRight(f);
		return a;
	}

	public static GciGraphNode<Integer> createSampleInt16BinaryTree() {
		GciGraphNode<Integer> a = new GciGraphNode<>();
		a.setValue(5);
		GciGraphNode<Integer> b = new GciGraphNode<>();
		b.setValue(11);
		GciGraphNode<Integer> c = new GciGraphNode<>();
		c.setValue(3);
		GciGraphNode<Integer> d = new GciGraphNode<>();
		d.setValue(4);
		GciGraphNode<Integer> e = new GciGraphNode<>();
		e.setValue(15);
		GciGraphNode<Integer> f = new GciGraphNode<>();
		f.setValue(12);
		a.setLeft(b);
		a.setRight(c);
		b.setLeft(d);
		b.setRight(e);
		c.setRight(f);
		return a;
	}
	
	public static GciGraphNode<Integer> createSampleInt26BinaryTree() {
		GciGraphNode<Integer> a = new GciGraphNode<>();
		a.setValue(5);
		GciGraphNode<Integer> b = new GciGraphNode<>();
		b.setValue(11);
		GciGraphNode<Integer> c = new GciGraphNode<>();
		c.setValue(3);
		GciGraphNode<Integer> d = new GciGraphNode<>();
		d.setValue(4);
		GciGraphNode<Integer> e = new GciGraphNode<>();
		e.setValue(2);
		GciGraphNode<Integer> f = new GciGraphNode<>();
		f.setValue(1);
		a.setLeft(b);
		a.setRight(c);
		b.setLeft(d);
		b.setRight(e);
		c.setRight(f);
		return a;
	}

}