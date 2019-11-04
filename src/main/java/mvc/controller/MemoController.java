package mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import mvc.pojo.Memo;

public class MemoController {

	@RequestMapping("/memo")
	public String saveMemo(Memo memo) {
		System.out.println(memo);
		return "success";
	}
}
