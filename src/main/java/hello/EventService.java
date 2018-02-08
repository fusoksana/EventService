//package hello;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Component
//@Service
//@Transactional
//public class EventService {
//
//    @Autowired
//    private EventRepository eventRepository;
//
//    @Autowired
//     EventService(EventRepository eventRepository){
//        this.eventRepository=eventRepository;
//    }
//
//    public List<PropertyDetailEvent> getAllEvents(){
//        return eventRepository.findAll();
//    }
//
//    public EventRepository getEventRepository() {
//        return eventRepository;
//    }
//}
