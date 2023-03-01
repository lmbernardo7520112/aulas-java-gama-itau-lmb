package br.com.itau;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
    @Test
    void NumeroiInteiro_NumeroValido_retornaTextoNumero() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String resposta = fizzBuzz.converte(1);

        assertEquals("1", resposta);
    }
}
