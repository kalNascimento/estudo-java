#!/bin/bash 
cd "./$1"
javac "./$2.java"
clear
java "$2.java"
