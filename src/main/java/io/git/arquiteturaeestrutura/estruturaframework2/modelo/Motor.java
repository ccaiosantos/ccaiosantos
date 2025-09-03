package io.git.arquiteturaeestrutura.estruturaframework2.modelo;

public class Motor {
    private String modelo;
    private Integer cilindros;
    private TipodoMotor tipodoMotor;
    private Integer cavalos;
    private Integer litragem;

    public Integer getCavalos() {
        return cavalos;
    }

    public void setCavalos(Integer cavalos) {
        this.cavalos = cavalos;
    }

    public Integer getLitragem() {
        return litragem;
    }

    public void setLitragem(Integer litragem) {
        this.litragem = litragem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getCilindros() {
        return cilindros;
    }

    public void setCilindros(Integer cilindros) {
        this.cilindros = cilindros;
    }

    public TipodoMotor getTipodoMotor() {
        return tipodoMotor;
    }

    public void setTipodoMotor(TipodoMotor tipodoMotor) {
        this.tipodoMotor = tipodoMotor;
    }

    @Override
    public String   toString() {
        return "Motor{" +
                "modelo='" + modelo + '\'' +
                ", cilindros=" + cilindros +
                ", tipodoMotor=" + tipodoMotor +
                ", cavalos=" + cavalos +
                ", litragem=" + litragem +
                '}';
    }
}
