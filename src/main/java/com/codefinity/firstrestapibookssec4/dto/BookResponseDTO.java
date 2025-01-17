package com.codefinity.firstrestapibookssec4.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookResponseDTO {
    private String id;
    private String name;
    private String author;
    private String price;
}
