#!/bin/bash
set  -ex
echo "What is your name?"
read name
if [ $name == "sam" ]
then
echo "Your name is $name"
else
	echo "Not correct name"
fi
