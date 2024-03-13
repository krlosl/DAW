#! /bin/bash

read -p "Dime la altura del triángulo a imprimir: " altura
let resto=altura%2
letra='A'
letra1='B'

for ((i=1; i <= $altura; i++)); do
	for(( j=1; j <= $altura; j++)); do
		if [ $resto -eq 0 ]; then
			echo $letra
		else
			echo $letra1
		fi
	done
done
