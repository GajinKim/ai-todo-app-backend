package com.gajinkim.ai_todo_app_backend

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.gajinkim.ai_todo_app_backend.Greeting
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    companion object {
        private const val template = "Hello, %s!"
    }
    private val counter = AtomicLong()

    // ! - other mappings exist, like @PostMapping; all derived from @RequestMapping
    @GetMapping("/greeting")
    fun greeting(@RequestParam name: String = "World") =
        Greeting(counter.incrementAndGet(), String.format(template, name))
}