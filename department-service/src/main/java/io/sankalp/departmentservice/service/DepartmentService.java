package io.sankalp.departmentservice.service;

import io.sankalp.departmentservice.entity.Department;
import io.sankalp.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    public Department saveDepartment( Department department ) {
        log.info ( "Inside saveDepartment () method of DepartmentService." );
        return repository.save ( department );
    }

    public Department findDepartmentById( Long departmentId ) {
        log.info ( "Inside findDepartmentById () method in DepartmentRespository " );
        return repository.findByDepartmentId ( departmentId );
    }
}
