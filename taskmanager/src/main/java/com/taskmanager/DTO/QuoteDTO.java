package com.taskmanager.DTO;

import java.util.List;

/**
 * Created by carel on 2017/06/26.
 */
public class QuoteDTO {

    private Long QuoteID;

    List<QuoteDataDTO> ItemList;

    public Long getQuoteID() {
        return QuoteID;
    }

    public void setQuoteID(Long quoteID) {
        QuoteID = quoteID;
    }

    public List<QuoteDataDTO> getItemList() {
        return ItemList;
    }

    public void setItemList(List<QuoteDataDTO> itemList) {
        ItemList = itemList;
    }
}
