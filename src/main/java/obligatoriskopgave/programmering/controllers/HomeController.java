package obligatoriskopgave.programmering.controllers;

import obligatoriskopgave.programmering.models.BankAccount;
import obligatoriskopgave.programmering.models.Car;
import obligatoriskopgave.programmering.models.Owner;
import obligatoriskopgave.programmering.repositories.BankAccountRepository;
import obligatoriskopgave.programmering.repositories.CarRepository;
import obligatoriskopgave.programmering.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    OwnerRepository ownerRepository;

    @Autowired
    BankAccountRepository bankAccountRepository;

    @Autowired
    CarRepository carRepository;

    @GetMapping("/")
    public String index(Model model)
    {
        List<Owner> owners = ownerRepository.findAll();
        List<BankAccount> bankAccounts = bankAccountRepository.findAllBy();
        List<Car> cars = carRepository.findAll();

        model.addAttribute("owners", owners);
        model.addAttribute("bankAccounts", bankAccounts);
        model.addAttribute("cars", cars);

        return "index";
    }

    @GetMapping("/createOwner")
    public String getCreateOwner()
    {
        return "create-owner";
    }

    @PostMapping("/createOwner")
    public String createNewOwner(@RequestParam String name, @RequestParam String socialSecurityNumber)
    {
        Owner owner = new Owner();
        owner.setOwnerName(name);
        owner.setSocialSecurityNumber(socialSecurityNumber);
        ownerRepository.save(owner);

        return "redirect:/";
    }

    @GetMapping("/createCar")
    public String getCreateCar()
    {
        return "create-car";
    }

    @PostMapping("/createCar")
    public String createNewCar(@RequestParam String color, @RequestParam String brand, @RequestParam String model, @RequestParam double speed)
    {
        Car car = new Car();
        car.setColor(color);
        car.setBrand(brand);
        car.setModel(model);
        car.setMaxSpeed(speed);

        carRepository.save(car);

        return "redirect:/";
    }

    @GetMapping("/createAccount")
    public String getCreateAccount(Model model)
    {
        model.addAttribute("owners", ownerRepository.findAll());
        return "create-account";
    }

    @PostMapping("createAccount")
    public String createNewAccount(@RequestParam String bankName, @RequestParam Double balance, @RequestParam Long account, @RequestParam Long ownerId)
    {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setBankName(bankName);
        bankAccount.setAccountNumber(account);
        bankAccount.setBalance(balance);
        Owner owner = ownerRepository.findById(ownerId).get();
        bankAccount.setOwner(owner);
        bankAccountRepository.save(bankAccount);

        return "redirect:/";
    }
}
