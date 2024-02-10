package troxya.NEP.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import troxya.NEP.entities.Month;
import troxya.NEP.repositories.MonthRepository;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class MonthController {
    @Autowired
    private MonthRepository monthRepository;

    @PostMapping("/month")
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Month month){
        monthRepository.save(month);
    }

    @GetMapping("/months")
    public ArrayList<Month> findAll(){
        ArrayList<Month> months = new ArrayList<>();

        Iterable<Month> iterable = monthRepository.findAll();
        for (Month month : iterable) {
            months.add(month);
        }
        return months;
    }
    @GetMapping("/month/{monthId}")
    public Optional<Month> getById(@PathVariable Long monthId){
        return monthRepository.findById(monthId);
    }
}
