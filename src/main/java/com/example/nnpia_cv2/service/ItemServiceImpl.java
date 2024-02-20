package com.example.nnpia_cv2.service;

import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ItemServiceImpl implements ItemService {

    private static final Map<Long, Item> items = new HashMap<>();

    static {
        // Předdefinované objekty
        items.put(1L, new Item(1L, "Item1", "Description1", 10.0));
        items.put(2L, new Item(2L, "Item2", "Description2", 20.0));
        items.put(3L, new Item(3L, "Item3", "Description3", 30.0));
    }

    @Override
    public Collection<Item> findAllItems() {
        return items.values();
    }

    @Override
    public Item findItemById(Long id) {
        return items.get(id);
    }
}
