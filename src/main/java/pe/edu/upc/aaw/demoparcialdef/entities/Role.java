package pe.edu.upc.aaw.demoparcialdef.entities;


import javax.persistence.*;

@Entity
@Table(name = "roles", uniqueConstraints = { @UniqueConstraint(columnNames = { "user_id", "rol" }) })
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;
    @Column(name = "rol",nullable = false, length = 45)
    private String rol;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private Users user;
    public int getIdRole() {
        return idRole;
    }


    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }


    public String getRol() {
        return rol;
    }


    public void setRol(String rol) {
        this.rol = rol;
    }


    public Users getUser() {
        return user;
    }


    public void setUser(Users user) {
        this.user = user;
    }
}
