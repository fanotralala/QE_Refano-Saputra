#!/bin/bash

echo 'umur berapa skrg broo'

read umur
if [ $umur -ge 21 ]
then
    echo 'udh boleh party'
else
    echo 'blom boleh sama papa'
fi