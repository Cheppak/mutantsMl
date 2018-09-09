package ar.com.sac.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN, reason="Is not a mutant")
public class ForbiddenException extends RuntimeException {}