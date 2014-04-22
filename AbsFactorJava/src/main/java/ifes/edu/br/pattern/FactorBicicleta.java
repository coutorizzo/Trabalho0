/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.br.pattern;

import ifes.edu.br.model.Bicicleta;
import ifes.edu.br.model.ModelGenerico.Acessorio;
import ifes.edu.br.model.ModelGenerico.Banco;
import ifes.edu.br.model.ModelGenerico.Pneu;
import ifes.edu.br.model.ModelGenerico.Quadro;
import ifes.edu.br.model.ModelGenerico.RodaDianteira;
import ifes.edu.br.model.ModelGenerico.RodaTraseira;

/**
 *
 * @author Junior
 */
public interface FactorBicicleta {
    public Bicicleta CriarBicicleta();
    public Pneu CriarPneu();
    public Banco CriarBanco();
    public Quadro CriarQuadro();
    public RodaDianteira CriarRodaDianteira();
    public RodaTraseira CriarRodaTraseira();
    public Acessorio CriarAcessorio();
}
