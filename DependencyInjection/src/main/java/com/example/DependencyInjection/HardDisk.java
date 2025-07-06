package com.example.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class HardDisk
{
    public String Get_HardDisk_Info()
    {
        return "LAPTOP WITH 512 GB STORAGE..";
    }
}
