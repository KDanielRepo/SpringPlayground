package com.example.SpringPlayground;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
@Data
public class Person {
    @NotNull
    @Size(min = 2,max = 10)
    private String name;
    @NotNull
    @Min(18)
    private Integer age;

}
