#!/bin/bash

# Function to calculate the GCD of two numbers
gcd() {
    local a=$1
    local b=$2
    while [ $b -ne 0 ]; do
        local temp=$b
        b=$((a % b))
        a=$temp
    done
    echo $a
}

# Function to calculate the LCM of two numbers
lcm() {
    local a=$1
    local b=$2
    echo $((a * b / $(gcd $a $b)))
}

# Read two numbers
read -p "Enter 2 numbers: " a b 

# Calculate GCD and LCM
gcd_result=$(gcd $a $b)
lcm_result=$(lcm $a $b)

# Display the results
echo "GCD of $a and $b is: $gcd_result"
echo "LCM of $a and $b is: $lcm_result"
