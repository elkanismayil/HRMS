package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JobDAO extends JpaRepository<Job, Integer> {
    Job findByName(String name); // bu çalışmayabilir çalışmazsa findByname(String name) kullan bunun yerine tamam?ok

    List<Job> findBySalaryGreaterThan(double salary);

    List<Job> findBySalaryLessThan(double salary);

    Job findById(int id);

}
