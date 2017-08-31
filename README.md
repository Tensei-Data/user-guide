# User-Guide Documentation for Tensei-Data

This repository holds the user guide documentation for Tensei-Data.

The documentation is published available online at:
https://tensei-data.github.io/user-guide/

## Requirements

The documentation is written using [Asciidoctor](http://asciidoctor.org/) and
the [sbt-site](https://github.com/sbt/sbt-site) plugin.

You will need the following components:

1. [Java](http://www.oracle.com/technetwork/java/index.html)
2. [SBT](http://www.scala-sbt.org/)

## Development

The asciidoctor source files need to be placed in the subdirectory `doc`.
They need to have the file extension `.adoc`. You can edit them with
your preferred editor and generate the HTML files via `sbt make-site`.

