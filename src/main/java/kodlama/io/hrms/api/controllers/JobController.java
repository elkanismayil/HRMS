package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.business.abstracts.JobService;
import kodlama.io.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/get-all")
    public List<Job> getAll(){
        return this.jobService.getAll();
    }


}
