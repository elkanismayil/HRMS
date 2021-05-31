package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.business.abstracts.JobService;
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
    public List<Job> getAll() {
        return jobDAO.findAll();
    }
}
