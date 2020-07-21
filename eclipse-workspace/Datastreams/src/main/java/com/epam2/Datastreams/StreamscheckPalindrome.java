package com.epam2.Datastreams;
import java.util.*;
import java.util.function.Function;
public class StreamscheckPalindrome {
	public static List<String>getpalindrome(List<String>list, Function<String,String>function)
	{
		List<String>result=new ArrayList<String>();
		for(String str : list) {
			result.add(function.apply(str));
		}
		return result;
	}
	public static void main(String [] args)
	{
		Scanner obj=new Scanner(System.in);
		List<String> strnglist = Arrays.asList("aba","bba","acc","dhd","all","rggr","rgsg","nkikn");
		List<String> reversedlist = getpalindrome(strnglist,(String str) -> new StringBuilder(str).reverse().toString()); 
		List<String>palindromelist=new ArrayList<String>();
		for(int i=0;i<strnglist.size();i++)
		{
			if(strnglist.get(i).equals(reversedlist.get(i)))
			{
				palindromelist.add(strnglist.get(i));
			}
		}
		System.out.println(palindromelist);
		obj.close();
	}
}
