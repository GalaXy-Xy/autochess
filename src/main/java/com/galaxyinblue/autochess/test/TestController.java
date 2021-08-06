package com.galaxyinblue.autochess.test;

import com.galaxyinblue.autochess.entity.AcChess;
import com.galaxyinblue.autochess.service.AcChessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private AcChessService chessService;

    @RequestMapping("/testPageHelper")
    public List<AcChess> testPageHelper(int pageNum,int pageSize){
        System.out.println(pageNum);
        System.out.println(pageSize);
        return chessService.listAllChess(pageNum,pageSize);
    }
}
