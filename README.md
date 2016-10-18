# Jigsaw

## Regular Jars

```mermaid
graph LR;
  jtier-cli.jar-->jtier-core.jar;
```

## Jigsaw Modules

```mermaid
graph LR;
  jtier.cli--requires-->jtier.core;
  jtier.cli-.requires/implicit.->java.base;
  jtier.core-.requires/implicit.->java.base;
```

## Compile
```
$ javac -d out --module-source-path src -d mods $(find src -name '*.java')

```

## Run CLI with main class (not packaged yet)

```
java -p mods -m jtier.cli/com.groupon.jtier.cli.Main
```
OR
```
java --module-path mods --module jtier.cli/com.groupon.jtier.cli.Main
```
