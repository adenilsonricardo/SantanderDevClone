package com.example.santanderdevclone.data.local

import com.example.santanderdevclone.data.Cartao
import com.example.santanderdevclone.data.Cliente
import com.example.santanderdevclone.data.Conta

class FakeData {

    fun getLocalData() : Conta {
        val cliente = Cliente("Olá, Victor")
        val cartao = Cartao("123456789")
        val conta = Conta(
            "123456-7",
            "1234-5",
            "2345,67",
            "3456,72",
            cliente,
            cartao
        )
        return conta;
    }
}