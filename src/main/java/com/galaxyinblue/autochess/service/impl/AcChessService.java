package com.galaxyinblue.autochess.service.impl;

import com.galaxyinblue.autochess.entity.AcChess;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AcChessService {
    List<AcChess> listAllChess();
}
