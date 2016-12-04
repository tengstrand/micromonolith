#!/usr/bin/env bash

# Git supports storing symbolic links which makes the project ready to be used
# directoy after it has been cloned from the Git repository.

# This was however how it was initially created and it also shows how
# the project can be structured and how new directories can be added.

mkdir src
mkdir pom-files

cd pom-files
ln -s ../../address/pom.xml address-pom.xml
ln -s ../../address-api/pom.xml address-api-pom.xml
ln -s ../../email/pom.xml email-pom.xml
ln -s ../../email-api/pom.xml email-api-pom.xml
ln -s ../../rest/pom.xml test-pom.xml
ln -s ../../test-data-generator/pom.xml test-data-generator-pom.xml
ln -s ../../user/pom.xml user-pom.xml

cd ../src
mkdir -p main/java/micromonolith
mkdir -p test/java/micromonolith

cd main/java/micromonolith
ln -s ../../../../../rest/src/main/java/micromonolith/rest
ln -s ../../../../../address/src/main/java/micromonolith/address
ln -s ../../../../../address-api/src/main/java/micromonolith/address_api
ln -s ../../../../../email/src/main/java/micromonolith/email
ln -s ../../../../../email-api/src/main/java/micromonolith/email_api
ln -s ../../../../../user/src/main/java/micromonolith/user

cd ../../../test/java/micromonolith
ln -s ../../../../../address/src/test/java/micromonolith/address
ln -s ../../../../../email/src/test/java/micromonolith/email
ln -s ../../../../../user/src/test/java/micromonolith/user
ln -s ../../../../../test-data-generator/src/main/java/micromonolith/testdatagenerator
