package br.gov.sp.educjandira.educ.GestaoServidores.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
