package com.datastructure.hashmap;

public class HashMapRunner 
{
	public static void findFrequency()
	{
		String str="To be or not to be";
		String myStr[]=str.split(" ");
		MyHashMap<String,Integer> myMap=new MyHashMap();
		for(String wd:myStr)
		{
			Integer value=1;
			if(myMap.get(wd)==null)
			{
				myMap.add(wd,value);
			}
			else
			{
				myMap.add(wd,++value);
			}
		}
		System.out.println(myMap);
	}
	public static void main(String[] args) 
	{
		findFrequency();
	}

}
