package com.lvnr.demo.repaso22072025.service;

import com.lvnr.demo.repaso22072025.dto.PersonaDto;

public class PersonaService {
    PersonaDto personaDto=new  PersonaDto();

    public PersonaDto crearPersona (int cedula, String nombre, String apellidos){
        PersonaDto personaDto = new PersonaDto();
        personaDto.setCedula(cedula);
        personaDto.setNombre(nombre);
        personaDto.setApellidos(apellidos);
        return personaDto;






    }
}
