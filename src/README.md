# Mi proyecto [Reservas de habitaciones]

Se trata de un sistema básico para la reservas de habitaciones

## El objetivo es crear objetos [Room] con sus atributos
·· y mostrar esa información 

## La estructura del proyecto consta de 3 directorios

# AppMain → quien contiene el [Main]
# Models → que contendrá todas las clases [Room, Customer, Reservas]
# Services → contiene los métodos [mostrarInfo]

[Clases principales]
- Habitación: debe incluir atributos como número de habitación, tipo (individual, doble, suite) y precio por noche.
- Customer: debe incluir atributos como nombre, identificación (ID) y número de contacto.
- Reserva: debe incluir atributos como la habitación reservada, cliente, fecha de inicio y fecha de fin de la reserva.

[Requerimientos funcionales]

- Un método para agregar nuevas habitaciones al inventario del hotel.
- Un método para listar las habitaciones disponibles.
- Un método para realizar una reserva, validando que la habitación esté disponible en las fechas seleccionadas.
- Un método para calcular el costo total de una reserva en función de las noches reservadas y el precio por noche.
- Un método para mostrar todas las reservas existentes.


## FUNCIONALIDAD - MEJORAS

La idea principal es que cuando se solicite una habitación el programa devuelva las habitaciones 
disponibles para reservar.
- Hay que tener en cuenta que existen habitaciones ya reservadas 
- De las habitaciones disponibles cuáles tienen vista al mar - Y SU PRECIO por NOCHE.
- El programa debe recoger toda información aportada por el usuario y darle el precio. 

