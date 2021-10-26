package rjr.studio.Dozer.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rjr.studio.Dozer.entity.AnagraficaEntity;
import rjr.studio.Dozer.repository.AnagraficaRepository;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = { @Autowired })
public class AnagraficaService {

    private final AnagraficaRepository anagraficaRepository;

    public List<AnagraficaEntity> getListaAnagrafiche() {
        List<AnagraficaEntity> found = anagraficaRepository.findAll();

        found.forEach(a -> System.out.println(a.toString()));

        return found;
    }
}
