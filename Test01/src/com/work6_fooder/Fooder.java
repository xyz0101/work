package com.work6_fooder;

import java.util.List;

import com.work6_animals.Animals;
import com.work6_animals.Cat;
import com.work6_animals.Dog;
import com.work6_animals.Pig;
import com.work6_listanimal.ListAnimal;

public class Fooder {
	public void foodAnimal(List<Animals> list ){
		
		for (int i=0;i<list.size();i++) {
			list.get(i).eat();
		}
		System.out.println("喂养了所有动物");
	}
}
