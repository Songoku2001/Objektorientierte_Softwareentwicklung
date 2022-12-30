
grammar SimpleScript;

@header {
package name.panitz.util;
}
script
  : script (MULT | DIV| MOD) script
  | script  (ADD | SUB) script 
  | VARIABLE  EQ script 
  | VARIABLE
  | NUMBER
  | IF script THEN script ELSE script 
  | WHILE script DO script 
  | LBRACE (script)+ RBRACE
  | LPAREN script RPAREN
;

WHILE: 'while';
DO: 'do';
IF: 'if';
THEN: 'then';
ELSE: 'else';

VARIABLE
   : VALID_ID_START VALID_ID_CHAR*
   ;

fragment VALID_ID_START: ('a' .. 'z') | ('A' .. 'Z') | '_';
fragment VALID_ID_CHAR: VALID_ID_START | ('0' .. '9') ;

NUMBER: ('1' .. '9')('0' .. '9')* | '0';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
SEMICOLON: ';';
ADD: '+';
SUB: '-';
MULT: '*';
DIV: '/';
MOD: '%';
EQ: '=';



LINE_COMMENT: '//' .*?  '\n' -> skip; //Match "//" stuff '\n'
COMMENT: '/*' .*? '*/' -> skip;  //Match /* stuff */

WS : [ \r\n\t] + -> skip;

