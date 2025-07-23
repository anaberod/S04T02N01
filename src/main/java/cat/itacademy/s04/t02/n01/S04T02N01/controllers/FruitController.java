package cat.itacademy.s04.t02.n01.S04T02N01.controllers;

import cat.itacademy.s04.t02.n01.S04T02N01.model.Fruit;
import cat.itacademy.s04.t02.n01.S04T02N01.services.FruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fruit")
public class FruitController {
    @Autowired
    private FruitService service;

    @PostMapping("/add")
    public ResponseEntity<Fruit> addFruta(@RequestBody Fruit fruit) {
        return ResponseEntity.ok(service.addFruit(fruit));
    }

    @PutMapping("/update")
    public ResponseEntity<Fruit> updateFruta(@RequestBody Fruit fruit) {
        return ResponseEntity.ok(service.updateFruit(fruit));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteFruta(@PathVariable int id) {
        service.deleteFruit(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<Fruit> getOne(@PathVariable int id) {
        return ResponseEntity.ok(service.getOne(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Fruit>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}
