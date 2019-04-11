grammar ProyectoFinal;

start
:
	proyecto
;
proyecto: (librerias)? programa contenido fin? ;
librerias: IMPORT nombrelibreria ;
nombrelibreria: CARACTERES ;
programa: PROGRAM nombreprograma ;
nombreprograma: CARACTERES ;
contenido: MAIN (variables)? sentencias* ;
variables: (tipovariable (CARACTERES | caracteresynumeros))* ;
tipovariable: INT | FLOAT| BOOLEAN | CHAR | STRING ;
sentencias: imprimirvalor | agregarvalor ;
imprimirvalor: PRINT (CARACTERES (CARACTERES | caracteresynumeros)?) ;
agregarvalor: (CARACTERES | caracteresynumeros) '=' (CARACTERES | caracteresynumeros) ;
cadena: CARACTERES | caracteresynumeros;
numeros: ('0'..'9') ;
caracteresynumeros: (CARACTERES numeros);
fin: END ;

fragment A: 'a'|'A' ;
fragment B: 'b'|'B' ;
fragment C: 'c'|'C' ;
fragment D: 'd'|'D' ;
fragment E: 'e'|'E' ;
fragment F: 'f'|'F' ;
fragment G: 'g'|'G' ;
fragment H: 'h'|'H' ;
fragment I: 'i'|'I' ;
fragment J: 'j'|'J' ;
fragment K: 'k'|'K' ;
fragment L: 'l'|'L' ;
fragment M: 'm'|'M' ;
fragment N: 'n'|'N' ;
fragment O: 'o'|'O' ;
fragment P: 'p'|'P' ;
fragment Q: 'q'|'Q' ;
fragment R: 'r'|'R' ;
fragment S: 's'|'S' ;
fragment T: 't'|'T' ;
fragment U: 'u'|'U' ;
fragment V: 'v'|'V' ;
fragment W: 'w'|'W' ;
fragment X: 'x'|'X' ;
fragment Y: 'y'|'Y' ;
fragment Z: 'z'|'Z' ;

IMPORT: I M P O R T;
PROGRAM: P R O G R A M  ;
MAIN: M A I N ;
INT: I N T ;
FLOAT: F L O A T ;
BOOLEAN: B O O L E A N ;
CHAR: C H A R ;
STRING: S T R I N G ;
PRINT: P R I N T ;
END: E N D ;

WS
:
	[ \t\r\n]+ -> skip
;
CARACTERES: ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;