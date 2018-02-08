package hello;

import org.springframework.data.annotation.Id;

/**
 * Created by yurko on 06.02.18.
 */


public class PropertyDetailEvent {
    @Id
     public String idOfEvent;
    public String propertyId;
    public static String EVENT_TYPE;

    public PropertyDetailEvent(){}
    public PropertyDetailEvent(String propertyId) {
        this.propertyId = propertyId;
        EVENT_TYPE="SEARCH_SINGLE_PROPERTY";

    }

    @Override
    public String toString(){
        return  String.format("Event : [id=%s,propertyID='%s',eventType='%s']",idOfEvent,propertyId,EVENT_TYPE);
    }
}
