package com.startjava.lesson_2_3_4.array;

import java.text.DecimalFormat;
import java.util.Random;

public class ExcessRemover {
    public static void main(String[] args) {
        removeExcess(-1);
        removeExcess(15);
        removeExcess(0);
        removeExcess(14);
    }

    private static void removeExcess(int index) {
        Random r = new Random();
        float[] randomDigits = new float[15];

        if (index > randomDigits.length - 1 || index < 0) {
            System.out.println("Введен некорректный адрес ячейки");
            return;
        }

        for (int i = 0; i < randomDigits.length; i++) {
            randomDigits[i] = r.nextFloat(0, 1);
        }

        System.out.println("Массив исходный: ");
        print(randomDigits);

        float digitInCell = randomDigits[index];
        int countZeroCells = 0;
        for (int i = 0; i < randomDigits.length; i++) {
            if (randomDigits[i] > digitInCell) {
                randomDigits[i] = 0;
            }

            if (randomDigits[i] == 0) {
                countZeroCells++;
            }
        }

        System.out.println("Массив измененный:");
        print(randomDigits);
        System.out.println("Значение из ячейки по переданному адресу: " + digitInCell);
        System.out.println("Количество обнуленных ячеек: " + countZeroCells);
    }

    private static void print(float[] toPrint) {
        int length = toPrint.length;
        DecimalFormat decimalFormat = new DecimalFormat("0.###");
        for (int i = 0; i < length / 2; i++) {
            System.out.print(decimalFormat.format(toPrint[i]) + " ");
        }
        System.out.println();
        for (int i = length / 2; i < length; i++) {
            System.out.print(decimalFormat.format(toPrint[i]) + " ");
        }
        System.out.println();
    }
}
