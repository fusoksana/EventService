package hello;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PropertyDetailEventRepository extends MongoRepository<PropertyDetailEvent,String> {


    public PropertyDetailEvent findByPropertyId(String propertyId);


}
