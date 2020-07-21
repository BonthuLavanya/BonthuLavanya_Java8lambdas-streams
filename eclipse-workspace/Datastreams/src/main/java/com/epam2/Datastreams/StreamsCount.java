package com.epam2.Datastreams;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsCount {
	public static void main(String [] args)
	{
		Scanner obj=new Scanner(System.in);
		List<String> strlist = Arrays.asList("aba","bba","acc","dhbj","all","rgav","rgsgv","njk");
		List<String> filtered1 = strlist.stream() .filter(x -> x.charAt(0)== 'a') .collect(Collectors.toList());
		List<String> filtered = filtered1.stream() .filter(x -> x.length()== 3) .collect(Collectors.toList());
		System.out.println(filtered);
		obj.close();
	}
}
