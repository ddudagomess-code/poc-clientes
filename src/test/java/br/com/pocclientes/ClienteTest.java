package br.com.pocclientes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveCriarClienteEConsultarAtributos() {
        Cliente cliente = new Cliente(1, "Maria", 10);

        assertEquals(1, cliente.getId());
        assertEquals("Maria", cliente.getNome());
        assertEquals(10, cliente.getDesconto());
        assertEquals("nd", cliente.getGenero());
    }
    
    @Test
void naoDevePermitirDescontoNegativo() {
    Cliente cliente = new Cliente(2, "Ana", -10);

    assertTrue(cliente.getDesconto() >= 0);
}

    @Test
    void deveAlterarDesconto() {
        Cliente cliente = new Cliente(1, "Maria", 10);

        cliente.setDesconto(15);

        assertEquals(15, cliente.getDesconto());
    }

    @Test
    void deveRetornarClienteFormatado() {
        Cliente cliente = new Cliente(1, "Maria", 10);

        assertEquals("Maria(1)(10%)", cliente.toString());
    }
}
