package com.galaxyinblue.autochess.service.impl.impl;

import com.galaxyinblue.autochess.entity.AcChess;
import com.galaxyinblue.autochess.mapper.AcChessMapper;
import com.galaxyinblue.autochess.service.impl.AcChessService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcChessServiceImpl implements AcChessService {

    private AcChessMapper chessMapper;

    @Override
    public List<AcChess> listAllChess() {
        return null;
    }
}
