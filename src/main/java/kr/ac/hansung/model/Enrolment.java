package kr.ac.hansung.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Enrolment {
	
	private int id;
	private String year;
	private String semester;
	
	@Size(min=7, max=7, message="Code must be 7 chars")
	@NotEmpty(message="The code cannot be empty")
	private String code;
	
	@Size(min=2, max=20, message="Name must be between 2 and 20 chars")
	@NotEmpty(message="The name cannot be empty")
	private String name;
	
	@Size(min=2, max=2, message="Division must be 2 chars")
	@NotEmpty(message="The division cannot be empty")
	private String division;
	
	@Size(min=1, max=1, message="Credit must be 1 chars")
	@NotEmpty(message="The credit cannot be empty")
	private String credit;
	
}
