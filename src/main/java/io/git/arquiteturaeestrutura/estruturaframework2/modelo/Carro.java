package io.git.arquiteturaeestrutura.estruturaframework2.modelo;

import io.git.arquiteturaeestrutura.estruturaframework2.modelo.configuration.CarroStatus;

import java.awt.*;

public class Carro {
    private String modelo;
    private Montadora montadora;
    private Motor motor;
    private Color color;
    //construtor pois o carro depende do motor
    public Carro(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public CarroStatus darIgnicao(TipodaChave chave) {
        if(chave.getMontadora() != this.montadora){
            return new CarroStatus("Não é possivel iniciar carro com essa chave");
        }
        return new CarroStatus("Carro "+modelo+ " ligado, motor "+motor);
    }

}
