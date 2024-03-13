clear
echo "Número de variables pasadas como parametro: $#"
echo "Estas son las variables: $*"
echo "Nombre del script: $0"

j=1
for i in $*
    do
        echo "Parametro $j : $i"
        #j=$(($j + 1))
        ((j ++))
done