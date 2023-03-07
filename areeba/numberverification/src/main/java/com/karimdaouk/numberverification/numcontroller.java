package main.java.com.karimdaouk.numberverification;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.karimdaouk.numverifyservice;

import java.io.IOException;

import org.springframework.web.bind.annotation.RequestMapping;



@RequestMapping("/number")
@RestController
@reqiredArgsConstructor
public class numcontroller {

        private final numverifyservice numverifyservice;
    @PostMapping
    public ResponseEntity<String> validatenum( 
        @RequestBody NumberRequest request) throws IOException{

            return numverifyservice.validate(request.getNumber());
             
        }
    
}
