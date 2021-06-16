package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.entities.concretes.JobSeekers;

import java.util.List;

public interface JobSeekerService {
    List<JobSeekers> findAll();

    DataResult<List<JobSeekers>> findAllPaginated(int pageNo, int pageSize);

    DataResult<List<JobSeekers>> findAllSorted();

    JobSeekers add(JobSeekers jobSeekers);

    JobSeekers updateField(int id, String email, String firstName, String lastName, String identification);
}
