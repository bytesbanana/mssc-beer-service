package com.bytesbanana.msscbeerservice.web.controller;

import com.bytesbanana.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable UUID beerId) {
        //TODO: call service
        System.out.println(beerId);
        return ResponseEntity.ok(BeerDto.builder().build());
    }


    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {


        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer(@PathVariable UUID beerId, @RequestBody BeerDto beerDto) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    public ResponseEntity deleteBeer(@PathVariable UUID beerId) {
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }


}
