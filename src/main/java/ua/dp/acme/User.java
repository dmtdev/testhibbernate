package ua.dp.acme;

import javax.persistence.*;
import java.util.List;

/**
 * Created by root on 14.03.2017.
 */
@Entity
@Table(name="USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="USER_ID")
    private long userId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "PASSWORD")
    private String password;

    @ManyToMany
    @JoinTable(name="user_roles",
            joinColumns = @JoinColumn(name="USER_ID", referencedColumnName="USER_ID"),
            inverseJoinColumns = @JoinColumn(name="ROLE_ID", referencedColumnName="ROLE_ID")
    )
    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
