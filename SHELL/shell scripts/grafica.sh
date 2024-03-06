#! /bin/bash
for fichero in "$@"; do
    if ["$fichero" -ge 1 -a "$fichero" -le 75]; then 
        for 1 in $(seq 1 $fichero);do
            echo -n "*"
        done
        echo
    else
        echo "El argumento $fichero no está dentro del rango"
        exit 1
    fi
done