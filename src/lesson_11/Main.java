package lesson_11;

/*
1. Доработать нулевое домашнее задание предыдущего урока.
Теперь надо создать свои классы исключений на каждую ситуацию:
- Проверить содержит ли номер документа последовательность abc.
- Проверить начинается ли номер документа с последовательности 555.
- Проверить заканчивается ли номер документа на последовательность 1a2b.
Если номер документа не удовлетворяет условию - то "бросить" исключение.
В методе класса, в котором будут вызываться эти методы для демонстрации работы,
перехватить исключение конструкцией try-catch и в блоке catch вывести
сообщение для пользователя (сообщение на консоль).
* */

import static lesson_11.Document.container;

public class Main {
    public static void main(String[] args) {
        String document = ("1234-ABC-5678-DEF-1a2b");
        System.out.println(document);
        try{
            container("1234-ABC-5678-DEF-1a2b");
        }
        catch (validException | abcException | fivefivefiveException | endException ex) {
            ex.printStackTrace();
        }

    }
}
