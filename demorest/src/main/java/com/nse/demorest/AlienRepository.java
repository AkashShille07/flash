package com.nse.demorest;

import java.util.ArrayList;
import java.util.List;

public class AlienRepository
{
	List<Alien> alien;
	
	public AlienRepository() 
	{
		
		alien=new ArrayList<Alien>();
		Alien a1=new Alien();
		a1.setId(101);
		a1.setName("Akash");
		a1.setPoints(71);
		
		Alien a2=new Alien();
		a2.setId(102);
		a2.setName("AJ");
		a2.setPoints(91);
		
		alien.add(a1);
		alien.add(a2);
		
	}
	public List<Alien> getAliens()
	{
		return alien;
	}
	public Alien getAlien(int id) {
		
		for (Alien a: alien) 
		{
			if (a.getId()==id)
			{
				return a;
			}
		}
		return new Alien();
	}
	
		public void create(Alien a1) {
		alien.add(a1);
		
	}

}
