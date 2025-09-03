package io.git.arquiteturaeestrutura.estruturaframework2.modelo.api;

import io.git.arquiteturaeestrutura.estruturaframework2.modelo.Ferrari;
import io.git.arquiteturaeestrutura.estruturaframework2.modelo.Motor;
import io.git.arquiteturaeestrutura.estruturaframework2.modelo.TipodaChave;
import io.git.arquiteturaeestrutura.estruturaframework2.modelo.configuration.CarroStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ferrari")
public class FerrariController {
    @Autowired //precisa colocar para retornar os beans
    @Hibrido
    private Motor motor;
    @PostMapping
    public CarroStatus ligarFerrari(@RequestBody TipodaChave chave){
        var ferrari = new Ferrari(motor);
        return ferrari.darIgnicao(chave);

    }
}
