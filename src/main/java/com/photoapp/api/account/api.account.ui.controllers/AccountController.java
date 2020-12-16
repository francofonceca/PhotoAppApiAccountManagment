package account.ui.controolers;

import RestController;

@RestController
@RequestMapping("/account")
public class AccountController{
    
    @GetMapping("/status/check")
    public String status(){
        return "Working...";
    }
}