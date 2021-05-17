package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {
	@RequestMapping("/hello")
	public String hello() {
		return "hello world!!";
	}
	@RequestMapping("/inha")
	public String inha(String param) {
		return param + "inha.ac.kr";
	}
	@RequestMapping("/name")
	public String name(String id) {
		return "당신의 학번은 : " + id;
	}
	//@RequestMapping("/hello")
	/*public String hello(String num) {
		for(int i=1;i<Integer.parseInt(num);i++) {
			return num + "*" + i + "=" + Integer.parseInt(num)*i;
		}
	}*/
}
