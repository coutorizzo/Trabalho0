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
import ifes.edu.br.model.Speed.AcessorioSpeed;
import ifes.edu.br.model.Speed.BancoSpeed;
import ifes.edu.br.model.Speed.PneuSpeed;
import ifes.edu.br.model.Speed.QuadroSpeed;
import ifes.edu.br.model.Speed.RodaDianteiraSpeed;
import ifes.edu.br.model.Speed.RodaTraseiraSpeed;

/**
 *
 * @author Junior
 */
public class FabricaPasseio extends AbsFactorBicicleta {

    @Override
    public Bicicleta CriarBicicleta() {
        return new Bicicleta();
    }

    @Override
    public Pneu CriarPneu() {
        return new PneuSpeed();
    }

    @Override
    public Banco CriarBanco() {
        return new BancoSpeed();
    }

    @Override
    public Quadro CriarQuadro() {
        return new QuadroSpeed();
    }

    @Override
    public RodaDianteira CriarRodaDianteira() {
        return new RodaDianteiraSpeed();
    }
    

    @Override
    public RodaTraseira CriarRodaTraseira() {
        return new RodaTraseiraSpeed();
    }

    @Override
    public Acessorio CriarAcessorio() {
        return new AcessorioSpeed();
    }

}
