/* 
 * File:   Bicicleta.cpp
 * Author: Junior
 * 
 * Created on 15 de Abril de 2014, 15:21
 */

#include "Bicicleta.h"

Bicicleta::Bicicleta() {
}

Bicicleta::Bicicleta(const Bicicleta& orig) {
}

Bicicleta::~Bicicleta() {
}

void Bicicleta::setAcessorio(Acessorio acessorio) {
    this->acessorio = acessorio;
}

void Bicicleta::setBanco(Banco banco) {
    this->banco = banco;
}

void Bicicleta::setPneu(Pneu pneu) {
    this->pneu = pneu;
}

void Bicicleta::setQuadro(Quadro quadro) {
this->quadro = quadro;
}

void Bicicleta::setRodaDianteira(RodaDianteira rodaDianteira) {
    this->rodaDianteira = rodaDianteira;
}

void Bicicleta::setRodaTraseira(RodaTraseira rodaTraseira) {
    this->rodaTraseira = rodaTraseira;
}


