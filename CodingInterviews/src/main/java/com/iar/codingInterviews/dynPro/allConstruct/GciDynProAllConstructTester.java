package com.iar.codingInterviews.dynPro.allConstruct;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GciDynProAllConstructTester {

	GciDynProAllConstruct impl = null;

	private GciDynProAllConstruct getImpl() {
		return impl;
	}

	@Test
	public void test() {
		impl = new GciDynProAllConstructMemoized();
		repeatTests();
	}

	private void repeatTests() {
		test1();
		test2();
		test3();
	}

	private void test1() {
		List<List<String>> result = getImpl().allConstruct("abcdef",
				Arrays.asList("ab", "abc", "cd", "def", "abcd", "ef", "c"));
		assert (result.size() == 4);
		assert (result.get(0).size() == 3);
		assert (result.get(0).get(0).equals("ab"));
		assert (result.get(0).get(1).equals("cd"));
		assert (result.get(0).get(2).equals("ef"));
		assert (result.get(1).size() == 3);
		assert (result.get(1).get(0).equals("ab"));
		assert (result.get(1).get(1).equals("c"));
		assert (result.get(1).get(2).equals("def"));
		assert (result.get(2).size() == 2);
		assert (result.get(2).get(0).equals("abc"));
		assert (result.get(2).get(1).equals("def"));
		assert (result.get(3).size() == 2);
		assert (result.get(3).get(0).equals("abcd"));
		assert (result.get(3).get(1).equals("ef"));
	}

	private void test2() {
		List<List<String>> result = getImpl().allConstruct("purple", Arrays.asList("purp", "p", "ur", "le", "purpl"));
		assert (result.size() == 2);
		assert (result.get(0).size() == 2);
		assert (result.get(0).get(0).equals("purp"));
		assert (result.get(0).get(1).equals("le"));
		assert (result.get(1).size() == 4);
		assert (result.get(1).get(0).equals("p"));
		assert (result.get(1).get(1).equals("ur"));
		assert (result.get(1).get(2).equals("p"));
		assert (result.get(1).get(3).equals("le"));
	}

	private void test3() {
		List<List<String>> result = getImpl().allConstruct("skateboard",
				Arrays.asList("bo", "rd", "ate", "t", "ska", "sk", "boar"));
		assert (result.size() == 0);
	}
}