package com.ajsolucoes.notificacao.infrastructure;

import com.ajsolucoes.notificacao.busisness.EmailService;

public class EmailException extends RuntimeException{
    public EmailException(String mensagem, Throwable throwable){
        super(mensagem, throwable);
    }
}
