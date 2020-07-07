## Java 9 RT Exporter

### Compile

```
$ java_use 1.8
$ sbt clean package
```

### Print recommended directory

```
$ java -jar target/java9-rt-export-*.jar --rt-ext-dir
```

### Export rt.jar

```
$ java_use 9
$ java -jar target/java9-rt-export-*.jar $HOME/.sbt/java9-rt-ext/rt.jar
```
