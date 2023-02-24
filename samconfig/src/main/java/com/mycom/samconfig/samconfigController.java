package com.mycom.samconfig;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mycom.samconfig.Domain.samconfigVO;
import com.mycom.samconfig.Service.samconfigService;

@Controller
public class samconfigController {
	private static final Logger logger = LoggerFactory.getLogger(samconfigController);
	
	@Inject
	private samconfigService samService;
	
	@RequestMapping(value="samList", method=RequestMethod.GET)
	//jsp에 값을 전달하려면 Model인수 선언
	public void samList(Model model) throws Exception {
		logger.info("samList로 접속함");
		/*요청한 펭지에 값을 전달하기 위해 저장
		 *
		 *모든 데이터를 검색해 samconfigVO에 저장하고 요청페이지에 전달
		 */
		model.addAttribute("samconfigVO", samService.allList());
	}
	
	@RequestMapping(value="update", method=RequestMethod.GET)
	public String edit(samconfigVO vo, Model model, RedirectAttributes rttr) {
		logger.info("update로 접속함");
		
		model.addAttribute("sam", samService.update(vo));
		model.addAttribute("samconfigVO", samService.update(vo));
		
		return "updateView";
	}
	
	@RequestMapping(value="samInsert", method=RequestMethod.POST)
	public String samInsert(samconfigVO vo, Model model, RedirectAttributes rttr) {
		logger.info("samInsert로 접속함");
		
		samService.create(vo);//삽입 처리
		
		rttr.addFlashAttribute("msg", "INSERT");//다른 페이지로 이동 시 전달할 메시지
		return "redirect:/samList";
	}
	
	@RequestMapping("samDelete")
	public String samDelete(@RequestParam("name") String name, Model model) {
		logger.info("DTO의 값을 전달함");
		
		samService.delete(name);
		
		return "samDeleteResult";
	}
}
