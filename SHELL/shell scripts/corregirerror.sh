#! /bin/bash
clear
for fichero in "$@"; do
    if  [ "$fichero" -ge 1 -a "$fichero" -le 75 ]; then
        for i in $(seq 1 $fichero): do
            echo -in "*"
        done
        echo
    else
        echo "El argumento $fichero no está dentro del rango permitido"
        exit 1
    fi
done