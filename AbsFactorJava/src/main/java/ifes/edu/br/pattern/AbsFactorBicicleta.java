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

/**
 *
 * @author Junior
 */
public abstract class AbsFactorBicicleta implements FactorBicicleta{

    abstract public Bicicleta CriarBicicleta();
    abstract public Pneu CriarPneu();
    abstract public Banco CriarBanco();
    abstract public Quadro CriarQuadro();
    abstract public RodaDianteira CriarRodaDianteira();
    abstract public RodaTraseira CriarRodaTraseira();
    abstract public Acessorio CriarAcessorio();
}
