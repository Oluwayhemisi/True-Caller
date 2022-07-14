package africa.semicolon.true_caller.services;

import africa.semicolon.true_caller.data.models.Contact;
import africa.semicolon.true_caller.data.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class ContactServiceImp implements ContactService{

    @Autowired
    private  ContactRepository contactRepository ;


    @Override


    public void addContact(String firstName, String lastName, String phoneBook) {
        Contact contact = new Contact(firstName,lastName,phoneBook);
        contactRepository.save(contact);

    }



    @Override
    public Contact findById(String id) {
        Optional<Contact> found = contactRepository.findById(id);
        if(found.isEmpty())  throw new NullPointerException("Contact not found");
        return found.get();
    }

    @Override
    public void deleteContact(Contact contact){
        contactRepository.delete(contact);

    }

    @Override
    public Contact updateContact(Contact contact) {
        return contactRepository.save(contact);

    }

    @Override
    public List<Contact> findByname(String Name) {
        List<Contact> result = new ArrayList<>();
        result.addAll(contactRepository.findContactByFirstName(Name));
        result.addAll(contactRepository.findContactByLastName(Name));
        return result;
    }
}
