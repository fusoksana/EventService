package hello;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.util.List;
//
//@SpringBootApplication
//public class Application implements CommandLineRunner {
//
////    @Autowired
////    public EventService eventService;
//
//    @Autowired
//    public EventRepository eventRepository;
//
//    public static void main(String[] args) {
//        SpringApplication.run(Application.class,args);
//    }
//    @Override
//    public void run(String... strings) throws Exception {
//
//        eventRepository.deleteAll();
//        eventRepository.save(new PropertyDetailEvent("555"));
//        eventRepository.save(new PropertyDetailEvent("789"));
//        eventRepository.save(new PropertyDetailEvent("990"));
//        List<PropertyDetailEvent> propertyDetailEventList=eventRepository.findAll();
//        System.out.println("PropertyDetailEvents:");
//
//        for(PropertyDetailEvent propertyDetailEvent:propertyDetailEventList){
//            System.out.println(propertyDetailEvent);
//        }
//
//
//
//    }
//}


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;



@SpringBootApplication
public class Application implements CommandLineRunner {
    @Autowired
    public PropertiesListingEventRepository propertiesListingEventRepository;



    @Autowired
    public PropertyDetailEventRepository propertyEventRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
    @Override
    public void run(String... strings) throws Exception {

        propertyEventRepository.deleteAll();
        propertiesListingEventRepository.deleteAll();


        propertyEventRepository.save(new PropertyDetailEvent("555"));
        propertyEventRepository.save(new PropertyDetailEvent("789"));
        propertyEventRepository.save(new PropertyDetailEvent("990"));

        propertiesListingEventRepository.save(new PropertiesListingEvent("one-room flats"));
        propertiesListingEventRepository.save(new PropertiesListingEvent("two-rooms flats"));
        List<PropertiesListingEvent> propertiesListingEventList=propertiesListingEventRepository.findAll();

        List<PropertyDetailEvent> propertyDetailEventList= propertyEventRepository.findAll();
        System.out.println("PropertyDetailEvents:");

        for(PropertyDetailEvent propertyDetailEvent:propertyDetailEventList){
            System.out.println(propertyDetailEvent);
        }
        System.out.println("PropertiesListingEvent:");

        for(PropertiesListingEvent ple:propertiesListingEventList){
            System.out.println(ple);
        }

        System.out.println("PropertyDetailEvent with property id 555"+propertyEventRepository.findByPropertyId("555"));

        System.out.println("PropertiesListingEvent with filter 'two-rooms flats'"+propertiesListingEventRepository.findByPropertyFilter("two-rooms flats"));



    }
}