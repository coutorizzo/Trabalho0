/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.br.model;

import ifes.edu.br.model.ModelGenerico.Banco;
import ifes.edu.br.model.ModelGenerico.Pneu;
import ifes.edu.br.model.ModelGenerico.Quadro;
import ifes.edu.br.model.ModelGenerico.RodaTraseira;
import ifes.edu.br.model.ModelGenerico.RodaDianteira;
import ifes.edu.br.model.ModelGenerico.Acessorio;

/**
 *
 * @author Junior
 */
public class Bicicleta {
    Acessorio acessorio;
    Banco banco;
    Pneu pneu;
    Quadro quadro;
    RodaDianteira rodaDianteira;
    RodaTraseira rodaTraseira;

    public Acessorio getAcessorio() {
        return acessorio;
    }

    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Pneu getPneu() {
        return pneu;
    }

    public void setPneu(Pneu pneu) {
        this.pneu = pneu;
    }

    public Quadro getQuadro() {
        return quadro;
    }

    public void setQuadro(Quadro quadro) {
        this.quadro = quadro;
    }

    public RodaDianteira getRodaDianteira() {
        return rodaDianteira;
    }

    public void setRodaDianteira(RodaDianteira rodaDianteira) {
        this.rodaDianteira = rodaDianteira;
    }

    public RodaTraseira getRodaTraseira() {
        return rodaTraseira;
    }

    public void setRodaTraseira(RodaTraseira rodaTraseira) {
        this.rodaTraseira = rodaTraseira;
    }
    
}
