package kr.green.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.green.spring.vo.MemberVO;
//@Controller가 있어야 URL을 분석하여 처리
@Controller
public class HomeController {
	
	//URL을 확인하는 곳, 필수
	//value는 localhost:8080/패키지명을 제외한 부분
	//method는 전달 방식, GET,POST, 생략하면 둘다
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homeGet(ModelAndView mv) {
		mv.setViewName("/main/home");
		//화면으로 데이터를 보낼때 addObject를 사용
		//addObject("화면에서 사용할 이름", 데이터);
		mv.addObject("serverTime", "데이터" );
		
		return mv;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loginGet(ModelAndView mv) {
		System.out.println("/login:get : ");
		mv.setViewName("/member/login");
		return mv;
	}
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView loginPost(ModelAndView mv, MemberVO member) {
		System.out.println("/login:post : ");
		mv.setViewName("/member/login");
		return mv;
	}
	
}
//default 접근 제한자 : 나 + 같은 패키지
class A{
	//여기서 A 클래스 호출 가능
}






