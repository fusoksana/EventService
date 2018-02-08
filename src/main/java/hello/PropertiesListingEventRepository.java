package hello;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by yurko on 08.02.18.
 */
public interface PropertiesListingEventRepository extends MongoRepository<PropertiesListingEvent,String> {

    public PropertiesListingEvent findByPropertyFilter(String propertyFilter);
}
