package com.example.c868Backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController	// This means that this class is a RestController
@RequestMapping(path="/item") // This means URL's start with /item (after Application path)
public class BrandController {
    @Autowired // This means to get the bean called itemRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private BrandRepository brandRepository;

    @PostMapping(path="/brand/add", produces = MediaType.APPLICATION_JSON_VALUE) // Map ONLY POST Requests
    public @ResponseBody Brand addNewBrand (@RequestBody Brand brand) {
        brandRepository.save(brand);
        return brand;
    }

    @GetMapping(path="/brand/all")
    public @ResponseBody Iterable<Brand> getAllBrands() {
        // This returns a JSON or XML with the items
        return brandRepository.findAll();
    }

    @DeleteMapping(path="/brand/delete")
    public @ResponseBody void deleteBrand(@RequestBody Brand brand) {
        // This deletes a JSON or XML with the items
        brandRepository.delete(brand);
    }
}
