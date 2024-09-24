/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.entities;

/**
 *
 * @author admin
 */
public class Candidato {
    
    public String nome, desenvolvedor, numero, fotojogo;
    public int votos;

    public Candidato(String nome, String desenvolvedor, String fotojogo, String numero) {
        this.nome = nome;
        this.desenvolvedor = desenvolvedor;
        this.numero = numero;
        this.votos = 0;
        this.fotojogo = fotojogo;
    }
    
    public int getVotos() {
        return votos;
    }
    
    public void setVotos(int votos) {
        this.votos = votos;
    }
    
    public void addVoto() {
        this.votos++;
    }
}
