package ua.lviv.lgs.movie_project;

import java.util.Set;
import java.util.TreeSet;

public class Schedule {
    private Set<Seance> seances = new TreeSet<>();

    public Set<Seance> getSeances() {
        return seances;
    }

    public void setSeances(Set<Seance> seances) {
        this.seances = seances;
    }

    public Schedule(Set<Seance> seances) {
        this.seances = seances;
    }

    public Schedule() {
        this.seances = seances;
    }

    public void addSeance(Seance seance){
        seances.add(seance);
    }

    public void  removeSeance(Seance seance){
        seances.remove(seance);
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "seances=" + seances +
                '}';
    }
}
