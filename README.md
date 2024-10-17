
# 1. API 명세서 작성

| API      | Method | URL | Request Body | Response |
|----------|--------|-----|--------------|----------|
|일정 생성  | POST   |api/schedules|{ "userId": , "title":,"content": }| { "id":, "title": , "content": ,"createdAt": , "updatedAt": }|
|일정 조회|GET|/api/schedules/{id}||{ "id": , "title": , "content":, "createdAt":, "updatedAt":}|
|일정 수정|PUT|/api/schedules/{id}| { "title":, "content" }|{ "id":, "userId":, "title": , "content": , "updatedAt": }|
|일정 삭제|DELETE|/api/schedules/{id}|||
|댓글 생성|POST|/api/schedules/{scheduleId}/comments |{ "userId": , "content": }| { "id": , "scheduleId": , "userId": , "content": , "createdAt":, "updatedAt": }|
|댓글 조회|GET|/api/comments/{id}|| { "id": , "scheduleId": , "userId": , "content": , "createdAt":, "updatedAt":}|
|댓글 수정|PUT|/api/comments/{id}|{ "content": }|{ "id": , "scheduleId": , "userId": , "content": , "updatedAt": }|
|댓글 삭제|DELETE|/api/comments/{id}|||
|유저 생성|POST|/api/users|{ "username": , "email":  }|{ "id": , "username": , "email": , "createdAt":, "updatedAt":  }|
|유저 조회|GET|/api/users/{id}||{ "id":, "username":, "email":, "createdAt":, "updatedAt":  }|
|유저 삭제|DELETE|/api/users/{id}|||

# 2. ERD 작성
```

+--------------------+          +--------------- --+          
|      Schedule      |          |       User       |         
+--------------------+          +--------------- --+          
| PK  id             |<-------- | PK  id           |         
|     title          |          |    username      |
| FK  userId         |          |     email        |          
|     content        |          |     createdAt    |          
|     createdAt      |          |     updatedAt    |                     
|     updatedAt      |          |                  |                     
+--------------------+          +----------------- +                       
          |                                     
          |                                     
          |                                     
          |                                     
+---------------------+                          
|       Comment       |                          
+---------------------+                          
| PK  id              |                          
|     content         |                          
| FK  userId          |                          
| FK  scheduleId      |                          
|     createdAt       |                          
|     updatedAt       |                          
+---------------------+          

```


