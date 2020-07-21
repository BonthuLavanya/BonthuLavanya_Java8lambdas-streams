package com.epam2.Datastreams;
import java.util.*;
public class Streamaverage {
	public static void main(String [] args)
	{
	   Scanner obj=new Scanner(System.in);
	   List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5, 9);
	   int count=(int) numbers.stream().count();
	   int sum=numbers.stream().mapToInt(Integer::intValue).sum();
	   float avg = (float)sum/count;
	   System.out.println(avg);
	   obj.close();
	}
}