lexer grammar InternalAlf;
@header {
package org.xtext.alf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

T13 : ';' ;
T14 : 'activity' ;
T15 : ':' ;
T16 : '(' ;
T17 : ')' ;
T18 : ',' ;
T19 : '[' ;
T20 : ']' ;
T21 : 'ordered' ;
T22 : 'nonUnique' ;
T23 : 'sequence' ;
T24 : '..' ;
T25 : '*' ;
T26 : 'any' ;
T27 : 'redefines' ;
T28 : '++' ;
T29 : '--' ;
T30 : '::' ;
T31 : '<' ;
T32 : '>' ;
T33 : '=>' ;
T34 : '?' ;
T35 : '||' ;
T36 : '&&' ;
T37 : '|' ;
T38 : '^' ;
T39 : '&' ;
T40 : '==' ;
T41 : '!=' ;
T42 : 'instanceof' ;
T43 : 'hastype' ;
T44 : '<=' ;
T45 : '>=' ;
T46 : '<<' ;
T47 : '>>' ;
T48 : '>>>' ;
T49 : '+' ;
T50 : '-' ;
T51 : '/' ;
T52 : '%' ;
T53 : '!' ;
T54 : '$' ;
T55 : '~' ;
T56 : '.' ;
T57 : '->' ;
T58 : 'reduce' ;
T59 : '=' ;
T60 : 'isUnique' ;
T61 : 'null' ;
T62 : 'this' ;
T63 : 'super' ;
T64 : 'new' ;
T65 : '{' ;
T66 : '}' ;
T67 : '/*@' ;
T68 : 'inline' ;
T69 : '*/' ;
T70 : '//@' ;
T71 : 'let' ;
T72 : 'if' ;
T73 : 'else' ;
T74 : 'or' ;
T75 : 'switch' ;
T76 : 'case' ;
T77 : 'default' ;
T78 : 'while' ;
T79 : 'do' ;
T80 : 'for' ;
T81 : 'in' ;
T82 : 'break' ;
T83 : 'return' ;
T84 : 'accept' ;
T85 : 'classify' ;
T86 : 'from' ;
T87 : 'to' ;
T88 : 'out' ;
T89 : 'inout' ;
T90 : 'true' ;
T91 : 'false' ;
T92 : 'createLink' ;
T93 : 'destroyLink' ;
T94 : 'clearAssoc' ;
T95 : 'destroy' ;
T96 : 'select' ;
T97 : 'reject' ;
T98 : 'collect' ;
T99 : 'iterate' ;
T100 : 'forAll' ;
T101 : 'exists' ;
T102 : 'one' ;
T103 : 'isolated' ;
T104 : 'determined' ;
T105 : 'assured' ;
T106 : 'parallel' ;
T107 : '+=' ;
T108 : '-=' ;
T109 : '*=' ;
T110 : '%=' ;
T111 : '/=' ;
T112 : '&=' ;
T113 : '|=' ;
T114 : '^=' ;
T115 : '<<=' ;
T116 : '>>=' ;
T117 : '>>>=' ;

// $ANTLR src "../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g" 10050
RULE_INTEGERVALUE : (('0'|'1'..'9' ('_'? '0'..'9')*)|('0b'|'0B') '0'..'1' ('_'? '0'..'1')*|('0x'|'0X') ('0'..'9'|'a'..'f'|'A'..'F') ('_'? ('0'..'9'|'a'..'f'|'A'..'F'))*|'0' '_'? '0'..'7' ('_'? '0'..'7')*);

// $ANTLR src "../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g" 10052
RULE_IMPORT_ID : 'import' RULE_WS ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ('.' ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*)*;

// $ANTLR src "../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g" 10054
RULE_ID : (('a'..'z'|'A'..'Z'|'_'|'"') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'"')*|'\'' ( options {greedy=false;} : . )*'\'');

// $ANTLR src "../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g" 10056
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g" 10058
RULE_ML_COMMENT : '/*' ~('@')* '*/';

// $ANTLR src "../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g" 10060
RULE_SL_COMMENT : '//' ~(('\n'|'\r'|'@'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g" 10062
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g" 10064
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g" 10066
RULE_ANY_OTHER : .;


