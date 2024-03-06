#INDICA LE NÚMERO DE USUARIOS CONECTADOS AL SISTEMA Y LA FEHCA ACTUAL
#! /bin/bash
clear
echo
echo "Hay $(who | wc -l) usuarios conectados"
echo "La fecha de hoy es $(date)"
echo