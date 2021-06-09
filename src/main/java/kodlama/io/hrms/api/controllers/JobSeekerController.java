package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.business.abstracts.JobSeekerService;
import kodlama.io.hrms.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/jobseekers")
public class JobSeekerController {

    @Autowired
    private JobSeekerService service;

    @RequestMapping(value = "/get-all", method = RequestMethod.GET)
    public List<JobSeekers> findAll() {
        return this.service.findAll();
    }
}
