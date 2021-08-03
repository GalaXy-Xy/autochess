package com.galaxyinblue.autochess.test;

import com.galaxyinblue.autochess.entity.AcChess;
import com.galaxyinblue.autochess.mapper.AcChessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private AcChessMapper chessMapper;

    @RequestMapping("/listAllChess")
    public List<AcChess> testController(){
        System.out.println("获取棋子列表测试");
        return chessMapper.listAllChess();
    }
}
