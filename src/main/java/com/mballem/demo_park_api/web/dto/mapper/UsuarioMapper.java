package com.mballem.demo_park_api.web.dto.mapper;

import com.mballem.demo_park_api.enity.Usuario;
import com.mballem.demo_park_api.web.dto.UsuarioAllDto;
import com.mballem.demo_park_api.web.dto.UsuarioCreateDto;
import com.mballem.demo_park_api.web.dto.UsuarioResponseDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;

public class UsuarioMapper {

    public static Usuario toUsuario(UsuarioCreateDto CreateDto){
        return new ModelMapper().map(CreateDto, Usuario.class);
    }
    public static UsuarioResponseDto toDto(Usuario usuario){
        String role = usuario.getRole().name().substring("ROLE_".length());
        PropertyMap<Usuario, UsuarioResponseDto> props = new PropertyMap<Usuario, UsuarioResponseDto>() {
            @Override
            protected void configure() {
                map().setRole(role);
            }
        };
        ModelMapper mapper = new  ModelMapper();
        mapper.addMappings(props);
        return mapper.map(usuario, UsuarioResponseDto.class);
    }
    public static UsuarioAllDto allDto(Usuario usuario){
        return new ModelMapper().map(usuario, UsuarioAllDto.class);

    }
}
