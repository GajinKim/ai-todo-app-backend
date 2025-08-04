package com.gajinkim.ai_todo_app_backend

// ! - Resource Representation Class

// data class = public record (in java)
data class Greeting(val id: Long, val content : String) { }

// TODO - implement this without using a data class (traditionally) for practice
// https://www.baeldung.com/java-record-keyword

// mvn compile - generates everything in the classes folder
// mvn build - generates everything in the target folder