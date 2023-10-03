package pe.edu.upc.aaw.demoparcialdef.serviceinterface;


import pe.edu.upc.aaw.demoparcialdef.entities.Student;
import pe.edu.upc.aaw.demoparcialdef.entities.University;

import java.util.Arrays;
import java.util.List;
public interface IStudentService {
    public List<Student> list();
    public List<String[]> listarprom(Double felsPromE);
    public void insert(Student felsstudent);

    public List<String[]> listarxAddxname(String felsUniNombre);

    public List<Student> findByFelsuniversityFelsname(String felsnameUni);
    public List<Student> findByFelsuniversityFelsnameOrderByFelsname(String felsnameUni);
    public List<Student> findByFelsweightedAverageGreaterThanEqualOrderByFelsname(Double felspromW);
    public List<Student> findByFelsuniversityFelsidUniversity(Long felsnameUni);
}
