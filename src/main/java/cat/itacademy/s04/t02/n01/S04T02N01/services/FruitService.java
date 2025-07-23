package cat.itacademy.s04.t02.n01.S04T02N01.services;

import cat.itacademy.s04.t02.n01.S04T02N01.model.Fruit;
import cat.itacademy.s04.t02.n01.S04T02N01.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {

    @Autowired
    private FruitRepository repository;

    public Fruit addFruit(Fruit fruit) {
        return repository.save(fruit);
    }
    public Fruit updateFruit(Fruit fruit) {
        return repository.save(fruit);
    }
    public void deleteFruit(int id) {
        repository.deleteById(id);
    }
    public Fruit getOne(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Fruit with ID " + id + " not found"));
    }
    public List<Fruit> getAll() {
        return repository.findAll();
    }
}
