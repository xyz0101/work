package com.work6_listanimal;

import java.util.ArrayList;
import java.util.List;

import com.work6_animals.Animals;
/**
 * �����б���
 * @author �ܽ�
 *
 */
public class ListAnimal {
	
	List<Animals> list = new ArrayList<Animals>();
	/**
	 * ���һ������
	 * @param animal
	 */
		public void addAnimal(Animals animal){
			list.add(animal);
			System.out.println("��ӳɹ���"+list.size());
		}
		/**
		 * ��ѯ���ж���
		 * @return һ������
		 */
		public List<Animals> allAnimalls(){
			System.out.println(list.size());
			return list;
		}
		/**
		 * ɾ��һ������
		 * @param animal
		 */
		public void delete(Animals animal){
			list.remove(animal);
		}
}
