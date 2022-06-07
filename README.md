# dosh
Dosh is a personal finance application.

It uses [plain text accounting](https://plaintextaccounting.org).

## Research areas

### Extracting transaction data from PDF
https://github.com/tabulapdf/tabula-java
https://github.com/gavinkflam/tabula-api

### Ledger file format
https://hledger.org/1.26/hledger.html#journal-format
https://www.ledger-cli.org/3.0/doc/ledger3.html#Journal-File-Format-for-Developers

## Installation
Download from https://github.com/lazd/dosh


# Polylith
The Polylith documentation can be found here:

- The [high-level documentation](https://polylith.gitbook.io/polylith)
- The [Polylith Tool documentation](https://github.com/polyfy/polylith)
- The [RealWorld example app documentation](https://github.com/furkan3ayraktar/clojure-polylith-realworld-example-app)

You can also get in touch with the Polylith Team on [Slack](https://clojurians.slack.com/archives/C013B7MQHJQ).

## Usage

Get info about the workspace:

    $ clojure -M:poly info

In addition to the `development` project which you will use with a REPL
for developing against the whole workspace, there are two projects:

* `dosh` -- a command-line application, aliased as `app`
* `dosh-lib` -- a simple library, aliased as `lib`

Run all the workspace's tests, including the development tests:

    $ clojure -M:poly test :all :dev

This runs all of the tests in the workspace, including the example
generative test in the dosh `app` project.

> Normally, you would run just tests for components that have changed: `clojure -M:poly test` (optionally with `:project` to all run project-specific tests).

To develop against this workspace, start a REPL in your favorite way, using the `:dev` and `:test` aliases.

Build a deployable artifact for the dosh command-line application project:

    $ ( cd projects/dosh && clojure -T:build uber )

Run that uberjar:

    $ java -jar projects/dosh/target/dosh-0.1.0-SNAPSHOT.jar
    Hello, World!
    $ java -jar projects/dosh/target/dosh-0.1.0-SNAPSHOT.jar Lisa
    Hello, Lisa!

Build a deployable library artifact for the dosh-lib project:

    $ ( cd projects/dosh-lib && clojure -T:build jar )

This will produce a generated `pom.xml` file in the project's `target` folder and
synchronize the dependencies with that project's `deps.edn` file.

It will have the coordinates `net.clojars.lazd/dosh` (and a version of `"0.1.0-SNAPSHOT"` initially).

You can install that JAR file locally:

    $ ( cd projects/dosh-lib && clojure -T:build install )

You can also deploy that JAR file to Clojars:

    $ ( cd projects/dosh-lib && clojure -T:build deploy )

You can then depend on the library in other projects (adjust the `:mvn/version` as necessary):

    $ clj -Sdeps '{:deps { net.clojars.lazd/dosh {:mvn/version "0.1.0-SNAPSHOT"} }}'
    Clojure 1.10.3
    user=> (require '[lazd.dosh.greeter.interface :as greet])
    nil
    user=> (greet/greeting {:person "REPL"})
    "Hello, REPL!"
