package com.unicomer.productstore.rest.model;

public class ResponseObject<C> {

    private boolean OK;
    private C itemAvailability;

    public ResponseObject() {
    }

    public ResponseObject(boolean oK, C itemAvailability) {
        OK = oK;
        this.itemAvailability = itemAvailability;
    }

    public boolean isOK() {
        return OK;
    }

    public void setOK(boolean oK) {
        OK = oK;
    }

    public C getItemAvailability() {
        return itemAvailability;
    }

    public void setItemAvailability(C itemAvailability) {
        this.itemAvailability = itemAvailability;
    }

    @Override
    public String toString() {
        return "ResponseObject [OK=" + OK + ", itemAvailability=" + itemAvailability + "]";
    }

}
