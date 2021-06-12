package kodlama.io.hrms.business.abstracts;

import kodlama.io.hrms.entities.concretes.Employers;

import java.util.List;

public interface EmployerService {
    List<Employers> findAll();
}
