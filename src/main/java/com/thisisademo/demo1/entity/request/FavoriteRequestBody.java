package com.thisisademo.demo1.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.thisisademo.demo1.entity.db.Item;

public class FavoriteRequestBody {

    @JsonProperty("favorite")
    private Item favoriteItem;

    public Item getFavoriteItem() {
        return favoriteItem;
    }
}
