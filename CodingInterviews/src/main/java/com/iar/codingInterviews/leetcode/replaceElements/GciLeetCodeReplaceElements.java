package com.iar.codingInterviews.leetcode.replaceElements;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class GciLeetCodeReplaceElements {

	@Test
	public void test1() {
		assert (numUniqueEmails(new String[] { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" }) == 2);
		assert (numUniqueEmails(new String[] { "a@leetcode.com", "b@leetcode.com", "c@leetcode.com" }) == 3);
	}

	public int numUniqueEmails(String[] emails) {
		Map<String, String> distinctEmails = new HashMap<>();
		for (int i = 0; i < emails.length; i++) {
			String email = emails[i];
			String[] emailParts = email.split("@");
			String emailLocalName = emailParts[0];
			String emailDomainName = emailParts[1];
			String emailLocalNameDistinct = emailLocalName.replace(".", "");
			int index = emailLocalNameDistinct.indexOf("+");
			if (index > 0) {
				emailLocalNameDistinct = emailLocalNameDistinct.substring(0, index);
			}
			String emailDistinct = emailLocalNameDistinct + "@" + emailDomainName;
			if (!distinctEmails.containsKey(emailDistinct)) {
				distinctEmails.put(emailDistinct, emailDistinct);
			}
		}
		return distinctEmails.values().size();
	}

}
