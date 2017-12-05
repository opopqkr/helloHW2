package kr.ac.hansung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Enrolment;
import kr.ac.hansung.service.EnrolmentService;

@Controller
public class EnrolmentController {

	@Autowired
	private EnrolmentService enrolmentService;

	@RequestMapping("/enrolments")
	public String showEnrolments(Model model) {
		List<Enrolment> enrolments = enrolmentService.getCurrent();
		model.addAttribute("enrolments", enrolments);

		return "enrolments";
	}

	// 3-1.(학년/학기별 이수 총학점 view로)
	@RequestMapping("/semester")
	public String showSemester(Model model) {
		List<Enrolment> enrolments = enrolmentService.getCurrent();
		model.addAttribute("enrolments", enrolments);

		return "semester";
	}

	// 3-1.(이수 구분별 학점내역 view로)
	@RequestMapping("/division")
	public String showDivision(Model model) {
		List<Enrolment> enrolments = enrolmentService.getCurrent();
		model.addAttribute("enrolments", enrolments);

		return "division";
	}

	// 3-3.(수강 신청 view로)
	@RequestMapping("/insertenrolment")
	public String insertEnrolment(Model model) {
		model.addAttribute("enrolment", new Enrolment());

		return "insertenrolment";
	}

	// 3-3.(수강 신청 성공 view로)
	@RequestMapping("/doinsert")
	public String doInsert(Model model, @Valid Enrolment enrolment, BindingResult result) {
		
		if(result.hasErrors()){
			System.out.println("==Form data does not validated==");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error: errors){
				System.out.println(error.getDefaultMessage());
			}
			return "insertenrolment";
		}
		enrolmentService.insert(enrolment);

		return "enrolmentinserted";
	}

	// 3-4.(수강 신청 조회)
	@RequestMapping("/newEnrolment")
	public String enrolmentNew(Model model) {
		List<Enrolment> enrolments = enrolmentService.getNewEnrolment();
		model.addAttribute("enrolments", enrolments);

		return "newEnrolment";
	}
}
