package com.cppfooddelivery;

import java.util.List;

public interface Menu {
    void addItem(MenuItem item);
    List<MenuItem> getMenuItems();
}
