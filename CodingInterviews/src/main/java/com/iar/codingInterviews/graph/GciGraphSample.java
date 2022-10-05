package com.iar.codingInterviews.graph;

public class GciGraphSample {

	public static GciGraphNode<String> createSample0Graph() {
		return null;
	}

	public static GciGraphNode<String> createSample1Graph() {
		GciGraphNode<String> a = new GciGraphNode<>();
		a.setValue("a");
		return a;
	}

	public static GciGraphNode<String> createSample6Graph() {
		
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
		
		a.getNeighbours().add(b);
		a.getNeighbours().add(c);
		b.getNeighbours().add(d);
		c.getNeighbours().add(e);
		d.getNeighbours().add(f);
		
		return a;
	}


}