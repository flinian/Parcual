package pe.edu.upc.aaw.demoparcialdef.entities;

import javax.persistence.*;


@Entity
@Table(name = "University")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long felsidUniversity;
    @Column(name = "felsname",nullable = false,length = 40)
    private String felsname;
    @Column(name = "felsaddress",nullable = false,length = 80)
    private String felsaddress;
    @Column(name = "felsemail",nullable = false,length = 80)
    private String felsemail;

    public University(){
    }

    public University(long felsidUniversity, String felsname, String felsaddress, String felsemail) {
        this.felsidUniversity = felsidUniversity;
        this.felsname = felsname;
        this.felsaddress = felsaddress;
        this.felsemail = felsemail;
    }

    public long getFelsidUniversity() {
        return felsidUniversity;
    }

    public void setFelsidUniversity(long felsidUniversity) {
        this.felsidUniversity = felsidUniversity;
    }

    public String getFelsname() {
        return felsname;
    }

    public void setFelsname(String felsname) {
        this.felsname = felsname;
    }

    public String getFelsaddress() {
        return felsaddress;
    }

    public void setFelsaddress(String felsaddress) {
        this.felsaddress = felsaddress;
    }

    public String getFelsemail() {
        return felsemail;
    }

    public void setFelsemail(String felsemail) {
        this.felsemail = felsemail;
    }
}
