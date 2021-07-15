package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.Job;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobDAO extends JpaRepository<Job, Integer> {
    Job findByName(String name); // bu çalışmayabilir çalışmazsa findByname(String name) kullan bunun yerine tamam?ok

    Job findById(int id);

}
