```markdown
Можно ли использовать try без catch и finally?
Да, в Java конструкция try без catch и finally допустима, если использовать конструкцию try-with-resources.
Эта конструкция автоматически закрывает ресурсы, даже если исключение было выброшено. Она используется
для работы с ресурсами, которые должны быть закрыты после их использования, такими как файлы или сетевые соединения.
```
```java
static String readFirstLineFromFile(String path) throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
        return br.readLine();
    }
}
```
```markdown
В этом примере ресурсом является объект BufferReader, поскольку класс реализует интерфейс
java.lang.AutoCloseable, и он будет закрыт независимо от того, успешно ли выполнится блок try или нет.
```
