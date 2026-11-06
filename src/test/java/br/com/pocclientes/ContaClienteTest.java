package br.com.pocclientes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaClienteTest {

    @Test
    void deveCriarContaComSaldoInformado() {
        Cliente cliente = new Cliente(1, "Maria", 10);
        ContaCliente conta = new ContaCliente(7, cliente, 100.0);

        assertEquals(7, conta.getId());
        assertSame(cliente, conta.getCliente());
        assertEquals(100.0, conta.getSaldo(), 0.001);
    }

    @Test
    void deveCriarContaComClienteESaldoZero() {
        Cliente cliente = new Cliente(1, "Maria", 10);
        ContaCliente conta = new ContaCliente(7, cliente);

        assertSame(cliente, conta.getCliente());
        assertEquals(0.0, conta.getSaldo(), 0.001);
    }

    @Test
    void deveCriarContaSomenteComIdESaldoZero() {
        ContaCliente conta = new ContaCliente(7);

        assertEquals(7, conta.getId());
        assertNull(conta.getCliente());
        assertEquals(0.0, conta.getSaldo(), 0.001);
    }

    @Test
    void deveAlterarClienteESaldo() {
        ContaCliente conta = new ContaCliente(7);
        Cliente cliente = new Cliente(1, "Maria", 10);

        conta.setCliente(cliente);
        conta.setSaldo(80.0);

        assertSame(cliente, conta.getCliente());
        assertEquals(80.0, conta.getSaldo(), 0.001);
    }

    @Test
    void deveAdicionarDepositoERetornarNovoSaldo() {
        ContaCliente conta = new ContaCliente(7);

        double novoSaldo = conta.addDeposito(50.0);

        assertEquals(50.0, novoSaldo, 0.001);
        assertEquals(50.0, conta.getSaldo(), 0.001);
    }

    @Test
    void deveRetirarQuandoExisteSaldo() {
        ContaCliente conta = new ContaCliente(7, null, 100.0);

        double novoSaldo = conta.subSaldo(30.0);

        assertEquals(70.0, novoSaldo, 0.001);
        assertEquals(70.0, conta.getSaldo(), 0.001);
    }

    @Test
    void naoDeveRetirarQuandoSaldoForInsuficiente() {
        ContaCliente conta = new ContaCliente(7, null, 20.0);

        double saldoRetornado = conta.subSaldo(30.0);

        assertEquals(20.0, saldoRetornado, 0.001);
        assertEquals(20.0, conta.getSaldo(), 0.001);
    }

    @Test
    void deveRetornarContaFormatada() {
        Cliente cliente = new Cliente(1, "Maria", 10);
        ContaCliente conta = new ContaCliente(7, cliente, 123.5);

        assertEquals("Maria(7) saldo=R$123.50", conta.toString());
    }
}
