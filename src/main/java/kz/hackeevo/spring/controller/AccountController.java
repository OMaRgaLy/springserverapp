package kz.hackeevo.spring.controller;

import kz.hackeevo.spring.controller.dto.AccountRequestDTO;
import kz.hackeevo.spring.controller.dto.AccountResponseDTO;
import kz.hackeevo.spring.entity.Bill;
import kz.hackeevo.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

@RestController
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts/{accountId}")
    public AccountResponseDTO getById(@PathVariable Long accountId) {
        return new AccountResponseDTO(accountService.getById(accountId));
    }

    @PostMapping("/accounts")
    public Long create(@RequestBody AccountRequestDTO accountRequestDTO) {
        return accountService.save(accountRequestDTO.getName(), accountRequestDTO.getEmail(), accountRequestDTO.getBills().stream()
                .map(billRequestDTO -> new Bill(billRequestDTO.getAmount(), billRequestDTO.getDefault()))
                .collect(Collectors.toList()));
    }
}
