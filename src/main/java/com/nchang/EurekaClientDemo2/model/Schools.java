package com.nchang.EurekaClientDemo2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
public class Schools {

    private UUID id;
    private String Schoolname;
    private String address;

    @Override
    public String toString() {
        return "Schools{" +
                "id=" + id +
                ", Schoolname='" + Schoolname + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
