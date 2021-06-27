package kz.hackeevo.spring.controller.dto;

import java.util.List;

public class AccountRequestDTO {

    private String name;
    private String email;
    private List<BillRequestDTO> bills;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<BillRequestDTO> getBills() {
        return bills;
    }
}
