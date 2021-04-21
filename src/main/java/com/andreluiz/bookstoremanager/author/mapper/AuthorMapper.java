package com.andreluiz.bookstoremanager.author.mapper;

import com.andreluiz.bookstoremanager.author.dto.AuthorDTO;
import com.andreluiz.bookstoremanager.author.entity.Author;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface AuthorMapper {

    AuthorMapper INSTANCE = Mappers.getMapper(AuthorMapper.class);

    Author toModel(AuthorDTO authorDTO);

    AuthorDTO toDTO(Author author);
}
