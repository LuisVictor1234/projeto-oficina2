package attpoo.model;


public class Veiculo implements Identificavel {
    private int id;
    private String placa;
    private String modelo;

    public Veiculo(int id, String placa, String modelo) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
    }

    @Override
    public int getId() {
        return id;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return modelo + " - " + placa + " (ID: " + id + ")";
    }

    public String toString(boolean detalhado) {
        if (detalhado) {
            return "Modelo: " + modelo + ", Placa: " + placa + ", ID: " + id;
        }
        return toString();
    }
}