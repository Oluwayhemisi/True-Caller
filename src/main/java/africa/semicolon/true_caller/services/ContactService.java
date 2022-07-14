package africa.semicolon.true_caller.services;

import africa.semicolon.true_caller.data.models.Contact;

import java.util.List;
import java.util.Optional;

public interface ContactService {
    void addContact(String FirstName, String LastName, String PhoneBook);

    Contact findById(String id);

    void deleteContact(Contact contact);

     Contact updateContact(Contact contact);

    List<Contact> findByname(String Name);
}
