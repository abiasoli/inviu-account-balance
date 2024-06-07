package com.inviu.kata

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class AccountBalanceServiceTest {

    @Test
    fun shouldExecuteCashIn() {
        AccountBalanceService.executeCashIn(100, Any())
        // Validar que el monto de 100$ se acreditó a la cuenta
        // Assertions.assertEquals(expected, actual) holha hola chau chau
    }

    @Test
    fun shouldExecuteCashOutAndFailBecauseOfInsufficientBalance() {
        assertThrows<IllegalArgumentException> {
            AccountBalanceService.executeCashOut(100, Any())
        }
        // Validar que la extracción falló
    }

    @Test
    fun shouldGenerateAccountSummary() {
        val account = Any()
        AccountBalanceService.executeCashIn(100, account)
        AccountBalanceService.executeCashIn(50, account)
        AccountBalanceService.executeCashOut(60, account)

        // Validar que el balance final es de 90$
        // Assertions.assertEquals(expectedBalance, actualBalance)

        // Validar que se generaron 3 operaciones
        // Assertions.assertEquals(expectedOperationCount, actualOperationCount)
    }

    @Test
    fun shouldTransferToAnotherUser() {
        AccountBalanceService.executeCashTransfer(100, Any(), Any())
        // Validar que el monto se transfirió de un usuario al otro
        // Assertions.assertEquals(expected, actual)
    }
}