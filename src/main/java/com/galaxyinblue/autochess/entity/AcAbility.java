package com.galaxyinblue.autochess.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "autochess_ability")
@Data
public class AcAbility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int ability_id;
    int ability_active;

    String ability_name;
    String ability_avatar;

    String ability_desc;
    String ability_param;
    String ability_cd;

    String ability_note;
}
