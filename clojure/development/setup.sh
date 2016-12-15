#!/usr/bin/env bash

mkdir project-files

cd src
ln -s ../../address/src/address
ln -s ../../email/src/email
ln -s ../../injection/src/injection
ln -s ../../rest/src/rest
ln -s ../../user/src/user

cd ../test
ln -s ../../address/test/address
ln -s ../../user/test/user
ln -s ../../test-data-generator/src/test_data_generator

cd ../project-files
ln -s ../../address/project.clj ./address-project.clj
ln -s ../../email/project.clj ./email-project.clj
ln -s ../../injection/project.clj ./injection-project.clj
ln -s ../../rest/project.clj ./rest-project.clj
ln -s ../../user/project.clj ./user-project.clj
ln -s ../../test-data-generator/project.clj ./test-data-generator-project.clj
