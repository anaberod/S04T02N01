package cat.itacademy.s04.t02.n01.S04T02N01.controllers;

import cat.itacademy.s04.t02.n01.S04T02N01.dto.FruitDTO;
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

    @PostMapping
    public ResponseEntity<FruitDTO> create(@RequestBody FruitDTO dto) {
        return ResponseEntity.ok(service.addFruit(dto));
    }

    @PutMapping("/{id}")
    public ResponseEntity<FruitDTO> update(@PathVariable int id, @RequestBody FruitDTO dto) {
        return ResponseEntity.ok(service.updateFruit(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        service.deleteFruit(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FruitDTO> getById(@PathVariable int id) {
        return ResponseEntity.ok(service.getOne(id));
    }

    @GetMapping
    public ResponseEntity<List<FruitDTO>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}
