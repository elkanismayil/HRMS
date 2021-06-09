package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlama.io.hrms.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerService implements kodlama.io.hrms.business.abstracts.JobSeekerService {

    @Autowired
    private JobSeekerDao jobSeekerDao;

    @Override
    public List<JobSeekers> findAll() {
        return this.jobSeekerDao.findAll();
    }
}
