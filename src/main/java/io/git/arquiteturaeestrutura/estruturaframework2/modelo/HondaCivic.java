package io.git.arquiteturaeestrutura.estruturaframework2.modelo;

import java.awt.*;

public class HondaCivic extends Carro{
    public HondaCivic(Motor motor) {
        super(motor);
        setModelo("Honda Civic g10");
        setColor(Color.darkGray);
        setMontadora(Montadora.HONDA);
    }
}
