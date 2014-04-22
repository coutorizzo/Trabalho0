package ifes.edu.br.absfactorjava;

import ifes.edu.br.model.Bicicleta;
import ifes.edu.br.pattern.Diretor;
import ifes.edu.br.pattern.FabricaMtb;
import ifes.edu.br.pattern.FabricaPasseio;
import ifes.edu.br.pattern.FabricaSpeed;
import ifes.edu.br.pattern.FabricadeFabricas;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        
//    FabricaSpeed fabricaSpeed =  new FabricaSpeed();
//    Bicicleta bicicletaSpeed = fabricaSpeed.CriarBicicleta();
//    
//    bicicletaSpeed.setAcessorio(fabricaSpeed.CriarAcessorio());
//    bicicletaSpeed.setBanco(fabricaSpeed.CriarBanco());
//    bicicletaSpeed.setPneu(fabricaSpeed.CriarPneu());
//    bicicletaSpeed.setQuadro(fabricaSpeed.CriarQuadro());
//    bicicletaSpeed.setRodaDianteira(fabricaSpeed.CriarRodaDianteira());
//    bicicletaSpeed.setRodaTraseira(fabricaSpeed.CriarRodaTraseira());
//    
//    
//    FabricaPasseio fabricaPasseio = new FabricaPasseio();
//    Bicicleta bicicletaPasseio = fabricaPasseio.CriarBicicleta();
//
//    bicicletaPasseio.setQuadro(fabricaPasseio.CriarQuadro());
//    bicicletaPasseio.setBanco(fabricaPasseio.CriarBanco());
//    bicicletaPasseio.setRodaDianteira(fabricaPasseio.CriarRodaDianteira());
//    bicicletaPasseio.setRodaTraseira(fabricaPasseio.CriarRodaTraseira());
//    bicicletaPasseio.setPneu(fabricaPasseio.CriarPneu());
//    bicicletaPasseio.setAcessorio(fabricaPasseio.CriarAcessorio());
//
//    
//    
//    FabricaMtb fabricaMtb = new FabricaMtb();
//    Bicicleta bicicletaMtb = fabricaMtb.CriarBicicleta();
//    
//    bicicletaMtb.setAcessorio(fabricaMtb.CriarAcessorio());
//    bicicletaMtb.setBanco(fabricaMtb.CriarBanco());
//    bicicletaMtb.setPneu(fabricaMtb.CriarPneu());
//    bicicletaMtb.setQuadro(fabricaMtb.CriarQuadro());
//    bicicletaMtb.setRodaDianteira(fabricaMtb.CriarRodaDianteira());
//    bicicletaMtb.setRodaTraseira(fabricaMtb.CriarRodaTraseira());
//    
//    
    
    
    FabricadeFabricas fabavifaci = new FabricadeFabricas();
//    
//    FabricaSpeed fabricaSpeed =  fabavifaci.CriarFabricaSpeed();
//    Bicicleta bicicletaSpeed = fabricaSpeed.CriarBicicleta();   
//    
//    bicicletaSpeed.setAcessorio(fabricaSpeed.CriarAcessorio());
//    bicicletaSpeed.setBanco(fabricaSpeed.CriarBanco());
//    bicicletaSpeed.setPneu(fabricaSpeed.CriarPneu());
//    bicicletaSpeed.setQuadro(fabricaSpeed.CriarQuadro());
//    bicicletaSpeed.setRodaDianteira(fabricaSpeed.CriarRodaDianteira());
//    bicicletaSpeed.setRodaTraseira(fabricaSpeed.CriarRodaTraseira());
//    
//    
//    FabricaPasseio fabricaPasseio = fabavifaci.CriarFabricaPasseio();
//    Bicicleta bicicletaPasseio = fabricaPasseio.CriarBicicleta();
//    bicicletaPasseio.setAcessorio(fabricaPasseio.CriarAcessorio());
//    bicicletaPasseio.setBanco(fabricaPasseio.CriarBanco());
//    bicicletaPasseio.setPneu(fabricaPasseio.CriarPneu());
//    bicicletaPasseio.setQuadro(fabricaPasseio.CriarQuadro());
//    bicicletaPasseio.setRodaDianteira(fabricaPasseio.CriarRodaDianteira());
//    bicicletaPasseio.setRodaTraseira(fabricaPasseio.CriarRodaTraseira());
//    
//    FabricaMtb fabricaMtb = fabavifaci.CriarFabricaMtb();
//    Bicicleta bicicletaMtb = fabricaMtb.CriarBicicleta();
//    bicicletaMtb.setAcessorio(fabricaMtb.CriarAcessorio());
//    bicicletaMtb.setBanco(fabricaMtb.CriarBanco());
//    bicicletaMtb.setPneu(fabricaMtb.CriarPneu());
//    bicicletaMtb.setQuadro(fabricaMtb.CriarQuadro());
//    bicicletaMtb.setRodaDianteira(fabricaMtb.CriarRodaDianteira());
//    bicicletaMtb.setRodaTraseira(fabricaMtb.CriarRodaTraseira());
        
        Diretor eltonGordoRizzo = new Diretor();
//        eltonGordoRizzo.setFactorBicicleta(new FabricaPasseio());
        eltonGordoRizzo.setFactorBicicleta(fabavifaci.CriarFabricaMtb());
        Bicicleta bicicleta = eltonGordoRizzo.criarBicicleta();
        
        
        
    }
}
