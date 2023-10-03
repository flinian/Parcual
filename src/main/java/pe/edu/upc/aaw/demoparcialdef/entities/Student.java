package pe.edu.upc.aaw.demoparcialdef.entities;

import javax.persistence.*;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long felsidStudent;
    @Column(name = "felscode",nullable = false,length = 40, unique = true)
    private String felscode;
    @Column(name = "felsname",nullable = false,length = 80)
    private String felsname;
    @Column(name = "felsweightedAverage",nullable = false)
    private Double felsweightedAverage;
    @ManyToOne
    @JoinColumn(name = "felsidUniversity")
    private University felsuniversity;

    public Student(){
    }

    public Student(long felsidStudent, String felscode, String felsname, Double felsweightedAverage, University felsuniversity) {
        this.felsidStudent = felsidStudent;
        this.felscode = felscode;
        this.felsname = felsname;
        this.felsweightedAverage = felsweightedAverage;
        this.felsuniversity = felsuniversity;
    }

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
