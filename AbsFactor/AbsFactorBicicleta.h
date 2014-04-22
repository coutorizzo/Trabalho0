/* 
 * File:   AbsFactorBicicleta.h
 * Author: Junior
 *
 * Created on 15 de Abril de 2014, 14:36
 */

#ifndef ABSFACTORBICICLETA_H
#define	ABSFACTORBICICLETA_H

class AbsFactorBicicleta {
public:
    AbsFactorBicicleta();
    AbsFactorBicicleta(const AbsFactorBicicleta& orig);
    
    virtual ~AbsFactorBicicleta();
    virtual Bicicleta CriarBicicleta();
    virtual Pneu CriarPneu();
    virtual Banco CriarBanco();
    virtual Quadro CriarQuadro();
    virtual RodaDianteira CriarRodaDianteira();
    virtual RodaTraseira CriarRodaTraseira();
    virtual Acessorio CriarAcessorio();
    
protected:
    Bicicleta bicicleta;
private:

};

#endif	/* ABSFACTORBICICLETA_H */

