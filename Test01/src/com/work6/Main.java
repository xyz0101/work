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
 * ���в�����
 * @author �ܽ�
 *
 */
public class Main {

	public static void main(String[] args) {
			//����ʼ
			new Place().start();
			//��ʼ�����Ｏ��
			ListAnimal l = new ListAnimal();
			while(true){
				//����ѡ��
				int n=new Utils().Input();
				//���ֶ���
				if(n==1){
					Animals a=new Protecter().discoverAnimal();
					l.addAnimal(a);
				}else 
					//��������
				if(n==2)
					new Fooder().foodAnimal(l.allAnimalls());
				else
					//�������� 
					if(n==3) {
					Person p = Factory.newAdopter();
					p.adopt(l.allAnimalls());
					System.out.println("������");
				}
				else 
					//���ж���
					if(n==4)
					System.out.println(l.allAnimalls());
		
				else 
					//��������
					if(n==5)
					for (Animals animals : l.allAnimalls()) {
						animals.feature();
					}
				//�˳�
				else if(n==6)		
					break;
				
			}
	}

}
