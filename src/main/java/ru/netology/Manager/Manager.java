package ru.netology.Manager;

import ru.netology.Domain.PurchaseItem;

public class Manager {

    private PurchaseItem[] items = new PurchaseItem[0];

    public void add(PurchaseItem item) {
        int length = items.length + 1;
        PurchaseItem[] tmp = new PurchaseItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int LastIndex = tmp.length - 1;
        tmp[LastIndex] = item;
        items = tmp;
    }

    public PurchaseItem[] getAll() {

        PurchaseItem[] result = new PurchaseItem[items.length];

        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
            return result;

    }

        public void removeById(int movieId){
            int length = items.length - 1;
            PurchaseItem[] tmp = new PurchaseItem[length];
            int index = 0;
            for (PurchaseItem item : items) {
                if (item.getId() != movieId) {
                    tmp[index] = item;
                    index++;
                }
            }
            items = tmp;
        }
    }

