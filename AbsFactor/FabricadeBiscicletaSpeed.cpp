/* 
 * File:   FabricadeBiscicletaSpeed.cpp
 * Author: Junior
 * 
 * Created on 15 de Abril de 2014, 15:09
 */

#include "FabricadeBiscicletaSpeed.h"
#include "Acessorio.h"
#include "PneuSlim.h"

FabricadeBiscicletaSpeed::FabricadeBiscicletaSpeed() {
}

FabricadeBiscicletaSpeed::FabricadeBiscicletaSpeed(const FabricadeBiscicletaSpeed& orig) {
}

FabricadeBiscicletaSpeed::~FabricadeBiscicletaSpeed() {
}

Bicicleta FabricadeBiscicletaSpeed::CriarBicicleta() {
    return new Bicicleta();
}


RodaDianteira FabricadeBiscicletaSpeed::CriarRodaDianteira() {
    return new RodaDianteiraSpeed();
}

RodaTraseira FabricadeBiscicletaSpeed::CriarRodaTraseira() {
    return new RodaTraseiraSpeed();
}

Acessorio FabricadeBiscicletaSpeed::CriarAcessorio() {
    return new Acessorio();
}

Pneu FabricadeBiscicletaSpeed::CriarPneu() {
    return new PneuSlim();
}

Banco FabricadeBiscicletaSpeed::CriarBanco() {
    return new Banco();
}

Quadro FabricadeBiscicletaSpeed::CriarQuadro() {
    return new Quadro();
}
