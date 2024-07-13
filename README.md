# SpringBoot-ReactJs-Project-Pedal
스프링부트 + 리액트_따릉이 프로젝트


## 🖥️ 프로젝트 소개
서울시 자전거 대여 서비스인 '따릉이'를 참고하여 만든 사이트 입니다.
<br>

## 🕰️ 개발 기간
* 24.03.27~24.05.09

### 🧑‍🤝‍🧑 맴버구성
 - 팀장  : 유경훈 - 프로젝트 총괄 기획 및 소셜 로그인, 메일 인증 회원가입, 장바구니, 쇼핑몰 상품 구매 내역 조회, PPT, 발표
 - 팀원1 : 윤수인 - 따릉이 이용권 결제, 상세 페이지, 상품 리뷰 등록, Node JS 1:1 채팅, 전체 CSS 디자인
 - 팀원2 : 김지은 - 따릉이 대여소 지도(카카오맵 api), 상품 등록, 상품 검색, 스프링부트 1:1 채팅
 - 팀원3 : 이후석 - 회원 정보 수정, FAQ 디자인, Footer 디자인


### ⚙️ 개발 환경
- `Java 8`
- `JDK 1.8.0`
- **IDE** : VSCode
- **Framework** : Springboot(2.7.11)
- **Database** : MySQL
- **ORM** : JPA


여기서부터 수정하기===============================================================================================================
## 📌 주요 기능
#### 로그인 - <a href="https://github.com/chaehyuenwoo/SpringBoot-Project-MEGABOX/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(Login)" >상세보기 - WIKI 이동</a>
- DB값 검증
- ID찾기, PW찾기
- 로그인 시 쿠키(Cookie) 및 세션(Session) 생성
#### 회원가입 - <a href="https://github.com/chaehyuenwoo/SpringBoot-Project-MEGABOX/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(Member)" >상세보기 - WIKI 이동</a>
- 주소 API 연동
- ID 중복 체크
#### 마이 페이지 - <a href="https://github.com/chaehyuenwoo/SpringBoot-Project-MEGABOX/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(Member)" >상세보기 - WIKI 이동</a>
- 주소 API 연동
- 회원정보 변경

#### 영화 예매 - <a href="https://github.com/chaehyuenwoo/SpringBoot-Project-MEGABOX/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(%EC%98%81%ED%99%94-%EC%98%88%EB%A7%A4)" >상세보기 - WIKI 이동</a>
- 영화 선택(날짜 지정)
- 영화관 선택(대분류/소분류 선택) 및 시간 선택
- 좌석 선택
- 결제 페이지
- 예매 완료
#### 메인 페이지 - <a href="https://github.com/chaehyuenwoo/SpringBoot-Project-MEGABOX/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(%EB%A9%94%EC%9D%B8-Page)" >상세보기 - WIKI 이동</a>
- YouTube API 연동
- 메인 포스터(영화) 이미지 슬라이드(CSS)
#### 1대1문의 및 공지사항 - <a href="" >상세보기 - WIKI 이동</a> 
- 글 작성, 읽기, 수정, 삭제(CRUD)

#### 관리자 페이지 
- 영화관 추가(대분류, 소분류)
- 영화 추가(상영시간 및 상영관 설정)
