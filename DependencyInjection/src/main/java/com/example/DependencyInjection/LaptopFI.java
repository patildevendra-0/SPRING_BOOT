package com.example.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopFI
{
    @Autowired
    public HardDisk hobj;

    @Autowired
    public Ram robj;

    @GetMapping("laptop_feild_injection")
    public String Get_Laptop_Info()
    {
        String HardDisk_Data = hobj.Get_HardDisk_Info();
        String Ram_Data = robj.Get_Ram_Info();

        return String.format("{{HARD DISK : %s RAMDATA : %s}}",HardDisk_Data,Ram_Data);
    }


    //  we can perform the DI using two methods
    //      1. using field injection - @Autowired
    //      2. using constructor injection
}
