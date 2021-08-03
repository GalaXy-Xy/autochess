package com.galaxyinblue.autochess.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "autochess_chess")
@Data
public class AcChess {
    @Id
    int chess_id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    String chess_name;
    int chess_level;
    int chess_attack_capablity;
    int chess_attack_damage_min;
    int chess_attack_damage_max;
    float chess_attack_rate;
    int chess_attack_range;
    int chess_armor_physical;
    int chess_magical_resistance;
    int chess_movement_speed;
    int chess_status_health;
    int chess_status_health_regen;
    int chess_status_mana;
    int chess_status_mana_regen;
    String chess_avatar;
    String chess_model;
    String chess_note;

}
