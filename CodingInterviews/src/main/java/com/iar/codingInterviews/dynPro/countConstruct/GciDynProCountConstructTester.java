package com.iar.codingInterviews.dynPro.countConstruct;

import java.util.Arrays;

import org.junit.Test;

public class GciDynProCountConstructTester {

	GciDynProCountConstruct impl = null;

	private GciDynProCountConstruct getImpl() {
		return impl;
	}

	@Test
	public void test() {
		impl = new GciDynProCountConstructMemoized();
		repeatTests();
		impl = new GciDynProCountConstructTabulated();
		repeatTests();
	}

	private void repeatTests() {
		test1();
		test2();
		test3();
		test4();
	}

	private void test1() {
		assert (getImpl().countConstruct("abcdef", Arrays.asList("ab", "abc", "cd", "def", "abcd")) == 1);
	}

	private void test2() {
		assert (getImpl().countConstruct("skateboard",
				Arrays.asList("bo", "rd", "ate", "t", "ska", "sk", "boar")) == 0);
	}

	private void test3() {
		assert (getImpl().countConstruct("purple", Arrays.asList("purp", "p", "ur", "le", "purpl")) == 2);
	}

	private void test4() {
		assert (getImpl().countConstruct("enterapotentpot",
				Arrays.asList("a", "p", "ent", "enter", "ot", "o", "t")) == 4);
	}
}