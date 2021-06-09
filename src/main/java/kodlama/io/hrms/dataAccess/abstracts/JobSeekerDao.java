package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.JobSeekers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobSeekerDao extends JpaRepository<JobSeekers, Integer> {

    List<JobSeekers> findAll();
}
