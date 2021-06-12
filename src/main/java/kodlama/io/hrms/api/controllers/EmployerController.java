package kodlama.io.hrms.api.controllers;

import kodlama.io.hrms.business.abstracts.EmployerService;
import kodlama.io.hrms.entities.concretes.Employers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employer")
public class EmployerController {

    private EmployerService service;

    @Autowired
    public EmployerController(EmployerService service) {
        this.service = service;
    }

    @RequestMapping(value = "/get_all_employers", method = RequestMethod.GET)
    public List<Employers> getAll() {
        return service.findAll();
    }
}
