package kodlama.io.hrms.entities.concretes;

import lombok.*;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "job_seekers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class JobSeekers implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    @UniqueElements(message = "First name cannot be repeated")
    @NotBlank(message = "First name is mandatory")
    @NotNull(message = "First name cannot be null value")
    @NonNull
    private String firstName;

    @Column(name = "last_name")
    @UniqueElements(message = "Last name cannot be repeated")
    @NotBlank(message = "Last name is mandatory")
    @NotNull(message = "Last name cannot be null value")
    @NonNull
    private String lastName;

    @Column(name = "identification")
    @UniqueElements
    @NotBlank(message = "Identification is mandatory")
    @NotNull
    @NonNull
    private String identification;

    @Column(name = "email")
    @UniqueElements(message = "Email cannot be repeated")
    @NotBlank(message = "Email is mandatory")
    @NotNull(message = "Email cannot be null value")
    @Email
    @NonNull
    private String email;

    @Column(name = "password")
    @NotNull
    @NonNull
    private String password;

    @Column(name = "confirm_password")
    @NotNull
    @NonNull
    private String confirmPassword;
}
