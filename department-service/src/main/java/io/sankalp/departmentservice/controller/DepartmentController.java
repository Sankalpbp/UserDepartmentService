package io.sankalp.departmentservice.controller;

import io.sankalp.departmentservice.entity.Department;
import io.sankalp.departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ( "/departments" )
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @PostMapping ( "/" )
    public Department saveDepartment ( @RequestBody Department department ) {
        log.info ( "Inside saveDepartment () method of DepartmentController." );
        return service.saveDepartment ( department );
    }

    @GetMapping ( "/{id}" )
    public Department findDepartmentById ( @PathVariable ( "id" ) Long departmentId ) {
        log.info ( "Side findDepartmentById () method in DepartmentController " );
        return service.findDepartmentById ( departmentId );
    }

}
