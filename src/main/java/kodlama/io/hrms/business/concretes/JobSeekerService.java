package kodlama.io.hrms.business.concretes;

import kodlama.io.hrms.core.utilities.results.DataResult;
import kodlama.io.hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.hrms.dataAccess.abstracts.JobSeekerDao;
import kodlama.io.hrms.entities.concretes.JobSeekers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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

    @Override
    public DataResult<List<JobSeekers>> findAllPaginated(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo-1, pageSize);
        return new SuccessDataResult<>(this.jobSeekerDao.findAll(pageable).getContent(),"Paginated data listed");
    }

    @Override
    public DataResult<List<JobSeekers>> findAllSorted() {
        Sort sort = Sort.by(Sort.Direction.ASC,"firstName");
        return new SuccessDataResult<>(this.jobSeekerDao.findAll(sort),"Successfully sorted by first name");
    }

    @Override
    public JobSeekers add(JobSeekers jobSeekers) {

        return this.jobSeekerDao.save(jobSeekers);
    }

    @Override
    public JobSeekers updateField(int id, String email, String firstName, String lastName, String identification) {
        return this.jobSeekerDao.updateField(id, email, firstName, lastName, identification);
    }


}
