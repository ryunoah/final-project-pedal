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

#### 메인화면 모습
![image](https://github.com/user-attachments/assets/6bc747cb-01a4-4455-b539-bee7cda8c094)


## 📌 담당 기능
#### 로그인 
![image](https://github.com/user-attachments/assets/1c053c31-4118-4cc5-b3e4-4b4ec91cb014)

![image](https://github.com/user-attachments/assets/74b1fd5a-616b-49ea-bfa7-cbe1022785e3)
- JavaMailSender를 활용하여 회원가입 인증 이메일을 전송합니다. 
- Oauth2 클라이언트 라이브러리를 사용하여 구글 로그인이 가능하도록 구현하였습니다.
- 일반회원과 소셜회원 DB를 조회하여 중복회원 검사가 가능합니다. 
- 비밀번호는 암호화되어 DB에 저장됩니다.
- Jwt토큰을 발행하고 쿠키를 통해 로그인을 유지합니다.
- 로그인한 유저의 쿠키 속 토큰을 react에서 jwt-decode로 해석하고 리덕스로 데이터를 이동합니다.
  
#### 장바구니
![image](https://github.com/user-attachments/assets/c8d868c2-ab28-409f-be6d-f9f057577206)

- 장바구니 상품 추가, 수정, 삭제를 JPA를 사용하여 데이터베이스에 연동시켰습니다.
- 엔티티간 FK를 설정하는 대신 관계된 두 엔티티 조회는 JPA를 두 번 사용하여 조회하였습니다. 

