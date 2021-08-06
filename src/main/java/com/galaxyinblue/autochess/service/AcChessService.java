package com.galaxyinblue.autochess.service;

import com.galaxyinblue.autochess.entity.AcChess;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AcChessService {
    List<AcChess> listAllChess(int pageNum,int pageSize);
}

