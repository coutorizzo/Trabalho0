/* 
 * File:   App.cpp
 * Author: Junior
 *
 * Created on 15 de Abril de 2014, 16:09
 */

#include <cstdlib>

#include "FabricadeBiscicletaSpeed.h"
#include "Bicicleta.h"

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    FabricadeBiscicletaSpeed fabricaSpeed =  new FabricadeBiscicletaSpeed();
    Bicicleta bicicleta = fabricaSpeed.CriarBicicleta();
        
    bicicleta.setAcessorio(fabricaSpeed.CriarAcessorio());
    bicicleta.setBanco(fabricaSpeed.CriarBanco());
    bicicleta.setPneu(fabricaSpeed.CriarPneu());
    bicicleta.setQuadro(fabricaSpeed.CriarQuadro());
    bicicleta.setRodaDianteira(fabricaSpeed.CriarRodaDianteira());
    bicicleta.setRodaTraseira(fabricaSpeed.CriarRodaTraseira());
    
    return 0;
}

