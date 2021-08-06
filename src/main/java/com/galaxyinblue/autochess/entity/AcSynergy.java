package com.galaxyinblue.autochess.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "autochess_synergy")
@Data
public class AcSynergy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int synergy_id;
    int synergy_type;
    String synergy_name;
    String synergy_avatar;
    String synergy_desc;
    String synergy_effect;
    String synergy_note;
}
