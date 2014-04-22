/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.br.pattern;

import ifes.edu.br.model.Bicicleta;

/**
 *
 * @author Junior
 */
public class Diretor {
   private FactorBicicleta factorBicicleta;

    public void setFactorBicicleta(FactorBicicleta factorBicicleta) {
        this.factorBicicleta = factorBicicleta;
    }
   public Bicicleta criarBicicleta()
    {
        factorBicicleta.CriarQuadro();
        factorBicicleta.CriarBanco();
        factorBicicleta.CriarRodaDianteira();
        factorBicicleta.CriarRodaTraseira();
        factorBicicleta.CriarAcessorio();
        return factorBicicleta.CriarBicicleta();
        
    }

}
