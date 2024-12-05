```markdown
Переопределение метода equals()

Соглашения, которым нужно следовать:
* Reflexivity: для любого ненулевого значения x, x.equals(x) должно вернуть true.
* Symmetry: для любых ссылок x и y, если x.equals(y) возвращает true, то y.equals(x) также должно возвращать true.
* Transitivity: для любых ссылок x, y, и z, если x.equals(y) возвращает true, и y.equals(z) возвращает true,
  то x.equals(z) должно возвращать true.
* Consistency: многократные вызовы x.equals(y) должны возвращать одно и то же значение, пока x и y неизменны.
* Non-nullity: для любого ненулевого значения x, x.equals(null) должно возвращать false.
  
Пример класса с переопределенным методом equals()
```
```java
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределение метода equals
    @Override
    public boolean equals(Object obj) {
        // Проверяем, ссылается ли obj на себя
        if (this == obj) {
            return true; // рефлексия
        }
        // Проверяем, является ли obj экземпляром Person
        if (!(obj instanceof Person)) {
            return false; // если не тот тип
        }
        // Приводим obj к типу Person
        Person other = (Person) obj;
        // Сравниваем поля
        return this.name.equals(other.name) && this.age == other.age; // симметрия
    }

    // другие методы
}
```
