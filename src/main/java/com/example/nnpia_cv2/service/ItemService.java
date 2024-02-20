package com.example.nnpia_cv2.service;

import java.util.Collection;

public interface ItemService {
    Collection<Item> findAllItems();
    Item findItemById(Long id);
}
