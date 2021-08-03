package com.galaxyinblue.autochess.mapper;

import com.galaxyinblue.autochess.entity.AcChess;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface AcChessMapper {
    List<AcChess> listAllChess();
}
