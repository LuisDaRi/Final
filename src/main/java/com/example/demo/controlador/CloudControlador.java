package com.example.demo.controlador;

import com.example.demo.modelo.Cloud;
import com.example.demo.servicio.CloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Cloud")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class CloudControlador {
    @Autowired
    private CloudService cloudService;
    @GetMapping("/all")
    public List<Cloud> getLibrarys(){
        return cloudService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Cloud> getLibrary(@PathVariable("id") int libraryId) {
        return cloudService.getCloud(libraryId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cloud save(@RequestBody Cloud cloud) {
        return cloudService.save(cloud);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Cloud update(@RequestBody Cloud cloud) {
        return cloudService.update(cloud);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id){
        return cloudService.deleteCloud(id);
    }

}
