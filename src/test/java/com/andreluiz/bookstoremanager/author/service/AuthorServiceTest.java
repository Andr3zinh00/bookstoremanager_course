package com.andreluiz.bookstoremanager.author.service;

import com.andreluiz.bookstoremanager.author.builder.AuthorDTOBuilder;
import com.andreluiz.bookstoremanager.author.mapper.AuthorMapper;
import com.andreluiz.bookstoremanager.author.repository.AuthorRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class AuthorServiceTest {

    private final AuthorMapper authorMapper = AuthorMapper.INSTANCE;

    @Mock
    private AuthorRepository authorRepository;

    @InjectMocks
    private AuthorService authorService;

    AuthorDTOBuilder authorDTOBuilder;


    @BeforeEach
    private void setUp() {
        authorDTOBuilder = AuthorDTOBuilder.builder().build();
        authorDTOBuilder.buildAuthorDTO();
    }

}
