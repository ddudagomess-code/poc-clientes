package br.com.pocclientes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FaturaClienteTest {

    @Test
    void deveCriarFaturaComTodosOsDados() {
        Cliente cliente = new Cliente(1, "Maria", 10);
        FaturaCliente fatura = new FaturaCliente(5, cliente, 200.0);

        assertEquals(5, fatura.getId());
        assertSame(cliente, fatura.getCliente());
        assertEquals(200.0, fatura.getValor(), 0.001);
    }

    @Test
    void deveCriarFaturaSomenteComId() {
        FaturaCliente fatura = new FaturaCliente(5);

        assertEquals(5, fatura.getId());
        assertNull(fatura.getCliente());
        assertEquals(0.0, fatura.getValor(), 0.001);
    }

    @Test
    void deveAlterarClienteEValor() {
        FaturaCliente fatura = new FaturaCliente(5);
        Cliente cliente = new Cliente(1, "Maria", 10);

        fatura.setCliente(cliente);
        fatura.setValor(150.0);

        assertSame(cliente, fatura.getCliente());
        assertEquals(150.0, fatura.getValor(), 0.001);
    }

    @Test
    void deveCalcularValorComDesconto() {
        Cliente cliente = new Cliente(1, "Maria", 10);
        FaturaCliente fatura = new FaturaCliente(5, cliente, 200.0);

        assertEquals(180.0, fatura.getValorComDesconto(), 0.001);
    }

    @Test
    void deveRetornarValorSemDescontoQuandoClienteNaoFoiInformado() {
        FaturaCliente fatura = new FaturaCliente(5);

        assertEquals(0.0, fatura.getValorComDesconto(), 0.001);
    }

    @Test
    void deveRetornarFaturaFormatada() {
        Cliente cliente = new Cliente(1, "Maria", 10);
        FaturaCliente fatura = new FaturaCliente(5, cliente, 200.0);

        assertEquals("Fatura [id=5, cliente=Maria(1)(10%), valor=200.0 ]",
                fatura.toString());
    }
}
