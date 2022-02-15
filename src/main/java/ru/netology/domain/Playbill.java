package ru.netology.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data


public class Playbill {

    private String name;
    private int limit=10;
    private Playbill[] items = new Playbill[0];

    public Playbill(String name) {
        this.name = name;
    }


    public void save(Playbill item) {

        int length = items.length + 1;

        Playbill[] tmp = new Playbill[length];

        System.arraycopy(items, 0, tmp, 0, items.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public Playbill[] findAll() {
        return items;
    }

    public Playbill[] findLast() {

        Playbill[] items = findAll();
        int resultLength;

        if (items.length > limit) {
            resultLength = limit;
        } else resultLength = items.length;

        Playbill[] result = new Playbill[resultLength];

        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;

    }

}