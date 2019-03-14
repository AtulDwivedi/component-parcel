package com.routinecart.component.parcel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/rest/v1/parcels")
public class ParcelController {

    @Value("${parcel.modes}")
    private List<String> parcelModes;

    @GetMapping("/modes")
    public String getAvailableParcelOptions() {
        return parcelModes.get(new Random().nextInt(3 - 0 + 1) + 0);
    }
}

