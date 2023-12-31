package com.cg.employeeservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class APIResponseDto {
    private EmployeeDto employee;
    private DepartmentDto department;
    private OrganizationDto organizationDto;
    public APIResponseDto() {
    	
    }
	public APIResponseDto(EmployeeDto employee, DepartmentDto department, OrganizationDto organizationDto) {
		super();
		this.employee = employee;
		this.department = department;
		this.organizationDto = organizationDto;
	}
	public EmployeeDto getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeDto employee) {
		this.employee = employee;
	}
	public DepartmentDto getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentDto department) {
		this.department = department;
	}
	public OrganizationDto getOrganizationDto() {
		return organizationDto;
	}
	public void setOrganizationDto(OrganizationDto organizationDto) {
		this.organizationDto = organizationDto;
	}
    
}