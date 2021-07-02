package PrincipiosJava.Clase4.MarteGroup.Entities;

import java.util.ArrayList;
import java.util.List;

public class FireWorkPackage implements Explode{

    private List<Explode> fireWorks;

    public FireWorkPackage(){
        this.fireWorks = new ArrayList<>();
    }

    public void addFireWork(FireWork fireWork){
        fireWorks.add(fireWork);
    }
    @Override
    public void explode() {
        fireWorks.stream().forEach(explode -> explode.explode());
    }
}
