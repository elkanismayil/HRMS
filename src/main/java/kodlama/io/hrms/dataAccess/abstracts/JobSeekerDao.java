package kodlama.io.hrms.dataAccess.abstracts;

import kodlama.io.hrms.entities.concretes.JobSeekers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface JobSeekerDao extends JpaRepository<JobSeekers, Integer> {

    List<JobSeekers> findAll();

    @Modifying
    @Transactional()
    @Query(value = "UPDATE JobSeekers js SET js.email=:email, js.firstName=:firstName, js.lastName=:lastName, js.identification=:identification WHERE js.id=:id")
    JobSeekers updateField(@Param("id") int id, @Param("email") String email, @Param("firstName") String firstName, @Param("lastName") String lastName, @Param("identification") String identification);
}
