```java
protected interface Interface {
  ...
}
```
```markdown
Интерфейс, объявленный с модификатором доступа protected, имеет защищенную область видимости.
* Доступ внутри того же пакета:
Интерфейс с модификатором protected доступен для классов, которые находятся в том же пакете,
в котором был объявлен этот интерфейс. Таким образом, любой класс в том же пакете может
реализовать или наследовать этот интерфейс.
* Доступ для подклассов:
Классы, которые наследуют от класса, содержащего этот интерфейс, могут также получить доступ к protected интерфейсу,
даже если они находятся в других пакетах.
* Отсутствие доступа для других классов:
Классы, которые находятся в других пакетах и не являются подклассами, не могут получить доступ к защищенному интерфейсу.
```
