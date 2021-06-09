package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.business.abstracts.JobService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Job add(@RequestBody Job job){
        return this.jobService.add(job);
    }

    @RequestMapping(value = "/get_all", method = RequestMethod.GET)
    public DataResult<List<Job>> getAll() {
        return this.jobService.getAll();
    }

    @RequestMapping(value = "/get_salary_greater_than", method = RequestMethod.GET)
    public DataResult<List<Job>> findJobBySalaryGreaterThan(@RequestParam double salary) {
        return this.jobService.findJobsBySalaryGreaterThan(salary);
    }

    @RequestMapping(value = "/get_salary_less_than", method = RequestMethod.GET)
    public DataResult<List<Job>> findJobBySalaryLessThan(@RequestParam double salary) {
        return this.jobService.findBySalaryLessThan(salary);
    }

    @RequestMapping(value = "/get_by_name", method = RequestMethod.GET)
    public Job findByName(@RequestParam String name){
        return this.jobService.findByName(name);
    }

    @RequestMapping(value = "/get_by_id", method = RequestMethod.GET)
    public Job findById(@RequestParam int id){
        return this.jobService.findById(id);
    }

}
