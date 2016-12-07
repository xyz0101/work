package com.work6;

import java.util.ArrayList;
import java.util.List;

import com.work6_animals.Animals;
import com.work6_factory.Factory;
import com.work6_fooder.Fooder;
import com.work6_listanimal.ListAnimal;
import com.work6_person.Person;
import com.work6_place.Place;
import com.work6_place.Protecter;
import com.work6_utils.Utils;
/**
 * 运行测试类
 * @author 周锦
 *
 */
public class Main {

	public static void main(String[] args) {
			//程序开始
			new Place().start();
			//初始化动物集合
			ListAnimal l = new ListAnimal();
			while(true){
				//输入选项
				int n=new Utils().Input();
				//发现动物
				if(n==1){
					Animals a=new Protecter().discoverAnimal();
					l.addAnimal(a);
				}else 
					//饲养动物
				if(n==2)
					new Fooder().foodAnimal(l.allAnimalls());
				else
					//动物招领 
					if(n==3) {
					Person p = Factory.newAdopter();
					p.adopt(l.allAnimalls());
					System.out.println("收养了");
				}
				else 
					//所有动物
					if(n==4)
					System.out.println(l.allAnimalls());
		
				else 
					//动物特征
					if(n==5)
					for (Animals animals : l.allAnimalls()) {
						animals.feature();
					}
				//退出
				else if(n==6)		
					break;
				
			}
	}

}
