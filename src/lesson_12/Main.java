package lesson_12;

/*
Допустим есть txt файл с номерами документов.
Номером документа является строка, состоящая из букв и цифр(без
служебных символов).
Пусть этот файл содержит каждый номер документа с новой строки и в
строке никакой другой информации, только номер документа.
Валидный номер документа должен иметь длину 15 символов и
начинаться с последовательности docnum(далее любая
последовательность букв/цифр) или contract(далее любая
последовательность букв/цифр).
Написать программу для чтения информации из входного файла - путь к
входному файлу должен задаваться через консоль.
Программа должна проверять номера документов на валидность.
 */

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите путь документа: ");
        Scanner src = new Scanner(System.in);
        FileReader fr= new FileReader(src.nextLine());
        Scanner scanner = new Scanner(fr);
        String line;

        try {
            while(scanner.hasNextLine()) {
                int valid=15;
                line = scanner.nextLine();
                if (line.startsWith("docnum")) {
                    if(valid==line.length()){
                        System.out.println(line + " этот номер документа валиден");
                    }
                }
                if (line.startsWith("contract")) {
                    if(valid==line.length()){
                        System.out.println(line + " этот номер документа валиден");
                    }
                }
            }
        } finally {
            scanner.close();
        }
        fr.close();
    }
}
