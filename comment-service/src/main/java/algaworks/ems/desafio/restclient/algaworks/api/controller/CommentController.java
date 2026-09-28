package algaworks.ems.desafio.restclient.algaworks.api.controller;

import algaworks.ems.desafio.restclient.algaworks.api.model.CommentInput;
import algaworks.ems.desafio.restclient.algaworks.api.model.CommentOutput;
import algaworks.ems.desafio.restclient.algaworks.domain.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import org.springframework.data.domain.Pageable;
import java.util.UUID;

@RestController
@RequestMapping("/api/comments")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CommentOutput createComment(@RequestBody CommentInput input) {
        return commentService.createComment(input);
    }

    @GetMapping("/{id}")
    public CommentOutput getCommentById(@PathVariable String id) {
        return commentService.getCommentById(UUID.fromString(id));
    }

    @GetMapping
    public Page<CommentOutput> getAllComments(Pageable pageable) {
        return commentService.getAllComments(pageable);
    }
}