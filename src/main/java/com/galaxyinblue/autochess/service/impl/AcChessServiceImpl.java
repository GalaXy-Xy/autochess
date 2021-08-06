package com.galaxyinblue.autochess.service.impl;

import com.galaxyinblue.autochess.entity.AcChess;
import com.galaxyinblue.autochess.mapper.AcChessMapper;
import com.galaxyinblue.autochess.service.AcChessService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AcChessServiceImpl implements AcChessService {
    @Resource
    private AcChessMapper chessMapper;

    @Override
    public List<AcChess> listAllChess(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return chessMapper.listAllChess();
    }
}
