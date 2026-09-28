package br.edu.aesa.model;

public class Veiculo {
    private int id;
    private String placa;
    private String modelo;
    private String marca;
    private int ano;

    public Veiculo(int id, String placa, String modelo, String marca, int ano) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String exibirDetalhes(){
        return "ID "+getId()+" PLACA "+getPlaca()+" MODELO "+getModelo()+" MARCA "+getMarca()+" ANO "+getAno();

    }



}
