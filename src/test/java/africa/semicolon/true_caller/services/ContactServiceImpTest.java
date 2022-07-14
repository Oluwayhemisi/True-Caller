package africa.semicolon.true_caller.services;

import africa.semicolon.true_caller.data.models.Contact;
import africa.semicolon.true_caller.data.repositories.ContactRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceImpTest {
//    private ContactService contactService;
//    private ContactRepository contactRepository;
//
//    @BeforeEach
//    void setUp(){
//        contactRepository = new ContactRepositoryImp();
////        contactService = new ContactServiceImp(contactRepository);
//    }
//    @Test
//    void saveContact_findContactReturnsContact(){
//        contactService.addContact("Ismail", "Simisola", "08136460991");
//        Contact contact = contactService.findById(1);
//
//        assertEquals("Ismail",contact.getFirstName());
//        assertEquals("Simisola",contact.getLastName());
//        assertEquals("08136460991",contact.getPhoneNumber());
//        assertEquals(1,contactRepository.count());
//    }
//    @Test
//    void saveContact_DeleteContact(){
//        contactService.addContact("Ismail", "Simisola", "08136460991");
//        Contact contact1 = contactService.findById(1);
//
//        contactService.addContact("George-Depo", "Damilola","09075238788");
//        Contact contact2 = contactService.findById(2);
//
//        Contact removeContact =contactService.deleteContact(contact2);
//        assertEquals(1,contactRepository.count());
//    }
//    @Test
//    void saveContact_updateContact(){
//        contactService.addContact("Ismail", "Simisola", "08136460991");
//        Contact contact1 = contactService.findById(1);
//
//        contactService.addContact("George-Depo", "Damilola","09075238788");
//        Contact contact2 = contactService.findById(2);
//
//        contactService.updateContact(contact2,"Tobiloba");
//        contactService.addContact("Tobiloba","Damilola","09075238788");
//
//        assertEquals("Tobiloba",contact2.getFirstName());
//
//    }
//    @Test
//    void saveContact_findContactByPhoneNumber(){
//        contactService.addContact("Ismail","Simisola","08136460991");
//        Contact contact1 = contactService.findByname("Ismail");
//
//        contactService.addContact("George-Depo", "Damilola","09075238788");
//        Contact contact2 = contactService.findByname("George-Depo");
//
//        assertEquals(2,contactRepository.count());
//        assertEquals("George-Depo",contact2.getFirstName());
//    }

}