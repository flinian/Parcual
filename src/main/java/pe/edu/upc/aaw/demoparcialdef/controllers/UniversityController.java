package pe.edu.upc.aaw.demoparcialdef.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.demoparcialdef.dtos.UniversityDTO;
import pe.edu.upc.aaw.demoparcialdef.entities.University;
import pe.edu.upc.aaw.demoparcialdef.serviceinterface.IUniversityService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/universities")
public class UniversityController {
    @Autowired
    private IUniversityService felsuS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public void registrar(@RequestBody UniversityDTO felsdto) {
        ModelMapper felsm = new ModelMapper();
        University felsu = felsm.map(felsdto, University.class);
        felsuS.insert(felsu);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<UniversityDTO> listar() {
        return felsuS.list().stream().map(felsx->{
            ModelMapper felsm=new ModelMapper();
            return felsm.map(felsx,UniversityDTO.class);
        }).collect(Collectors.toList());
    }
}
