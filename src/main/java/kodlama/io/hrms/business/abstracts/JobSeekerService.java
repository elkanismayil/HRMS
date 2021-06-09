package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.entities.concretes.JobSeekers;

import java.util.List;

public interface JobSeekerService {
    List<JobSeekers> findAll();
}
