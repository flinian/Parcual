package pe.edu.upc.aaw.demoparcialdef.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.demoparcialdef.entities.Student;
import pe.edu.upc.aaw.demoparcialdef.repositories.IStudentRepository;
import pe.edu.upc.aaw.demoparcialdef.serviceinterface.IStudentService;

import java.util.List;

@Service
public class StudentServiceImplement implements IStudentService {
    @Autowired
    private IStudentRepository felssR;
    @Override
    public List<Student> list() {
        return felssR.findAll();
    }

    @Override
    public List<String[]> listarprom(Double felsPromE) {
        return felssR.listarprom(felsPromE);
    }

    @Override
    public void insert(Student felsstudent) {
        felssR.save(felsstudent);
    }

    @Override
    public List<String[]> listarxAddxname(String felsUniNombre) {
        return felssR.listarxAddxname(felsUniNombre);
    }

    @Override
    public List<Student> findByFelsuniversityFelsname(String felsnameUni) {
        return felssR.findByFelsuniversityFelsname(felsnameUni);
    }

    @Override
    public List<Student> findByFelsuniversityFelsnameOrderByFelsname(String felsnameUni) {
        return felssR.findByFelsuniversityFelsnameOrderByFelsname(felsnameUni);
    }

    @Override
    public List<Student> findByFelsweightedAverageGreaterThanEqualOrderByFelsname(Double felspromW) {
        return felssR.findByFelsweightedAverageGreaterThanEqualOrderByFelsname(felspromW);
    }

    @Override
    public List<Student> findByFelsuniversityFelsidUniversity(Long felsnameUni) {
        return felssR.findByFelsuniversityFelsidUniversity(felsnameUni);
    }

}
