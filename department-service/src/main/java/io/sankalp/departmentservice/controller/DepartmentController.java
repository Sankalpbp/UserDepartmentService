package io.sankalp.departmentservice.controller;

import io.sankalp.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ( "/departments" )
public class DepartmentController {

    @Autowired
    private DepartmentService service;
}
