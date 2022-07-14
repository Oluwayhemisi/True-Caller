package africa.semicolon.true_caller.data.repositories;

import africa.semicolon.true_caller.data.models.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ContactRepository extends MongoRepository<Contact, String> {
    List<Contact> findContactByFirstName(String firstName);
    List<Contact> findContactByLastName(String lastName);

    Contact findByPhoneNumber(String phoneNumber);
}
