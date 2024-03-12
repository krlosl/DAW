#modifica esta.sh para que los lea como parámetro
#!/bin/bash
for i in *
do
    TEST=$(who | grep "$i")
    if [ -n "$TEST" ]
    then
        echo "$i SI esta conectado"
    else
        echo "$i NO esta conectado"
    fi
done