package com.galaxyinblue.autochess.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "autochess_item")
@Data
public class AcItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int item_id;
    int item_level;
    String item_name;
    String item_avatar;


    String item_base;
    String item_passive;
    String item_active;

    String item_lower;
    String item_upper;

    String item_note;
}
