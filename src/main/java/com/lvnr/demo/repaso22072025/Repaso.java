package com.lvnr.demo.repaso22072025;

import com.lvnr.demo.repaso22072025.dto.PersonaDto;
import com.lvnr.demo.repaso22072025.service.PersonaService;

public class Repaso {
    public static void main(String[] args) {
        PersonaService personaService=new PersonaService();
        PersonaDto personaDto=personaService.crearPersona(1234,"Carlos","Martinez Rodriguez");
        System.out.println("Cedula: " + personaDto.getCedula()+ ", Nombre: " +personaDto.getNombre()+ ", Apellidos: " +personaDto.getApellidos());




    }
}
