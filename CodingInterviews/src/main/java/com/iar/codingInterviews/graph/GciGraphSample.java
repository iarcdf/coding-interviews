package com.iar.codingInterviews.graph;

public class GciGraphSample {

	private static final int String = 0;

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

	public static GciGraphNode<String>[] createSampleForHasPathA() {

		GciGraphNode<String> f = new GciGraphNode<>("f");
		GciGraphNode<String> g = new GciGraphNode<>("g");
		GciGraphNode<String> h = new GciGraphNode<>("h");
		GciGraphNode<String> i = new GciGraphNode<>("i");
		GciGraphNode<String> j = new GciGraphNode<>("j");
		GciGraphNode<String> k = new GciGraphNode<>("k");

		f.getNeighbours().add(g);
		f.getNeighbours().add(i);
		g.getNeighbours().add(h);
		i.getNeighbours().add(k);
		i.getNeighbours().add(g);
		j.getNeighbours().add(i);

		return new GciGraphNode[] { f, k };
	}

	public static GciGraphNode<String>[] createSampleForHasPathB() {

		GciGraphNode<String> f = new GciGraphNode<>("f");
		GciGraphNode<String> g = new GciGraphNode<>("g");
		GciGraphNode<String> h = new GciGraphNode<>("h");
		GciGraphNode<String> i = new GciGraphNode<>("i");
		GciGraphNode<String> j = new GciGraphNode<>("j");
		GciGraphNode<String> k = new GciGraphNode<>("k");

		f.getNeighbours().add(g);
		f.getNeighbours().add(i);
		g.getNeighbours().add(h);
		i.getNeighbours().add(k);
		j.getNeighbours().add(i);

		return new GciGraphNode[] { j, f };
	}
	
	public static GciGraphNode<String>[] createSampleForUndirectedHasPathA() {

		GciGraphNode<String> i = new GciGraphNode<>("i");
		GciGraphNode<String> j = new GciGraphNode<>("j");
		GciGraphNode<String> k = new GciGraphNode<>("k");
		GciGraphNode<String> l = new GciGraphNode<>("l");
		GciGraphNode<String> m = new GciGraphNode<>("m");
		GciGraphNode<String> n = new GciGraphNode<>("n");
		GciGraphNode<String> o = new GciGraphNode<>("o");

		i.getNeighbours().add(j);
		i.getNeighbours().add(k);
		j.getNeighbours().add(i);
		j.getNeighbours().add(k);
		k.getNeighbours().add(i);
		k.getNeighbours().add(j);
		k.getNeighbours().add(l);
		k.getNeighbours().add(m);
		l.getNeighbours().add(k);
		m.getNeighbours().add(k);
		o.getNeighbours().add(n);
		n.getNeighbours().add(o);

		return new GciGraphNode[] { i, l };
	}
	
	public static GciGraphNode<String>[] createSampleForUndirectedHasPathB() {

		GciGraphNode<String> i = new GciGraphNode<>("i");
		GciGraphNode<String> j = new GciGraphNode<>("j");
		GciGraphNode<String> k = new GciGraphNode<>("k");
		GciGraphNode<String> l = new GciGraphNode<>("l");
		GciGraphNode<String> m = new GciGraphNode<>("m");
		GciGraphNode<String> n = new GciGraphNode<>("n");
		GciGraphNode<String> o = new GciGraphNode<>("o");

		i.getNeighbours().add(j);
		i.getNeighbours().add(k);
		j.getNeighbours().add(i);
		j.getNeighbours().add(k);
		k.getNeighbours().add(i);
		k.getNeighbours().add(j);
		k.getNeighbours().add(l);
		k.getNeighbours().add(m);
		l.getNeighbours().add(k);
		m.getNeighbours().add(k);
		o.getNeighbours().add(n);
		n.getNeighbours().add(o);

		return new GciGraphNode[] { k, o };
	}
}