package com.example.motorvognregister;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MotorvognController {
    public final List<Motorvogn> alleBiler = new ArrayList<>();

    @GetMapping("/lagre")
    public void lagreMotorvogn(Motorvogn innMotorvogn) { alleBiler.add(innMotorvogn);}

    @GetMapping("hentBiler")
    public List<Bil> hentBiler() {
        List<Bil> listBiler = new ArrayList<>();
        listBiler.add(new Bil("Audi", "A4"));
        listBiler.add(new Bil("Volvo", "T8"));
        listBiler.add(new Bil("Audi", "A8"));
        return listBiler;
    }

    @GetMapping("/hentAlle")
    public List<Motorvogn> hentAlle(){
        return alleBiler;
    }

    @GetMapping("/slettAlle")
    public void slettAlle(){
        alleBiler.clear();
    }
}
