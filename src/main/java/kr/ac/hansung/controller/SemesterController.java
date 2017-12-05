package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Enrolment;
import kr.ac.hansung.service.EnrolmentService;

@Controller
@RequestMapping("/view")
public class SemesterController {

	@Autowired
	private EnrolmentService enrolmentService;
	
	@RequestMapping("/2012/1")
	public String semester20121(Model model){
		List<Enrolment> enrolments= enrolmentService.getSemesterYear1("2012");
		model.addAttribute("enrolments",enrolments);
		
		return "detailview";
	}
	
	@RequestMapping("/2012/2")
	public String semester20122(Model model){
		List<Enrolment> enrolments= enrolmentService.getSemesterYear2("2012");
		model.addAttribute("enrolments",enrolments);
		
		return "detailview";
	}
	
	@RequestMapping("/2013/1")
	public String semester20131(Model model){
		List<Enrolment> enrolments= enrolmentService.getSemesterYear1("2013");
		model.addAttribute("enrolments",enrolments);
		
		return "detailview";
	}
	
	@RequestMapping("/2016/2")
	public String semester20162(Model model){
		List<Enrolment> enrolments= enrolmentService.getSemesterYear2("2016");
		model.addAttribute("enrolments",enrolments);
		
		return "detailview";
	}
	
	@RequestMapping("/2017/1")
	public String semester20171(Model model){
		List<Enrolment> enrolments= enrolmentService.getSemesterYear1("2017");
		model.addAttribute("enrolments",enrolments);
		
		return "detailview";
	}
	
	@RequestMapping("/2017/2")
	public String semester20172(Model model){
		List<Enrolment> enrolments= enrolmentService.getSemesterYear2("2017");
		model.addAttribute("enrolments",enrolments);
		
		return "detailview";
	}
	
}
