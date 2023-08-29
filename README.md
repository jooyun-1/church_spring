# church_spring
>  규모가 작은 교회들을 도와드리는 목적으로 웹사이트를 구현
<br/>

## 담당

local_church API Spring으로 구축

## 기술 스택

* Spring Boot
* JPA

## 목업 및 화면 설계

> **figma 이용**
<br/>
Link : https://www.figma.com/file/xygb0waaTYsL8H7h0MdwKv/%EC%B0%B8%EC%A2%8B%EC%9D%80%EA%B5%90%ED%9A%8C?node-id=0-1&t=irmnUbzoVga9noPR-0

## ERD 설계

![local_church (7)](https://github.com/jooyun-1/church_spring/assets/71087271/762dcb23-6675-452b-8984-682374e7c70c)

## API 설계

<div align = "left">
  
![image](https://github.com/jooyun-1/church_spring/assets/71087271/fc6a1f23-b233-4afa-b5d0-f9f48aeb74fa) ![image](https://github.com/jooyun-1/church_spring/assets/71087271/c8f38573-443d-4c4c-9220-3f6af0c2d0c7)

</div>

 규모가 작은 교회들을 도와드리는 목적으로 웹사이트를 구현해드리는 것이므로 필요한 정보나 내용들을 입력하실 관리자분이 계시기 힘들었다. 따라서, Database에는 사이트에 들어갈 정보들을 요청드리고 미리 Insert해둘 예정이었기 때문에 Method가 GET방식만으로 설계되었다.


## 구현

- **Node.js, express와 Spring boot 이용**
    
    실제 배포는 규모가 큰 프로젝트가 아니므로 Spring 대신 express 이용
    
    Spring boot를 이용하여 같은 API를 개발하여 성능 비교하기 위해 두 가지 모두 활용하여 구현해봄.
    
- **ORM (Sequelize, JPA) 이용**
    
    객체를 이용하여 더 직관적이고 로직에 집중하기 위해 사용
    
    재사용 및 유지보수가 편리하다
    
    무엇보다 프로젝트가 복잡한 편은 아니기 때문에 ORM이 편리
    
- **Blog 크롤링**
    
    ‘교회 생활’ 페이지에 블로그 포스팅 내용을 주기적으로 갱신시켜주기 위해 크롤링하여
    
    DB에 업데이트시켜줌.
    
    **‘Puppeteer’ 사용**
    
    ⇒ Headless Brower를 통해 백엔드 단에서 동작시키며 키보드, 마우스 등의 여러 기능을 사용하며 크롤링을 쉽게 구현시킬 수 있게 도와주기 때문에 선택.
    

- **Postman**
    
    구현한 API에서 data가 올바르게 전달되는지 확인 및 테스트하기 위해 사용
    
    Spring boot vs Node.js 응답시간, 메모리 등 비교
    
- **AWS S3**
    
    이미지 파일 전달할 때, S3 서비스 이용하여 버킷에 저장하여 구현
    블로그 이미지 크롤링 시, 핫링크 차단 문제를 해결하기 위해 S3에 이미지를 업로드하여 URI를 가져오는 것으로 해결

