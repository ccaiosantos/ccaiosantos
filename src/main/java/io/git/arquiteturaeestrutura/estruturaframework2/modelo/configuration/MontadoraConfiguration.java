package io.git.arquiteturaeestrutura.estruturaframework2.modelo.configuration;

import io.git.arquiteturaeestrutura.estruturaframework2.modelo.Motor;
import io.git.arquiteturaeestrutura.estruturaframework2.modelo.TipodoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {
    @Bean(name = "gasolina")
    @Primary
    public Motor motorf1(){
        var motor = new Motor();
        motor.setModelo("MOTORF1");
        motor.setTipodoMotor(TipodoMotor.GASOLINA);
        motor.setCilindros(250);
        motor.setCavalos(650);
        motor.setLitragem(2);
        return motor;
    }
    @Bean(name = "eletrico")
    public Motor motoreletrico(){
        var motor = new Motor();
        motor.setModelo("v8");
        motor.setTipodoMotor(TipodoMotor.ELETRICO);
        motor.setCilindros(250);
        motor.setCavalos(750);
        motor.setLitragem(2);
        return motor;
    }
    @Bean(name = "hibrido")
    public Motor motorhibirdo(){
        var motor = new Motor();
        motor.setModelo("v10");
        motor.setTipodoMotor(TipodoMotor.HIBRIDO);
        motor.setCilindros(250);
        motor.setCavalos(1200);
        motor.setLitragem(2);
        return motor;
    }
}
