package hello;

import org.springframework.data.annotation.Id;

/**
 * Created by yurko on 07.02.18.
 */
public class PropertiesListingEvent {
    @Id
    public String idOfEvent;
    public String propertyFilter;
    public static String EVENT_TYPE;


    public PropertiesListingEvent(){}
    public PropertiesListingEvent(String propertyFilter){
        this.propertyFilter=propertyFilter;
        EVENT_TYPE="search of listing";

    }
    @Override
    public String toString(){
        return  String.format("Event : [id=%s,propertyFilter='%s',eventType='%s']",idOfEvent,propertyFilter,EVENT_TYPE);
    }
}
