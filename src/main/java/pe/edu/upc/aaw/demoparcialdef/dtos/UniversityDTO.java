package pe.edu.upc.aaw.demoparcialdef.dtos;

public class UniversityDTO {
    private long felsidUniversity;
    private String felsname;
    private String felsaddress;
    private String felsemail;

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
