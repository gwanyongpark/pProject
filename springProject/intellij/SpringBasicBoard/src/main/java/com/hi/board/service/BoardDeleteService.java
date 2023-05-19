package com.hi.board.service;

import com.hi.board.domain.BoardDTO;
import com.hi.board.mapper.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Service
@Log4j2
public class BoardDeleteService {

    @Autowired
    private BoardMapper boardMapper;

    public int deleteBoard(int bno, HttpServletRequest request){

        // 지우기 전에 삭제 대상의 파일 이름을 획득
        BoardDTO board = boardMapper.selectByBno(bno);
        String delFileName = board.getFile();
        // DB 삭제
        int result = boardMapper.deleteBoard(bno);
        // 파일 삭제
        if (delFileName !=null){
            // 웹 경로
            String uri = "/uploadfile/board";
            // 실제경로
            String realPath = request.getSession().getServletContext().getRealPath(uri);
            // 삭제 대상 파일의 file 객체
            File delFile = new File(realPath, delFileName);
            // 현재 file 의 존재 여부 확인
            log.info("삭제 대상 파일 존재 유무 : " + delFile.exists());
            // 존재하면 삭제
            if (delFile.exists()){
                // 삭제
                delFile.delete();
                log.info("첨부파일 삭제...");
            }
        }

        return boardMapper.deleteBoard(bno);
    }

}
