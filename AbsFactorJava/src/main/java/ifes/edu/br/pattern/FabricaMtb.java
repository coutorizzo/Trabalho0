/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.edu.br.pattern;

import ifes.edu.br.model.ModelGenerico.Acessorio;
import ifes.edu.br.model.ModelGenerico.Banco;
import ifes.edu.br.model.Bicicleta;
import ifes.edu.br.model.ModelGenerico.Pneu;
import ifes.edu.br.model.ModelGenerico.Quadro;
import ifes.edu.br.model.ModelGenerico.RodaDianteira;
import ifes.edu.br.model.ModelGenerico.RodaTraseira;
import ifes.edu.br.model.Mtb.AcessorioMtb;
import ifes.edu.br.model.Mtb.BancoMtb;
import ifes.edu.br.model.Mtb.PneuMtb;
import ifes.edu.br.model.Mtb.QuadroMtb;
import ifes.edu.br.model.Mtb.RodaDianteiraMtb;
import ifes.edu.br.model.Mtb.RodaTraseiraMtb;

/**
 *
 * @author Junior
 */
public class FabricaMtb extends AbsFactorBicicleta {

    @Override
    public Bicicleta CriarBicicleta() {
        return new Bicicleta();
    }

    @Override
    public Pneu CriarPneu() {
        return new PneuMtb();
    }

    @Override
    public Banco CriarBanco() {
        return new BancoMtb();
    }

    @Override
    public Quadro CriarQuadro() {
        return new QuadroMtb();
    }

    @Override
    public RodaDianteira CriarRodaDianteira() {
        return new RodaDianteiraMtb();
    }
    

    @Override
    public RodaTraseira CriarRodaTraseira() {
        return new RodaTraseiraMtb();
    }

    @Override
    public Acessorio CriarAcessorio() {
        return new AcessorioMtb();
    }

}
