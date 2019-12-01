package ru.avalon.java.j20.labs.models;

import java.util.Iterator;

/**
 * Модель получения последовательности чисел Фибоначчи.
 *
 * <p>Числа Фибонааччи (иногда пишут Фибона́чи[1]) — элементы
 * числовой последовательности 0, 1, 1, 2, 3, 5, 8, 13, 21,
 * 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181,
 * 6765, 10946, 17711, … (последовательность A000045 в OEIS),
 * в которой первые два числа равны либо 1 и 1, либо 0 и 1,
 * а каждое последующее число равно сумме двух предыдущих
 * чисел. Названы в честь средневекового математика Леонардо
 * Пизанского (известного как Фибоначчи).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%A4%D0%B8%D0%B1%D0%BE%D0%BD%D0%B0%D1%87%D1%87%D0%B8">Числа Фибоначчи</a>
 */
public class Fibonacci implements Iterable<Integer> {

    

    /**
     * Итератор, выполняющий обход последовательности
     * чисел Фибоначчи.
     */
    private static class FibonacciIterator implements Iterator<Integer> {
        
        private class Item
        {
            Integer val;
            Item prev;
            Item next;
            public Item(Integer ival)
            {
                this.val = ival;
            }
            
        
        }
        
        int size = 0;
        int maxsize =0;
        Integer x =0;
        Integer y = 1;
        Item head = new Item(0);
        Item last;
        Item iter;
        Item cursorItem;
        //Метод создания последовательности Фибоначчи с элементами
        public void InsFibonacci(int maxitem)
        {
            while (size<=maxitem)
            {
                Item newItem = new Item(0);
                if (size == 0)
                {
                    newItem.val = 1;
                    head.next = newItem;
                }
                else
                {
                    Integer rez = x+y;
                    x=y;
                    y=rez;
                    newItem.val = rez;
                    last.prev = last;
                    last.next = newItem;
                }
                last = newItem;
                size++;
            }
            iter = head;
        }
                
        
        /**
         * Определяет, есть ли следующее значение
         * последовательности чисел Фибоначчи.
         *
         * @return {@code true}, если следующее число
         * последовательности существует. В обратном случае
         * {@code false}.
         */
        @Override
        public boolean hasNext()
        {
            //return iter.next != null ? true : false; //Способ с созданием элементов последовательности
            return size <= maxsize ? true : false; //для второго способа
//            throw new UnsupportedOperationException("Not implemented yet!");
        }
        /**
         * Возвращает следующее число последовательности
         * чисел Фибоначчи.
         *
         * @return следующее число последовательности.
         */
        @Override
        public Integer next() 
        {
            //Для способа с хранмыми элементами
       //     Integer rez = iter.val;
       //     iter = iter.next;
       //     return rez;
            //Способ с 2 переменными
            if (size <2)
            {
                size++;
                return size-1;
            }
            Integer rez = x+y;
            x=y;
            y=rez;
            size++;
            return rez;
            //throw new UnsupportedOperationException("Not implemented yet!");
        }
        //Для способа с храимыми элементами можно в любой момент найти любой член или сумму не перестраивая полностью последовательность
        public Integer first20()
        {
            cursorItem = head;
            Integer sum = 0;
            for(int i=0;i<=20;i++)
            {
                sum+=cursorItem.val;
                if (cursorItem.next == null)
                    break;
                cursorItem = cursorItem.next;
            }
            return sum;
            
        }
                
                
                    
                
        
    }

    /**
     * Возвращает итератор, позволяющий выполнить обход
     * последовательности чисел Фибоначчи.
     *
     * @return итератор последовательности чисел Фибоначчи
     */
    @Override
    public Iterator<Integer> iterator() {
        return fibiter;
       //throw new UnsupportedOperationException("Not implemented yet!");
    }
    
       

    public Fibonacci(int maxitem) {
        fibiter.maxsize = maxitem;
    }
    
    
    private FibonacciIterator fibiter = new FibonacciIterator();
    
    
    
    
    
}
