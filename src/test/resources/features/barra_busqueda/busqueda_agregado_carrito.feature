# language: es
Característica: Busqueda por la barra de busqueda

  Escenario: Buscar iphone por barra de Busqueda y agregarlo al carrito
    Dado que Carlos busca "iphone"
    Cuando  Carlos agrega el primer elemento al carrito de compras
    Entonces Carlos debe encontrar al menos 1 producto en el carrito de compras

