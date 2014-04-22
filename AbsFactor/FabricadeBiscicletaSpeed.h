/* 
 * File:   FabricadeBiscicletaSpeed.h
 * Author: Junior
 *
 * Created on 15 de Abril de 2014, 15:09
 */

#ifndef FABRICADEBISCICLETASPEED_H
#define	FABRICADEBISCICLETASPEED_H

#include "AbsFactorBicicleta.h"

class FabricadeBiscicletaSpeed : AbsFactorBicicleta {
public:
    FabricadeBiscicletaSpeed();
    FabricadeBiscicletaSpeed(const FabricadeBiscicletaSpeed& orig);
    virtual ~FabricadeBiscicletaSpeed();
    virtual Banco CriarBanco();
    virtual Quadro CriarQuadro();
    virtual Acessorio CriarAcessorio();
    virtual Pneu CriarPneu();
    virtual RodaDianteira CriarRodaDianteira();
    virtual RodaTraseira CriarRodaTraseira();
    virtual Bicicleta CriarBicicleta();

private:

};

#endif	/* FABRICADEBISCICLETASPEED_H */

