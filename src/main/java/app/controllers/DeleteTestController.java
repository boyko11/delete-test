package app.controllers;

import app.dtos.IdsArrayContainerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/delete-test")
public class DeleteTestController {


    @RequestMapping
    public String deleteTestGetTest() {

        return "Yes, I am up and running! How about you? :)";
    }

    @RequestMapping(value = "/batch-delete", method = RequestMethod.DELETE)
    public void batchDelete(@RequestBody IdsArrayContainerDTO idsArrayContainerDTO) {

        System.out.println("idsArrayContainerDTO.getIds()[0]: " + idsArrayContainerDTO.getIds()[0]);
    }

}
