package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.business.abstracts.JobSeekerService;
import kodlama.io.hrms.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public JobSeekers add(@RequestBody JobSeekers jobSeekers){
        return this.service.add(jobSeekers);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public JobSeekers updateField(@RequestParam @PathVariable("id") int id, String email, String firstName, String lastName, String identification) {
        return this.service.updateField(id, email, firstName, lastName, identification);
    }
}
