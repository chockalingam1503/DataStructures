package com.learning.hashing;

public class HashLearning {
	
	public static void main(String[] args) {
		
		String s ="lies";
		String s1 ="elis";
		String s2 ="seli";
		String s3 =new String("seli");
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s3.equals(s2));
		System.out.println(s3==(s2));
		
	}

}
