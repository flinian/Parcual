package pe.edu.upc.aaw.demoparcialdef.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.aaw.demoparcialdef.entities.University;
import pe.edu.upc.aaw.demoparcialdef.repositories.IUniversityRepository;
import pe.edu.upc.aaw.demoparcialdef.serviceinterface.IUniversityService;


import java.util.List;

@Service
public class UniversityServiceImplement implements IUniversityService {
    @Autowired
    private IUniversityRepository felsuR;

    @Override
    public void insert(University felsuniversity) {
        felsuR.save(felsuniversity);
    }

    @Override
    public List<University> list() {
        return felsuR.findAll();
    }
}
