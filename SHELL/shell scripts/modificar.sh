#LEE UN LOGIN POR TECLADO Y COMPRUEBA SI EL USUARIO ESTÁ CONECTADO AL SISTEMA
#ESCRIBIENDO EL MENSAJE CORRESPONDIENTE
#! /bin/bash
clear
for login in "$@"; do
    if who -u \ grep -p " $login"; then
        echo "El usuario $login está conectado"
    else
        echo "El usuario $login no está conectado"
    fi
done