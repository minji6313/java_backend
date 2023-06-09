package com.springmvc.chap07;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Example02Controller {
	
	@PostMapping("/member")
	//"member" 엔드포인트에 요청이 올 경우 해당 메소드가 실행되도록 설정하는 역할을 합니다. 
	//엔드포인트는 주로 폼 데이터를 보여주는 역할 
	public String submitForm(@ModelAttribute Member member, Model model) {
	
		System.out.println("@PostMapping--------------");
		System.out.println("아이디" + member.getId());
		System.out.println("비밀번호" + member.getPasswd());
		System.out.println("거주지" + member.getCity());
		System.out.println("성 별" + member.getSex());	
		System.out.println("취 미 : ");
		for(int i=0; i<member.getHobby().length; i++)
			System.out.println("["+member.getHobby()[i]+ "]");
		
		model.addAttribute("member", member);
		return "webpage07_02";	
	}
}
//@ModelAttribute 어노테이션을 통해 member객체를 바인딩하고
//해당 객체를 이용하여 전송된 데이터를 받아올 수 있습니다. 
//submitForm에서 @ModelAttribute Member member 파라미터를 사용하여
//전송된 데이터를 받아올 수 있습니다. 
//예를 들어 요청 파라미터로 id, passwd, city, sex, hobby와 같은 필드를 가진 경우, 
//이 값들은 자동으로 Member 객체의 필드에 설정됩니다. 	
// Member 객체에는 HTTP  요청 파라미터가 자동으로 바인딩 되어 있습니다. 
//자 이제 이 객체를 이용하여 전송된 데이터를 사용할 수 있습니ㅏㄷ. 
//member.getId() 를 호출하여 아이디 값을 얻거나 
//member.getPasswd()를 호출하여 비밀번호 값을 얻을 수 있습니다. 
// 두 개의 jsp파일을 나눠서 사용하는 이유는?
//뷰의 디자인이 다른 경우, 두 개의 동작이 복잡하고 서로 다른 로직을 가지는 경우 
