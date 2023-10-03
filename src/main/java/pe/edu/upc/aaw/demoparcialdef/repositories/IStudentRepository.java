package pe.edu.upc.aaw.demoparcialdef.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demoparcialdef.entities.Student;

import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {
    @Query(value = "select s.felsid_student, s.felscode, s.felsname, s.felsweighted_average, s.felsid_university from student s\n" +
            " where s.felsweighted_average>=:felsPromE order by felsname asc", nativeQuery = true)
    public List<String[]> listarprom(double felsPromE);

    @Query(value = "select u.felsname, count(s.felsid_student) from student s\n" +
            "join university u on s.felsid_university=u.felsid_university\n" +
            "where u.felsaddress='z' and u.felsname=:felsUniNombre group by u.felsname ", nativeQuery = true)
    public List<String[]> listarxAddxname(String felsUniNombre);

    public List<Student> findByFelsuniversityFelsname(String felsnameUni);
    public List<Student> findByFelsuniversityFelsnameOrderByFelsname(String felsnameUni);
    public List<Student> findByFelsweightedAverageGreaterThanEqualOrderByFelsname(Double felspromW);
    public List<Student> findByFelsuniversityFelsidUniversity(Long felsnameUni);
}
