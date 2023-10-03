package pe.edu.upc.aaw.demoparcialdef.serviceinterface;

import pe.edu.upc.aaw.demoparcialdef.entities.University;

import java.util.Arrays;
import java.util.List;

public interface IUniversityService {
    public void insert(University felsuniversity);

    public List<University> list();
}
