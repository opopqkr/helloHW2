package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Enrolment;

@Repository
public class EnrolmentDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from enrolments";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
	}

	// (한개씩 조회)
	public Enrolment getEnrolment(String name) {
		String sqlStatement = "select * from enrolments where name=?";

		return jdbcTemplate.queryForObject(sqlStatement, new Object[] { name }, new RowMapper<Enrolment>() {

			@Override
			public Enrolment mapRow(ResultSet rs, int rowNum) throws SQLException {

				Enrolment enrolment = new Enrolment();

				enrolment.setId(rs.getInt("id"));
				enrolment.setYear(rs.getString("year"));
				enrolment.setSemester(rs.getString("semester"));
				enrolment.setCode(rs.getString("code"));
				enrolment.setName(rs.getString("name"));
				enrolment.setDivision(rs.getString("division"));
				enrolment.setCredit(rs.getString("credit"));

				return enrolment;
			}

		});
	}

	// (수강 과목 조회)
	public List<Enrolment> getEnrolments() {
		String sqlStatement = "select * from enrolments";

		return jdbcTemplate.query(sqlStatement, new RowMapper<Enrolment>() {

			@Override
			public Enrolment mapRow(ResultSet rs, int rowNum) throws SQLException {

				Enrolment enrolment = new Enrolment();

				enrolment.setId(rs.getInt("id"));
				enrolment.setYear(rs.getString("year"));
				enrolment.setSemester(rs.getString("semester"));
				enrolment.setCode(rs.getString("code"));
				enrolment.setName(rs.getString("name"));
				enrolment.setDivision(rs.getString("division"));
				enrolment.setCredit(rs.getString("credit"));

				return enrolment;
			}

		});
	}

	// (1학기 조회)
	public List<Enrolment> getSemester1(String year) {
		String sqlStatement = "select * from enrolments where year=? AND semester='1'";

		return jdbcTemplate.query(sqlStatement, new Object[] { year }, new RowMapper<Enrolment>() {

			@Override
			public Enrolment mapRow(ResultSet rs, int rowNum) throws SQLException {

				Enrolment enrolment = new Enrolment();

				enrolment.setId(rs.getInt("id"));
				enrolment.setYear(rs.getString("year"));
				enrolment.setSemester(rs.getString("semester"));
				enrolment.setCode(rs.getString("code"));
				enrolment.setName(rs.getString("name"));
				enrolment.setDivision(rs.getString("division"));
				enrolment.setCredit(rs.getString("credit"));

				return enrolment;
			}

		});
	}

	// (2학기 조회)
	public List<Enrolment> getSemester2(String year) {
		String sqlStatement = "select * from enrolments where year=? AND semester='2'";

		return jdbcTemplate.query(sqlStatement, new Object[] { year }, new RowMapper<Enrolment>() {

			@Override
			public Enrolment mapRow(ResultSet rs, int rowNum) throws SQLException {

				Enrolment enrolment = new Enrolment();

				enrolment.setId(rs.getInt("id"));
				enrolment.setYear(rs.getString("year"));
				enrolment.setSemester(rs.getString("semester"));
				enrolment.setCode(rs.getString("code"));
				enrolment.setName(rs.getString("name"));
				enrolment.setDivision(rs.getString("division"));
				enrolment.setCredit(rs.getString("credit"));

				return enrolment;
			}

		});
	}

	// 수강 신청
	public boolean insert(Enrolment enrolment) {

		String year = enrolment.getYear();
		String semester = enrolment.getSemester();
		String code = enrolment.getCode();
		String name = enrolment.getName();
		String division = enrolment.getDivision();
		String credit = enrolment.getCredit();

		String sqlStatement = "insert into enrolments (year, semester, code, name, division, credit) values(?, ?, ?, ?, ?, ?)";

		return (jdbcTemplate.update(sqlStatement, new Object[] { year, semester, code, name, division, credit }) == 1);

	}

	// (2018년 수강 신청 과목 조회)
	public List<Enrolment> getNewEnrolments() {
		String sqlStatement = "select * from enrolments where year='2018' AND semester='1'";

		return jdbcTemplate.query(sqlStatement, new RowMapper<Enrolment>() {

			@Override
			public Enrolment mapRow(ResultSet rs, int rowNum) throws SQLException {

				Enrolment enrolment = new Enrolment();

				enrolment.setId(rs.getInt("id"));
				enrolment.setYear(rs.getString("year"));
				enrolment.setSemester(rs.getString("semester"));
				enrolment.setCode(rs.getString("code"));
				enrolment.setName(rs.getString("name"));
				enrolment.setDivision(rs.getString("division"));
				enrolment.setCredit(rs.getString("credit"));

				return enrolment;
			}

		});
	}

	/*
	 * public boolean update(Enrolment enrolment) {
	 * 
	 * int id = enrolment.getId(); String year = enrolment.getYear(); String
	 * semester = enrolment.getSemester(); String code = enrolment.getCode();
	 * String name = enrolment.getName(); String division =
	 * enrolment.getDivision(); String credit = enrolment.getCredit();
	 * 
	 * String sqlStatement =
	 * "update enrolments set year=?, semester=?, code=?, name=?, division=?, credit=? where id=?"
	 * ;
	 * 
	 * return (jdbcTemplate.update(sqlStatement, new Object[] { year, semester,
	 * code, name, division, credit, id }) == 1);
	 * 
	 * }
	 * 
	 * public boolean delete(int id) { String sqlStatement =
	 * "delete from enrolments where id=?";
	 * 
	 * return (jdbcTemplate.update(sqlStatement, new Object[] { id }) == 1); }
	 */
}
