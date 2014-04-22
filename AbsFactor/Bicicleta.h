/* 
 * File:   Bicicleta.h
 * Author: Junior
 *
 * Created on 15 de Abril de 2014, 15:21
 */

#ifndef BICICLETA_H
#define	BICICLETA_H

#include "RodaDianteira.h"
#include "RodaTraseira.h"
#include "Pneu.h"


class Bicicleta {
public:
    Bicicleta();
    Bicicleta(const Bicicleta& orig);
    virtual ~Bicicleta();
    void setRodaDianteira(RodaDianteira rodaDianteira);
    void setRodaTraseira(RodaTraseira rodaTraseira);
    void setPneu(Pneu pneu);
    void setQuadro(Quadro quadro);
    void setAcessorio(Acessorio acessorio);
    void setBanco(Banco banco);
private:
    RodaDianteira rodaDianteira;
    RodaTraseira rodaTraseira;
    Pneu pneu;
    Quadro quadro;
    Banco banco;
    Acessorio acessorio;
    
    

};

#endif	/* BICICLETA_H */

