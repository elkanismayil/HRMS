package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.JobService;
import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.dataAccess.abstracts.JobDAO;
import kodlama.io.hrms.entities.concretes.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobManager implements JobService {

    private JobDAO jobDAO;

    @Autowired
    public JobManager(JobDAO jobDAO) {
        this.jobDAO = jobDAO;
    }

    @Override
    public Job add(Job job) {
        return this.jobDAO.save(job);
    }

    @Override
    public DataResult<List<Job>> getAll() {
        return new SuccessDataResult<>(this.jobDAO.findAll(), "All job listed");
    }

    @Override
    public DataResult<List<Job>> findJobsBySalaryGreaterThan(double salary) {

        return new SuccessDataResult<>(jobDAO.findBySalaryGreaterThan(salary), "Found");
    }

    @Override
    public DataResult<List<Job>> findBySalaryLessThan(double salary) {
        return new SuccessDataResult<>(jobDAO.findBySalaryLessThan(salary), "Found");
    }

    @Override
    public Job findByName(String name) {
        return this.jobDAO.findByName(name);
    }

    @Override
    public Job findById(int id) {
        return this.jobDAO.findById(id);
    }
}
