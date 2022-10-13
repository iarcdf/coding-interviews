package com.iar.codingInterviews.dynPro.canConstruct;

import java.util.Arrays;

import org.junit.Test;

public class GciDynProCanConstructTester {

	GciDynProCanConstruct impl = null;

	private GciDynProCanConstruct getImpl() {
		return impl;
	}

	@Test
	public void test() {
		impl = new GciDynProCanConstructMemoized();
		repeatTests();
		impl = new GciDynProCanConstructTabulated();
		repeatTests();
	}

	private void repeatTests() {
		test1();
		test2();
		test3();
	}

	private void test1() {
		assert (getImpl().canConstruct("abcdef", Arrays.asList("ab", "abc", "cd", "def", "abcd")));
	}

	private void test2() {
		assert (!getImpl().canConstruct("skateboard", Arrays.asList("bo", "rd", "ate", "t", "ska", "sk", "boar")));
	}

	private void test3() {
		assert (getImpl().canConstruct("enterapotentpot", Arrays.asList("a", "p", "ent", "enter", "ot", "o", "t")));
	}
}