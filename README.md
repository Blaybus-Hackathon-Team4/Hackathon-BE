# back

## 📝 프로젝트 소개

본 프로젝트는 Spring Boot를 기반으로 구축된 백엔드 서버입니다. 사용자 인증, 결제 기능 및 Google Calendar 연동을 포함한 다양한 기능을 제공합니다.

## ✨ 주요 기능

- **사용자 인증**: JWT (JSON Web Token) 및 Google OAuth2를 이용한 안전한 사용자 인증 및 인가 기능을 제공합니다.
- **결제 서비스**: 아임포트(I'mport) API를 연동하여 결제 기능을 구현했습니다.
- **Google Calendar 연동**: Google Calendar API를 통해 사용자의 캘린더 정보를 읽고 새로운 이벤트를 생성할 수 있습니다.

## 🛠️ 기술 스택

- **언어**: Java 17
- **프레임워크**: Spring Boot 3.4.2
- **데이터베이스**: MySQL
- **인증**: Spring Security, JWT, OAuth2
- **ORM**: Spring Data JPA
- **빌드 도구**: Gradle

## 📂 프로젝트 구조

```
src
└── main
    └── java
        └── blaybus
            └── mvp
                └── back
                    ├── config       # Spring Security, CORS 등 설정
                    ├── controller   # API 엔드포인트
                    ├── domain       # JPA 엔티티
                    ├── dto          # 데이터 전송 객체
                    ├── event        # 애플리케이션 이벤트
                    ├── exception    # 예외 처리
                    ├── filter       # 서블릿 필터 (JWT 인증 등)
                    ├── jwt          # JWT 관련 유틸리티
                    ├── repository   # Spring Data JPA 리포지토리
                    ├── service      # 비즈니스 로직
                    └── BackApplication.java # 애플리케이션 시작점
```

## 🚀 빌드 및 실행 방법

### 1. Gradle로 빌드하기

프로젝트 루트 디렉토리에서 다음 명령어를 실행하여 애플리케이션을 빌드합니다.

```bash
./gradlew build
```

### 2. Docker로 실행하기

본 프로젝트는 Docker를 사용하여 쉽게 실행할 수 있습니다.

1.  **Docker 이미지 빌드**:
    ```bash
    docker build -t back-app .
    ```

2.  **Docker 컨테이너 실행**:
    ```bash
    docker run -p 8080:8080 back-app
    ```

### 3. Jar 파일 직접 실행하기

빌드가 완료되면 `build/libs` 디렉토리에 생성된 `.jar` 파일을 직접 실행할 수도 있습니다.

```bash
java -jar build/libs/back-0.0.1-SNAPSHOT.jar
```

**참고**: 애플리케이션 실행 전에 `src/main/resources`에 `application.yml` 또는 `.env` 파일을 생성하여 데이터베이스 연결 정보, JWT 시크릿 키, OAuth 클라이언트 ID 등의 환경변수를 설정해야 합니다.
