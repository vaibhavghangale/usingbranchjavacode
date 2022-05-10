package javabasic;

import java.util.Set;
import java.util.TreeSet;

public class encrypted {
	public static void main(String[] args) {
		int num=0;
	String str="is3 bob2 boy5 good4 ";
	String[] s=str.split(" ");
	Set<String> name=new TreeSet<String>();
	for(String st:s) {
		name.add(st);
	}
	System.out.println(name);
	StringBuilder sb=new StringBuilder();
	for(String sb1:name) {
		
	System.out.println(sb1); 
	
	}

	}
}
