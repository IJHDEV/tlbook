package com.booknow.travelapp.airways.test_service;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.booknow.travelapp.airways.service.AirRouteService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@WebAppConfiguration    //테스트 시, DispatcherServlet의 servlet-context.xml 설정 구성파일(들)을 사용하기 위한 어노테이션
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/mybatis-context.xml",
                       "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
@Log4j
public class AirRouteTestService {

    @Setter(onMethod_ = { @Autowired })
    private AirRouteService airRouteService;
      
//// 따라서, JUnit에서는 아래의 setter 주입방식을 이용해야 합니다.
////
//    @Autowired
//    public void setMyBoardService(AirRouteService airRouteService) {
//        this.airRouteService = airRouteService;
//	} /*-> 필드 선언 및 setter에 의한 자동 주입 코드가 @Setter(onMethod_ = { @Autowired }) 어노테이션으로 대체됨*/

    //MyBoardService 빈 생성 유무 확인 테스트
//    @Test
//    public void testMyBoardServiceExist() {
//    
//        log.info(airRouteService);
//        //myBoardService가 null 이면, AssertionError 예외 발생
//        assertNotNull(airRouteService) ; 
//    }


//    //게시물 목록 조회 서비스 테스트
//    @Test
//    public void testGetBoardList() {
//  	  String a = "서울";
//  	  String b = "제주";
//        airRouteService.getAirRoute(a,b,"20230628").forEach(airRotue -> System.out.println(airRotue));
//        System.out.println(airRouteService);
//    }


//    //게시물 등록(selectKey 이용) 테스트
//    @Test
//    public void testRegisterBoard() {
//    	MyBoardVO myBoard = new MyBoardVO(0L, "서비스 테스트-입력제목", "서비스 테스트-입력내용", "test", 0, 0, 0, null, null );
////        MyBoardVO myBoard = new MyBoardVO();
////        myBoard.setBtitle("서비스 새글 입력  테스트 제목");
////        myBoard.setBcontent("서비스 새글 입력 테스트  내용");
////        myBoard.setBwriter("test");
//
//import static org.junit.Assert.assertNotNull;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//
//import com.booknow.travelapp.airways.service.AirRouteService;
//
//import lombok.Setter;
//import lombok.extern.log4j.Log4j;
//
//@WebAppConfiguration    //테스트 시, DispatcherServlet의 servlet-context.xml 설정 구성파일(들)을 사용하기 위한 어노테이션
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration({"file:src/main/webapp/WEB-INF/spring/mybatis-context.xml",
//                       "file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" })
//@Log4j
//public class AirRouteTestService {
//
//    @Setter(onMethod_ = { @Autowired })
//    private AirRouteService airRouteService;
//      
////// 따라서, JUnit에서는 아래의 setter 주입방식을 이용해야 합니다.
//////
//    @Autowired
//    public void setMyBoardService(AirRouteService airRouteService) {
//        this.airRouteService = airRouteService;
//	} /*-> 필드 선언 및 setter에 의한 자동 주입 코드가 @Setter(onMethod_ = { @Autowired }) 어노테이션으로 대체됨*/
//
//    //MyBoardService 빈 생성 유무 확인 테스트
////    @Test
////    public void testMyBoardServiceExist() {
////    
////        log.info(airRouteService);
////        //myBoardService가 null 이면, AssertionError 예외 발생
////        assertNotNull(airRouteService) ; 
////    }
//
//
////    //게시물 목록 조회 서비스 테스트
//    @Test
//    public void testGetBoardList() {
//  	  String a = "서울";
//  	  String b = "제주";
//        airRouteService.getAirRoute(a,b,"20230628").forEach(airRotue -> System.out.println(airRotue));
//        System.out.println(airRouteService);
//    }
//
//
////    //게시물 등록(selectKey 이용) 테스트
////    @Test
////    public void testRegisterBoard() {
////    	MyBoardVO myBoard = new MyBoardVO(0L, "서비스 테스트-입력제목", "서비스 테스트-입력내용", "test", 0, 0, 0, null, null );
//////        MyBoardVO myBoard = new MyBoardVO();
//////        myBoard.setBtitle("서비스 새글 입력  테스트 제목");
//////        myBoard.setBcontent("서비스 새글 입력 테스트  내용");
//////        myBoard.setBwriter("test");
////
////        myBoardService.registerBoard(myBoard);
////        log.info("등록된 게시물의 Bno: " + myBoard.getBno());
////
////    }
//
//    //게시물 수정 테스트
////    @Test
////    public void testModifyBoard() {
////
////        MyBoardVO myBoard = myBoardService.getBoard(1L);
////        
////        if (myBoard == null) {
////           return;
////        }
////        
////        myBoard.setBtitle("제목 수정:서비스 테스트");
////        log.info("수정된 게시물 조회 결과(boolean): " + myBoardService.modifyBoard(myBoard));
////    }
//
//    //게시물 조회  테스트: by bno + 조회수 증가 고려
////    @Test
////    public void testGetBoard() {
////        log.info(myBoardService.getBoard(1L));
////        
////    }
//
////    //게시물 삭제 요청 처리 서비스 테스트 - bdelFlag 컬럼만 1로 수정
////    @Test
////    public void testSetBoardDeleted() {
////        // 게시물 번호의 존재 여부를 확인하고 테스트할 것
////        log.info("수행결과: " + myBoardService.setBoardDeleted(7L));
////        log.info("수행결과: " + myBoardService.setBoardDeleted(8L));
////        log.info(myBoardService.getBoard(7L));
////        log.info(myBoardService.getBoard(8L));
////    }
//
//
////    //특정 게시물 삭제  테스트 - 실제 삭제
////    @Test
////    public void testRemoveBoard() {
////        // 게시물 번호의 존재 여부를 확인하고 테스트할 것
////        log.info("서비스: 특정 게시물 삭제 테스트: " + myBoardService.removeBoard(6L));
////        log.info(myBoardService.getBoard(6L));
////    }
//
////    //게시물 삭제 테스트 – 사용자 삭제 요청된 게시물(bdelFlag = 1) 전체 삭제
////    @Test
////    public void testRemoveAllDeletedBoard() {
////        log.info("서비스: 삭제 설정된 모든 게시물 삭제로 삭제된 행 수: " + myBoardService.removeAllDeletedBoard());
////    }
//
////    @Test
////    public void testGetBoardList() {
////        //페이징 고려 안함
////        //myBoardService.getBoardList().forEach(myBoard -> log.info(myBoard));  //주석처리
////
////        //페이징 고려
////        myBoardService.getBoardList(new MyBoardPagingDTO(2, 10)).forEach(myBoard -> log.info(myBoard));
////        
////    }
// 
//    
//    
}
