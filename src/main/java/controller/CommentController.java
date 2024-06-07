package controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @GetMapping("/{id}")
    public Comment getComment(@PathVariable Long id) {
        // Реалізація отримання коментаря з бази даних по id
    }

    @PostMapping
    public Comment createComment(@RequestBody Comment comment) {
        // Реалізація створення нового коментаря в базі даних
    }

    @PutMapping("/{id}")
    public Comment updateComment(@PathVariable Long id, @RequestBody Comment updatedComment) {
        // Реалізація оновлення існуючого коментаря в базі даних
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        // Реалізація видалення коментаря з бази даних
    }
}
