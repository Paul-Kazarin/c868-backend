package com.example.c868Backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController	// This means that this class is a RestController
@RequestMapping(path="/item") // This means URL's start with /item (after Application path)
public class SubTypeController {
    @Autowired // This means to get the bean called itemRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private SubTypeRepository subTypeRepository;

    @PostMapping(path="/subtype/add", produces = MediaType.APPLICATION_JSON_VALUE) // Map ONLY POST Requests
    public @ResponseBody SubType addNewSubType (@RequestBody SubType subType) {
        subTypeRepository.save(subType);
        return subType;
    }

    @GetMapping(path="/subtype/all")
    public @ResponseBody Iterable<SubType> getAllSubTypes() {
        // This returns a JSON or XML with the items
        return subTypeRepository.findAll();
    }
}
