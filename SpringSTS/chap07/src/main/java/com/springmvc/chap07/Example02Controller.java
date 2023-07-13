package com.springmvc.chap07;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Example02Controller {
	
	@PostMapping("/member")
	//"member" ��������Ʈ�� ��û�� �� ��� �ش� �޼ҵ尡 ����ǵ��� �����ϴ� ������ �մϴ�. 
	//��������Ʈ�� �ַ� �� �����͸� �����ִ� ���� 
	public String submitForm(@ModelAttribute Member member, Model model) {
	
		System.out.println("@PostMapping--------------");
		System.out.println("���̵�" + member.getId());
		System.out.println("��й�ȣ" + member.getPasswd());
		System.out.println("������" + member.getCity());
		System.out.println("�� ��" + member.getSex());	
		System.out.println("�� �� : ");
		for(int i=0; i<member.getHobby().length; i++)
			System.out.println("["+member.getHobby()[i]+ "]");
		
		model.addAttribute("member", member);
		return "webpage07_02";	
	}
}
//@ModelAttribute ������̼��� ���� member��ü�� ���ε��ϰ�
//�ش� ��ü�� �̿��Ͽ� ���۵� �����͸� �޾ƿ� �� �ֽ��ϴ�. 
//submitForm���� @ModelAttribute Member member �Ķ���͸� ����Ͽ�
//���۵� �����͸� �޾ƿ� �� �ֽ��ϴ�. 
//���� ��� ��û �Ķ���ͷ� id, passwd, city, sex, hobby�� ���� �ʵ带 ���� ���, 
//�� ������ �ڵ����� Member ��ü�� �ʵ忡 �����˴ϴ�. 	
// Member ��ü���� HTTP  ��û �Ķ���Ͱ� �ڵ����� ���ε� �Ǿ� �ֽ��ϴ�. 
//�� ���� �� ��ü�� �̿��Ͽ� ���۵� �����͸� ����� �� �ֽ��Ϥ���. 
//member.getId() �� ȣ���Ͽ� ���̵� ���� ��ų� 
//member.getPasswd()�� ȣ���Ͽ� ��й�ȣ ���� ���� �� �ֽ��ϴ�. 
// �� ���� jsp������ ������ ����ϴ� ������?
//���� �������� �ٸ� ���, �� ���� ������ �����ϰ� ���� �ٸ� ������ ������ ��� 