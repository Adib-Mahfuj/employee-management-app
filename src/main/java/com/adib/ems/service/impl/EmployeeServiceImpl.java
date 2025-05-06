package com.adib.ems.service.impl;

import com.adib.ems.dto.EmployeeDto;
import com.adib.ems.entity.Employee;
import com.adib.ems.mapper.EmployeeMapper;
import com.adib.ems.repository.EmployeeRepository;
import com.adib.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
