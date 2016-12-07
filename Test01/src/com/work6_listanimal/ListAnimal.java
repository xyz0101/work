package com.work6_listanimal;

import java.util.ArrayList;
import java.util.List;

import com.work6_animals.Animals;
/**
 * 动物列表类
 * @author 周锦
 *
 */
public class ListAnimal {
	
	List<Animals> list = new ArrayList<Animals>();
	/**
	 * 添加一个动物
	 * @param animal
	 */
		public void addAnimal(Animals animal){
			list.add(animal);
			System.out.println("添加成功！"+list.size());
		}
		/**
		 * 查询所有动物
		 * @return 一个集合
		 */
		public List<Animals> allAnimalls(){
			System.out.println(list.size());
			return list;
		}
		/**
		 * 删除一个动物
		 * @param animal
		 */
		public void delete(Animals animal){
			list.remove(animal);
		}
}
