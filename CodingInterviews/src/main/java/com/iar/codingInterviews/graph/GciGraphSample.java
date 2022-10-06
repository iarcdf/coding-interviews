package com.iar.codingInterviews.graph;

import java.util.ArrayList;
import java.util.List;

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

	public static List<GciGraphNode<String>> createSample1ForUndirectedConnectedComponentsCount() {

		List<GciGraphNode<String>> nodes = new ArrayList<>();

		GciGraphNode<String> i = new GciGraphNode<>("i");
		nodes.add(i);
		GciGraphNode<String> j = new GciGraphNode<>("j");
		nodes.add(j);
		GciGraphNode<String> k = new GciGraphNode<>("k");
		nodes.add(k);
		GciGraphNode<String> l = new GciGraphNode<>("l");
		nodes.add(l);
		GciGraphNode<String> m = new GciGraphNode<>("m");
		nodes.add(m);
		GciGraphNode<String> n = new GciGraphNode<>("n");
		nodes.add(n);
		GciGraphNode<String> o = new GciGraphNode<>("o");
		nodes.add(o);

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

		return nodes;
	}

	public static List<GciGraphNode<String>> createSample2ForUndirectedConnectedComponentsCount() {

		List<GciGraphNode<String>> nodes = new ArrayList<>();

		GciGraphNode<String> n1 = new GciGraphNode<>("1");
		nodes.add(n1);
		GciGraphNode<String> n2 = new GciGraphNode<>("2");
		nodes.add(n2);
		GciGraphNode<String> n3 = new GciGraphNode<>("3");
		nodes.add(n3);
		GciGraphNode<String> n4 = new GciGraphNode<>("4");
		nodes.add(n4);
		GciGraphNode<String> n5 = new GciGraphNode<>("5");
		nodes.add(n5);
		GciGraphNode<String> n6 = new GciGraphNode<>("6");
		nodes.add(n6);
		GciGraphNode<String> n7 = new GciGraphNode<>("7");
		nodes.add(n7);
		GciGraphNode<String> n8 = new GciGraphNode<>("8");
		nodes.add(n8);

		n1.getNeighbours().add(n2);
		n2.getNeighbours().add(n1);
		n4.getNeighbours().add(n6);
		n5.getNeighbours().add(n6);
		n6.getNeighbours().add(n4);
		n6.getNeighbours().add(n5);
		n6.getNeighbours().add(n7);
		n6.getNeighbours().add(n8);

		return nodes;
	}

	public static GciGraphNode<String>[] createSample1ForUndirectedShortestPath() {

		GciGraphNode<String> v = new GciGraphNode<>("v");
		GciGraphNode<String> w = new GciGraphNode<>("w");
		GciGraphNode<String> x = new GciGraphNode<>("x");
		GciGraphNode<String> y = new GciGraphNode<>("y");
		GciGraphNode<String> z = new GciGraphNode<>("z");

		v.getNeighbours().add(w);
		v.getNeighbours().add(z);
		w.getNeighbours().add(v);
		w.getNeighbours().add(x);
		x.getNeighbours().add(w);
		x.getNeighbours().add(y);
		y.getNeighbours().add(x);
		y.getNeighbours().add(z);
		z.getNeighbours().add(v);
		z.getNeighbours().add(y);

		return new GciGraphNode[] { w, z };
	}

}