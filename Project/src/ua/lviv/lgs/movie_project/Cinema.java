package ua.lviv.lgs.movie_project;

import java.util.*;

public class Cinema {
    public Cinema(Time open, Time close) {
        this.open = open;
        this.close = close;
    }

    public TreeMap<Days, Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(TreeMap<Days, Schedule> schedules) {
        this.schedules = schedules;
    }

    private TreeMap<Days, Schedule> schedules = new TreeMap<>();
    private Time open;
    private Time close;
    private ArrayList<Movie> moviesLibrary = new ArrayList<>();

    public Time getOpen() {
        return open;
    }

    public void setOpen(Time open) {
        this.open = open;
    }

    public Time getClose() {
        return close;
    }

    public void setClose(Time close) {
        this.close = close;
    }

    public ArrayList<Movie> getMoviesLibrary() {
        return moviesLibrary;
    }

    public void setMoviesLibrary(ArrayList<Movie> moviesLibrary) {
        this.moviesLibrary = moviesLibrary;
    }

    public void addMovie(Movie movie, Time...time) {
       moviesLibrary.add(movie);
        for (int i = 0; i < time.length; i++) {
            for (int j = 0; j < Days.values().length; j++) {
                try {
                    schedules.get(Days.values()[j]).addSeance(new Seance(movie, time[i]));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
   }

   public void addSeance(Seance seance, String day){
       if ((seance.getStartTime().getHour()>=open.getHour())&&(seance.getEndTime().getHour()<close.getHour())){
           Optional<Map.Entry<Days, Schedule>> daySchedule = schedules.entrySet().stream().filter(x->x.getKey().equals(day)).findFirst();
           if (daySchedule.isPresent()){
               daySchedule.get().getValue().addSeance(seance);
           } else {
               schedules.put(Days.valueOf(day), new Schedule());
               schedules.entrySet().stream().filter(x->x.getKey().equals(day)).findFirst().get().getValue().getSeances().add(seance);
           }
       } else {
           System.out.println("Cinema is closed in this time");
       }
   }

   public void removeMovie(Movie movie) {
        moviesLibrary.remove(movie);
   }

   public void removeSeance(Seance seance, String day) {
        if(schedules.containsValue(seance) && schedules.containsKey(day)) {
            schedules.remove(day);
        }
        else {
            System.err.println("Такого сеансу немає!!!");
        }
   }
}
