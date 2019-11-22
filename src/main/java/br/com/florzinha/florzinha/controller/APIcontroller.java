package br.com.florzinha.florzinha.controller;

import br.com.florzinha.florzinha.model.Florzinha;
import br.com.florzinha.florzinha.repository.FlorzinhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class APIcontroller {

    @Autowired
    FlorzinhaRepository florzinhaRepository;

    @RequestMapping("/florzinhaNome")
    public List<Florzinha> getFlorzinhaByNome(){
        return florzinhaRepository.findByNome("rosa");
    }

    @RequestMapping("/florzinhas")
    public List<Florzinha> getFlorzinhas(){
        return florzinhaRepository.findAll();
    }

    @RequestMapping("/createFlorzinha")
    public Florzinha createFlorzinha(){
        Florzinha f = new Florzinha("NOVA", "FLORZINHA");
        florzinhaRepository.save(f);
        return f;
    }


    @RequestMapping("/api")
    public String index(){
        return "hello world";
    }
}
