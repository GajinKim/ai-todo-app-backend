package com.gajinkim.ai_todo_app_backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AiTodoAppBackendApplication

fun main(args: Array<String>) {
	runApplication<AiTodoAppBackendApplication>(*args)
}

// Running locally
// mvn spring-boot:run
// greeting url = localhost:8080/greeting?name=Gajinkim
