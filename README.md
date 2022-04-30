# Testing and CI [![Build Status](https://app.travis-ci.com/rjust/testing-ci-gradle.svg?branch=master)](https://travis-ci.com/rjust/testing-ci-gradle)
This repository provides example source code and tests for the CSE 403 lecture
on Testing and CI. This repository demonstrates testing best practices, build
system configuration, and CI integration with Travis CI.

## Testing
Run './gradlew test' to run all test cases.

## Coverage
Run './gradlew cobertura' to compute the coverage results. After completion, you can
view the html coverage report: build/reports/cobertura/index.html

## Travis CI
After allowing [Travis CI](https://travis-ci.com) to access the GitHub repository,
it shows up as an installed GitHub app under Settings -> GitHub apps. To manage
repository access, log in to the Travis-CI website and follow the instructions
for *Manage repositories on GitHub*.
