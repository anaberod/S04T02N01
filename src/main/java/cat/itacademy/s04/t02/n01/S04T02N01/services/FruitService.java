package cat.itacademy.s04.t02.n01.S04T02N01.services;

import cat.itacademy.s04.t02.n01.S04T02N01.dto.FruitDTO;
import cat.itacademy.s04.t02.n01.S04T02N01.model.Fruit;
import cat.itacademy.s04.t02.n01.S04T02N01.repository.FruitRepository;
import cat.itacademy.s04.t02.n01.S04T02N01.exception.FruitNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FruitService {

    @Autowired
    private FruitRepository repository;

    public FruitDTO addFruit(FruitDTO dto) {
        Fruit fruit = fromDTO(dto);
        Fruit saved = repository.save(fruit);
        return toDTO(saved);
    }

    public FruitDTO updateFruit(int id, FruitDTO dto) {
        Fruit existingFruit = repository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException("Fruit with ID " + id + " not found"));

        existingFruit.setName(dto.getName());
        existingFruit.setAmountKilos(dto.getAmountKilos());

        Fruit updated = repository.save(existingFruit);
        return toDTO(updated);
    }

    public void deleteFruit(int id) {
        repository.deleteById(id);
    }

    public FruitDTO getOne(int id) {
        Fruit fruit = repository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException("Fruit with ID " + id + " not found"));
        return toDTO(fruit);
    }

    public List<FruitDTO> getAll() {
        return repository.findAll().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public Fruit fromDTO(FruitDTO dto) {
        return new Fruit(dto.getName(), dto.getAmountKilos());
    }

    public FruitDTO toDTO(Fruit fruit) {
        return new FruitDTO(fruit.getId(),fruit.getName(), fruit.getAmountKilos());
    }
}
