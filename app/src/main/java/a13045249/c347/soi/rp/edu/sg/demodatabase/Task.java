package a13045249.c347.soi.rp.edu.sg.demodatabase;

/**
 * Created by 13045249 on 12/5/2017.
 */

public class Task {
    private int id;
    private String description;
    private String date;

    public Task(int id, String description, String date){
        this.id = id;
        this.description = description;
        this.date = date;
    }
    public int getId(){
        return id;
    }
    public String getDescription(){
        return description;
    }
    public String getDate(){
        return date;
    }
}
