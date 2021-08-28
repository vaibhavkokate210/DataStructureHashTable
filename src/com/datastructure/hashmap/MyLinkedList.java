package com.datastructure.hashmap;

public class MyLinkedList<K>
{
	private INode head;
	private INode tail;
	
	public MyLinkedList() 
	{
		this.head = null;
	}
	
	public void append(INode myNode)
	{
		if(tail==null)
			tail=myNode;
		if(head==null)
			head=myNode;
		else
		{
			tail.setNext(myNode);
			tail=myNode;
		}
	}
	
	 public INode search(K key) 
	 {
	        INode temp = head;
	        while(temp!=null)
	        {
	            if (temp.getKey().equals(key))
	            {
	                return temp;
	            }
	            temp = temp.getNext();
	        }
	        return null;
	  }
	 
	 public void print()
		{
			StringBuilder sb=new StringBuilder("List = ");
			INode tempNode=head;
			while(tempNode!= null)
			{
				sb.append(tempNode.getKey());
				if(!tempNode.equals(tail))
					sb.append("->");
				tempNode=tempNode.getNext();
			}
			System.out.println(sb);
		}
	 public String toString()
	 {
	        return "MyLinkedList Nodes {" + head + "}" ;
  }
}
