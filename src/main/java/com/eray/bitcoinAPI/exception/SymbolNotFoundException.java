package com.eray.bitcoinAPI.exception;

public class SymbolNotFoundException extends RuntimeException{
    public SymbolNotFoundException(String message) {
        super(message);
    }
}
