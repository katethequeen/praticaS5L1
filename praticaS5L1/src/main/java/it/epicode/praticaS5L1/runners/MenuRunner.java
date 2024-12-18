package it.epicode.praticaS5L1.runners;

import it.epicode.praticaS5L1.entities.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MenuRunner implements ApplicationRunner {
    @Autowired
    private Menu menu;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        menu.printMenu();
    }
}
