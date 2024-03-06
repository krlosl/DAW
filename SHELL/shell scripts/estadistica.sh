#! /bin/bash
clear
if [ "$1" != ""]; then
    direcotiro = $1
else
    directorio =$(pwd)
fi
echo "Estadísticas del direcotrio $directorio"
echo "Numero de ficheros con permiso de lectura: $(find "$directorio" -type f -perm -u+r | wc -l)"
echo "Número de ficheros con permiso de escritura: $(find "$directorio" -type f -perm -u+w | wc -l)"
echo "Número de ficheros con permiso de ejecución: $(find "$directorio" -type f -perm -u+w | wc -l)""