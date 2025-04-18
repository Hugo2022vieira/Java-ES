// SimpleInterpreter - Main.java

import interpreter.Interpreter;
import parser.Parser;
import lexer.Lexer;
import lexer.Token;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código para interpretar (finalize com uma linha vazia):");

        StringBuilder sourceCode = new StringBuilder();
        while (true) {
            String line = scanner.nextLine();
            if (line.trim().isEmpty()) break;
            sourceCode.append(line).append("\n");
        }

        try {
            Lexer lexer = new Lexer(sourceCode.toString());
            Parser parser = new Parser(lexer);
            Interpreter interpreter = new Interpreter();
            interpreter.interpret(parser.parse());
        } catch (Exception e) {
            System.err.println("Erro ao interpretar: " + e.getMessage());
        }
    }
}

// lexer/Token.java
package lexer;

public enum TokenType {
    NUMBER, IDENTIFIER,
    PLUS, MINUS, STAR, SLASH,
    ASSIGN, SEMICOLON,
    LPAREN, RPAREN,
    LBRACE, RBRACE,
    IF, WHILE, PRINT,
    LT, GT, EQ,
    EOF
}

public class Token {
    public final TokenType type;
    public final String lexeme;

    public Token(TokenType type, String lexeme) {
        this.type = type;
        this.lexeme = lexeme;
    }

    @Override
    public String toString() {
        return type + "(" + lexeme + ")";
    }
}
