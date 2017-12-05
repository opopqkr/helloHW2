package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.EnrolmentDAO;
import kr.ac.hansung.model.Enrolment;

@Service
public class EnrolmentService {

	@Autowired
	private EnrolmentDAO enrolmentDao;

	public List<Enrolment> getCurrent() {
		return enrolmentDao.getEnrolments();
	}

	// 1학기
	public List<Enrolment> getSemesterYear1(String year) {
		return enrolmentDao.getSemester1(year);
	}

	// 2학기
	public List<Enrolment> getSemesterYear2(String year) {
		return enrolmentDao.getSemester2(year);
	}

	// 수강신청
	public void insert(Enrolment enrolment) {
		enrolmentDao.insert(enrolment);
	}
/*
	// 수강신청 조회
	public List<Enrolment> getNewEnrolment(String year) {
		return enrolmentDao.getNewEnrolments(year);
	}

*/

	public List<Enrolment> getNewEnrolment() {
		return enrolmentDao.getNewEnrolments();
	}
}
