package io.git.arquiteturaeestrutura.estruturaframework2.modelo.api;

import io.git.arquiteturaeestrutura.estruturaframework2.modelo.HondaCivic;
import io.git.arquiteturaeestrutura.estruturaframework2.modelo.Motor;
import io.git.arquiteturaeestrutura.estruturaframework2.modelo.TipodaChave;
import io.git.arquiteturaeestrutura.estruturaframework2.modelo.configuration.CarroStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TestController {
    @Autowired
    @Qualifier("gasolina")
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCivic(@RequestBody TipodaChave chave){
        var carro = new HondaCivic(motor);
         return carro.darIgnicao(chave);
    }


}
