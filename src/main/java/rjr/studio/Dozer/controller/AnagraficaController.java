package rjr.studio.Dozer.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rjr.studio.Dozer.entity.AnagraficaEntity;
import rjr.studio.Dozer.service.AnagraficaService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class AnagraficaController {

    private final AnagraficaService anagraficaService;

    @GetMapping("/anagrafica")
    public List<AnagraficaEntity> getListaAnagrafiche() {

        List<AnagraficaEntity> found = anagraficaService.getListaAnagrafiche();

        return found;
    }
}
