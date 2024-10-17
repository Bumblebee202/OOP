package module1;

import java.util.Arrays;
import java.util.stream.Collectors;

//9. Створіть масив із 11 випадкових цілих чисел із відрізка [-1;1], 
//виведіть масив на екран у рядок. Визначте, який елемент зустрічається в масиві найчастіше 
//і виведіть про це повідомлення на екран. Якщо два елементи 
//зустрічаються однакову кількість разів, то не виводьте нічого. 
public class Task9 extends BaseTask
{
    private int _bottom = -1;
    private int _top = 2;

    @Override
    public void Action() 
    {
        var size = 11;
        var numbers = new Integer[size];
        
        FillIntegerArrayRandomly(numbers, _bottom, _top, false);
        
        var list = Arrays.asList(numbers);

        var group = list.stream()
                        .collect(Collectors.groupingBy(i -> i));

        var maxSize = -1;
        var number = 0;

        for (var i = _bottom; i < _top; i++)
        {
            var groupedList = group.get(i);
            var listSize = groupedList.size();

            if (listSize > maxSize) 
            {
                maxSize = listSize;
                number = i;
            }
            else if (size == maxSize) 
            {
                return;    
            }
        }

        System.out.println(String.format("Number: %1$s: count: %2$s", number, maxSize));

        ShowSeparator();
    }

}
