package com.example.vohuugiac.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    // Điều hướng đến trang Home
    @GetMapping("/")
    public String home() {
        return "index"; // Tên của file template (home.html)
    }

    @GetMapping("/bai1")
    public String bai1() {
        return "bai1"; // Tên của file template (bai1.html)
    }

    @GetMapping("/bai2")
    public String bai2() {
        return "bai2"; // Tên của file template (bai2.html)
    }

    @GetMapping("/bai3")
    public String bai3() {
        return "bai3"; // Tên của file template (bai3.html)
    }

    @GetMapping("/bai4")
    public String bai4() {
        return "bai4"; // Tên của file template (bai4.html)
    }

    @GetMapping("/bai5")
    public String bai5() {
        return "bai5"; // Tên của file template (bai5.html)
    }

    @GetMapping("/bai6")
    public String bai6() {
        return "bai6"; // Tên của file template (bai6.html)
    }

    @GetMapping("/bai7")
    public String bai7() {
        return "bai7"; // Tên của file template (bai7.html)
    }

    @GetMapping("/bai8")
    public String bai8() {
        return "bai8"; // Tên của file template (bai8.html)
    }

    @GetMapping("/bai9")
    public String bai9() {
        return "bai9"; // Tên của file template (bai9.html)
    }









    // Điều hướng đến trang Profile
    @GetMapping("/profile")
    public String profile() {
        return "profile"; // Tên của file template (profile.html)
    }
}
