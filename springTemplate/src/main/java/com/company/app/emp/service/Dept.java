package com.company.app.emp.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Dept {
	String departmentId;
	String departmentName;
	String managerId;
	String locationId;
}
