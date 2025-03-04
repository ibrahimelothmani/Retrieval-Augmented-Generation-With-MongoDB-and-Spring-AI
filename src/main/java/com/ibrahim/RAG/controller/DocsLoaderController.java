package com.ibrahim.RAG.controller;


import com.ibrahim.RAG.service.DocsLoaderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/docs")
public class DocsLoaderController {

    private final DocsLoaderService docsLoaderService;

    public DocsLoaderController(DocsLoaderService docsLoaderService) {
        this.docsLoaderService = docsLoaderService;
    }

    @GetMapping("/load")
    public String loadDocuments() {
        return docsLoaderService.loadDocs();
    }

}