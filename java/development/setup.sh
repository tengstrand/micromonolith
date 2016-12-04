#!/usr/bin/env bash

mkdir src
mkdir test

cd src
mkdir -p main/java/micromonolith
mkdir -p test/java/micromonolith

cd main/java/micromonolith
ln -s ../../../../../rest/src/main/java/micromonolith/rest
ln -s ../../../../../address/src/main/java/micromonolith/address
ln -s ../../../../../email/src/main/java/micromonolith/email
ln -s ../../../../../user/src/main/java/micromonolith/user
cd email
ln -s ../../../../../../emailApi/src/main/java/micromonolith/email/api
cd ../address
ln -s ../../../../../../addressApi/src/main/java/micromonolith/address/api

cd ../../../../test/java/micromonolith
ln -s ../../../../../email/src/test/java/micromonolith/email
ln -s ../../../../../user/src/test/java/micromonolith/user
ln -s ../../../../../test-data-generator/src/main/java/micromonolith/testdatagenerator
