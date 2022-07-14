package africa.semicolon.true_caller.controllers;

import africa.semicolon.true_caller.services.ContactService;
import africa.semicolon.true_caller.services.ContactServiceImp;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("api/v1/trucaller")
public class ContactController {

    @Autowired
    private ContactService contactService = new ContactServiceImp();

   @PostMapping("/contact")
    public String addContact(@RequestBody RequestDto requestDto) {
        contactService.addContact(requestDto.getFirstName(),requestDto.getLastName(),requestDto.getPhoneNumber());
        return "Added successfully";
    }

    @GetMapping("/contact/{firstName}")
    public String findByFirstName(@PathVariable String firstName){
        return contactService.findByname(firstName).toString();
    }
}


@Data
@NoArgsConstructor
@AllArgsConstructor


class RequestDto{
    private String firstName;
    private String lastName;
    private String phoneNumber;
}