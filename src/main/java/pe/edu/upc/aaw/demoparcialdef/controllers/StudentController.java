package pe.edu.upc.aaw.demoparcialdef.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoparcialdef.dtos.PromQuery;
import pe.edu.upc.aaw.demoparcialdef.dtos.StudentDTO;
import pe.edu.upc.aaw.demoparcialdef.dtos.UniversityDTO;
import pe.edu.upc.aaw.demoparcialdef.entities.Student;
import pe.edu.upc.aaw.demoparcialdef.entities.University;
import pe.edu.upc.aaw.demoparcialdef.repositories.IUniversityRepository;
import pe.edu.upc.aaw.demoparcialdef.serviceinterface.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private IStudentService felsiS;

    @Autowired
    private IUniversityRepository felsuR;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody StudentDTO felsdto) {
        ModelMapper felsm = new ModelMapper();
        Student felsi = felsm.map(felsdto, Student.class);
        felsiS.insert(felsi);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<StudentDTO> listar() {
        return felsiS.list().stream().map(felsx->{
            ModelMapper felsm=new ModelMapper();
            return felsm.map(felsx,StudentDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/ig/{qualification}")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<StudentDTO> listarLibroPerEmail2(@PathVariable ("qualification")String felsqua){
        List<String[]> felslista=felsiS.listarprom(Double.parseDouble(felsqua));
        List<StudentDTO> felslistaDTO = new ArrayList<>();
        for (String[] data:felslista){
            StudentDTO felsdto = new StudentDTO();
            felsdto.setFelsidStudent(Integer.parseInt(data[0]));
            felsdto.setFelscode((data[1]));
            felsdto.setFelscode((data[2]));
            felsdto.setFelsweightedAverage(Double.parseDouble(data[3]));

            felsdto.setFelsuniversity(felsuR.findById(Long.parseLong(data[4])).orElse(new University()));
            felslistaDTO.add(felsdto);
        }
        return felslistaDTO;
    }//

    @GetMapping("/listarxAddxname/{qualification}")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<PromQuery> listarxAddxname(@PathVariable ("qualification")String felsquali){
        List<String[]> felslista=felsiS.listarxAddxname(felsquali);
        List<PromQuery> felslistaDTO = new ArrayList<>();
        for (String[] data:felslista){
            PromQuery felsdto = new PromQuery();
            felsdto.setFelsNameUni(data[0]);
            felsdto.setFelsCountUni(Integer.parseInt(data[1]));
            felslistaDTO.add(felsdto);
        }
        return felslistaDTO;
    }


    @GetMapping("/name/{nameUni}")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<StudentDTO> listarxUni(@PathVariable("nameUni") String felsnameUni) {
        return felsiS.findByFelsuniversityFelsname(felsnameUni).stream().map(felsx->{
            ModelMapper felsm=new ModelMapper();
            return felsm.map(felsx,StudentDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/nameOrder/{nameUni}")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<StudentDTO> listarxUniOrder(@PathVariable("nameUni") String felsnameUni) {
        return felsiS.findByFelsuniversityFelsnameOrderByFelsname(felsnameUni).stream().map(felsx->{
            ModelMapper felsm=new ModelMapper();
            return felsm.map(felsx,StudentDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/namesID/{IDUni}")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<StudentDTO> listarxIdUni(@PathVariable("IDUni") Long felsidUni) {
        return felsiS.findByFelsuniversityFelsidUniversity(felsidUni).stream().map(felsx->{
            ModelMapper felsm=new ModelMapper();
            return felsm.map(felsx,StudentDTO.class);
        }).collect(Collectors.toList());
    }


    @GetMapping("/namessss/{promE}")
    @PreAuthorize("hasAnyAuthority('ADMIN')")
    public List<StudentDTO> promGreather(@PathVariable("promE") String felspromE) {
        return felsiS.findByFelsweightedAverageGreaterThanEqualOrderByFelsname(Double.parseDouble(felspromE)).stream().map(felsx->{
            ModelMapper felsm=new ModelMapper();
            return felsm.map(felsx,StudentDTO.class);
        }).collect(Collectors.toList());
    }




}
