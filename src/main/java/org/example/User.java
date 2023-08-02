package org.example;

public class User {
    private String nome;
    private String cognome;
    private String targa;
    private String marca;
    private String immatricolazione;

    public User(String nome, String cognome, String targa, String marca, String immatricolazione) {
        this.nome = nome;
        this.cognome = cognome;
        this.targa = targa;
        this.marca = marca;
        this.immatricolazione = immatricolazione;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    public String getImmatricolazione() {
        return immatricolazione;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setImmatricolazione(String immatricolazione) {
        this.immatricolazione = immatricolazione;
    }
}
