package com.example.practicando.firstApp

class RegistroProvider {
    companion object{
        val registroEmpleados = listOf<Registro>(
            Registro(
                1,
                "Activo(A)",
                'A',
            ),
            Registro(
                2,
                "Inactivo(I)",
                'A',
            ),
            Registro(
                3,
                "Eliminado(*)",
                'A',
            ),




        )
    }
}