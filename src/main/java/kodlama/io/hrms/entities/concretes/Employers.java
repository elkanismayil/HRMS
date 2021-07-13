package kodlama.io.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "employers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employers implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "company_name")
    @UniqueElements(message = "Company name cannot be repeated")
    @NotBlank(message = "Company Name is mandatory")
    @NotNull(message = "Company Name cannot be null value")
    private String companyName;

    @Column(name = "email")
    @UniqueElements(message = "Email cannot be repeated")
    @NotBlank(message = "Email is mandatory")
    @NotNull(message = "Email cannot be null value")
    @Email
    private String email;

    @Column(name = "phone_number")
    @UniqueElements(message = "Phone number name cannot be repeated")
    @NotBlank(message = "Phone number is mandatory")
    @NotNull(message = "Phone number cannot be null value")
    private String phoneNumber;

    @Column(name = "active")
    private Boolean isActive;
}
