package pe.edu.upc.aaw.demoparcialdef.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.demoparcialdef.entities.University;

@Repository
public interface IUniversityRepository extends JpaRepository<University,Long> {
}
