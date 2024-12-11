package com.xianyu;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component(value = "card1")
public class Card {

    private String content;

}
