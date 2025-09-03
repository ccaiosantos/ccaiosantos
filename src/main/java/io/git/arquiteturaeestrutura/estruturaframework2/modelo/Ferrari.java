package io.git.arquiteturaeestrutura.estruturaframework2.modelo;

import java.awt.*;

public class Ferrari extends Carro{
    public Ferrari(Motor motor) {
        super(motor);
        setModelo("Ferrari Antiga");
        setColor(Color.red);
        setMontadora(Montadora.FERRARI);
    }
}
