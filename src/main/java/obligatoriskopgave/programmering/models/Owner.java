package obligatoriskopgave.programmering.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ownerName;

    private String socialSecurityNumber;

    @OneToMany(mappedBy = "owner")
    private List<BankAccount> ownedBankAccounts;

    @ManyToMany()
    @JoinTable(name = "owner_car",
    joinColumns = {@JoinColumn(name = "owner_id")},
    inverseJoinColumns = {@JoinColumn(name = "car_id")})
    private List<Car> ownedCars;

    public Owner() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public List<BankAccount> getOwnedBankAccounts() {
        return ownedBankAccounts;
    }

    public void setOwnedBankAccounts(List<BankAccount> ownedBankAccounts) {
        this.ownedBankAccounts = ownedBankAccounts;
    }

    public List<Car> getOwnedCars() {
        return ownedCars;
    }

    public void setOwnedCars(List<Car> ownedCars) {
        this.ownedCars = ownedCars;
    }
}
