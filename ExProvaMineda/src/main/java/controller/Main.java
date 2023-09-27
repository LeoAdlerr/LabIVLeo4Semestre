package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.provaminedaex.demo.entity.TraTrabalho;
import com.provaminedaex.demo.service.ITraTrabalhoService;

@RestController
@RequestMapping(value = "/trabalho")
@CrossOrigin
public class Main {
	@Autowired
    private ITraTrabalhoService serviceTrabalho;

    @GetMapping
    public List<TraTrabalho> buscarTudo() {
        return serviceTrabalho.buscarTudo();
    }
}
