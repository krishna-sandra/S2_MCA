#!/bin/bash
sample()
if [ $# -eq 1 ]
then
    if [ -f $1 ]
    then
    cat $1
    echo " -> "
    tac $1
    else echo " file not exists"
    fi
 else
 echo "enter file name"
 fi
 sample file.txt




 if [ $# -eq 1 ]; then
    # Check if the provided argument is a file
    if [ -f "$1" ]; then
        # Read the file line by line
        while read -r line; do
            # Process each word in the line
            for word in $line; do
                # Reverse the word and print it followed by a space
                echo -n "$(echo $word | rev) "
            done
            # Print a newline at the end of each line
            echo
        done < "$1"
    else
        # If the file does not exist, print an error message
        echo "File does not exist!!"
    fi
else
    # If the number of arguments is not equal to one, prompt the user
    echo "Usage: $0 <file>"
    echo "Please provide the file name or path as an argument."
fi