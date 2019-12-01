package ru.avalon.java.j20.labs.tasks;
import java.util.Arrays;

import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;

import java.util.List;
import java.util.Set;

import java.util.*;
/**
 * Задание №5.
 *
 * <p>Тема: "Изучение отличия между списками и наборами".
 */
public class Task5 implements Task {

    /**
     * Фабрика, генерирующая массивы чисел случайного характера.
     */
  //  private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        //final int[] array = arrayFactory.getInstance(20);
        final int[] array = {4,15,2,9,102};
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<array.length;i++)
        {
            list.add(Integer.valueOf(array[i]));
        }

        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<array.length;i++)
        {
            set.add((Integer.valueOf(array[i])));
        }

        /**
         * TODO(Студент): Выполните задание №5
         *
         * 1. Проинициализируйте переменные list и set объектами
         *    подходящих классов.
         *
         * 2. В обе коллекции поместите элементы массива array.
         *
         * 3. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}
