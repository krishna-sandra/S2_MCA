#!/bin/bash

rev=$(cat sample2.txt | rev)
echo $rev > sample3.txt
