package com.datastructure.hashmap;

public class HashMapRunner 
{
	public static void findFrequency()
	{
		String str="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String myStr[]=str.split(" ");
		MyHashMap<String,Integer> myMap=new MyHashMap();
		for(String wd:myStr)
		{
			Integer value=1;
			if(!wd.equals("avoidable"))
			{
			      if(myMap.get(wd)==null)
			      {
				       myMap.add(wd,value);
			      }
			      else
			      {
			        	myMap.add(wd,++value);
		          }
			}
		}
		System.out.println(myMap);
	}
	public static void main(String[] args) 
	{
		findFrequency();
	}

}
