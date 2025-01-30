package com.email.writer.Controller;

import com.email.writer.Models.EmailRequest;
import com.email.writer.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "*")
public class EmailGeneratorController {
    @Autowired
    private EmailService emailService;
    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest){
        String response=emailService.generateEmailReply(emailRequest);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
