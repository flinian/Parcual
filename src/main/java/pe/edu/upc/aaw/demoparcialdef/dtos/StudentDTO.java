package pe.edu.upc.aaw.demoparcialdef.dtos;

import pe.edu.upc.aaw.demoparcialdef.entities.University;

public class StudentDTO {
    private long felsidStudent;
    private String felscode;
    private String felsname;
    private Double felsweightedAverage;
    private University felsuniversity;

    public long getFelsidStudent() {
        return felsidStudent;
    }

    public void setFelsidStudent(long felsidStudent) {
        this.felsidStudent = felsidStudent;
    }

    public String getFelscode() {
        return felscode;
    }

    public void setFelscode(String felscode) {
        this.felscode = felscode;
    }

    public String getFelsname() {
        return felsname;
    }

    public void setFelsname(String felsname) {
        this.felsname = felsname;
    }

    public Double getFelsweightedAverage() {
        return felsweightedAverage;
    }

    public void setFelsweightedAverage(Double felsweightedAverage) {
        this.felsweightedAverage = felsweightedAverage;
    }

    public University getFelsuniversity() {
        return felsuniversity;
    }

    public void setFelsuniversity(University felsuniversity) {
        this.felsuniversity = felsuniversity;
    }

}
