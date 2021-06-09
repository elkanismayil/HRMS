package kodlama.io.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "job_seekers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobSeekers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    @UniqueElements(message = "First name cannot be repeated")
    @NotBlank(message = "First name is mandatory")
    @NotNull(message = "First name cannot be null value")
    private String firstName;

    @Column(name = "last_name")
    @UniqueElements(message = "Last name cannot be repeated")
    @NotBlank(message = "Last name is mandatory")
    @NotNull(message = "Last name cannot be null value")
    private String lastName;

    @Column(name = "identification")
    @UniqueElements
    @NotBlank(message = "Identification is mandatory")
    @NotNull
    private String identification;

    @Column(name = "email")
    @UniqueElements(message = "Email cannot be repeated")
    @NotBlank(message = "Email is mandatory")
    @NotNull(message = "Email cannot be null value")
    @Email
    private String email;
}
