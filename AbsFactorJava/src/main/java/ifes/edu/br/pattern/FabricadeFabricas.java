/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ifes.edu.br.pattern;

/**
 *
 * @author Junior
 */
public class FabricadeFabricas {
    public FabricaMtb CriarFabricaMtb(){
       return new FabricaMtb();
    }
    public FabricaPasseio CriarFabricaPasseio(){
        return new FabricaPasseio();
    }
    public FabricaSpeed CriarFabricaSpeed(){
        return new FabricaSpeed();
    }
}
