package org.in;

import java.util.*;

public class RemoveDup {
		
	 public static void main(String args[]) { 
	      int count[] = {34, 22,10,60,30,22};
	      Set<Integer> set = new TreeSet<Integer>();
	     
	         for(int i = 0; i < count.length; i++) {
	            set.add(count[i]);
	         }
//	         System.out.println("The sorted list is:");
	         System.out.println("Duplicate removed in unsorted array" +set);

	       /*  TreeSet sortedSet = new TreeSet<Integer>(set);
	         System.out.println("The sorted list is:");
	         System.out.println(sortedSet);*/
	         
	 }
	 }


