package br.com.servico.agendatelefonica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import br.com.servico.agendatelefonica.security.jwt.JwtUtils;
import br.com.servico.agendatelefonica.services.impl.UserDetailsImpl;
import br.com.servico.agendatelefonica.services.impl.dto.AcessDTO;
import br.com.servico.agendatelefonica.services.impl.dto.AuthenticationDTO;


@Service
public class AuthService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtils jwtUtils;

    public AcessDTO login(AuthenticationDTO authenticationDTO) {
        try{
        //Cria mecanismo de credencial para o Spring
        UsernamePasswordAuthenticationToken userToken = new UsernamePasswordAuthenticationToken(authenticationDTO.getUsername(), authenticationDTO.getPassword());
        //Prepara a autenticação
        Authentication authentication = authenticationManager.authenticate(userToken);
        //Busca o usuário autenticado
        UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();

        String token = jwtUtils.generateTokenFromUserDetailsImpl(userDetails);

        AcessDTO acessDTO = new AcessDTO(token);

        return acessDTO;
        
        }catch(BadCredentialsException e){
            // LOGIN OU SENHA INVÁLIDO
        }
        return null;
    }
}
