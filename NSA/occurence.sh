#!/bin/bash

# Read the number from the user
read -p "Enter a number: " number

# Read the digit to be counted from the user
read -p "Enter the digit to count: " digit

# Initialize the count to zero
count=0

# Loop through each character in the number
for (( i=0; i<${#number}; i++ )); do
    # Check if the current character matches the digit
    if [ "${number:$i:1}" == "$digit" ]; then
        ((count++))
    fi
done

# Print the result
echo "The digit '$digit' occurs $count times in the number $number."
