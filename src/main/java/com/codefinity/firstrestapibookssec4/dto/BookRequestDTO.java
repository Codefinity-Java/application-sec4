package com.codefinity.firstrestapibookssec4.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookRequestDTO {
    private String name;
    private String author;
    private String price;
}
