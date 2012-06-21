lexer grammar InternalAlf;
@header {
package org.xtext.alf.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

T13 : ';' ;
T14 : 'any' ;
T15 : '++' ;
T16 : '--' ;
T17 : '==' ;
T18 : '!=' ;
T19 : 'instanceof' ;
T20 : 'hastype' ;
T21 : '<' ;
T22 : '>' ;
T23 : '<=' ;
T24 : '>=' ;
T25 : '<<' ;
T26 : '>>' ;
T27 : '>>>' ;
T28 : '+' ;
T29 : '-' ;
T30 : '*' ;
T31 : '/' ;
T32 : '%' ;
T33 : '!' ;
T34 : '$' ;
T35 : '~' ;
T36 : 'in' ;
T37 : 'out' ;
T38 : 'inout' ;
T39 : 'true' ;
T40 : 'false' ;
T41 : 'createLink' ;
T42 : 'destroyLink' ;
T43 : 'clearAssoc' ;
T44 : 'destroy' ;
T45 : 'select' ;
T46 : 'reject' ;
T47 : 'collect' ;
T48 : 'iterate' ;
T49 : 'forAll' ;
T50 : 'exists' ;
T51 : 'one' ;
T52 : 'isolated' ;
T53 : 'determined' ;
T54 : 'assured' ;
T55 : 'parallel' ;
T56 : '=' ;
T57 : '+=' ;
T58 : '-=' ;
T59 : '*=' ;
T60 : '%=' ;
T61 : '/=' ;
T62 : '&=' ;
T63 : '|=' ;
T64 : '^=' ;
T65 : '<<=' ;
T66 : '>>=' ;
T67 : '>>>=' ;
T68 : 'activity' ;
T69 : ':' ;
T70 : '(' ;
T71 : ')' ;
T72 : ',' ;
T73 : '[' ;
T74 : ']' ;
T75 : '..' ;
T76 : 'redefines' ;
T77 : '::' ;
T78 : '=>' ;
T79 : '?' ;
T80 : '||' ;
T81 : '&&' ;
T82 : '|' ;
T83 : '^' ;
T84 : '&' ;
T85 : '.' ;
T86 : '->' ;
T87 : 'reduce' ;
T88 : 'isUnique' ;
T89 : 'null' ;
T90 : 'this' ;
T91 : 'super' ;
T92 : 'new' ;
T93 : '{' ;
T94 : '}' ;
T95 : '/*@' ;
T96 : 'inline' ;
T97 : '*/' ;
T98 : '//@' ;
T99 : 'let' ;
T100 : 'if' ;
T101 : 'else' ;
T102 : 'or' ;
T103 : 'switch' ;
T104 : 'case' ;
T105 : 'default' ;
T106 : 'while' ;
T107 : 'do' ;
T108 : 'for' ;
T109 : 'break' ;
T110 : 'return' ;
T111 : 'accept' ;
T112 : 'classify' ;
T113 : 'from' ;
T114 : 'to' ;
T115 : 'ordered' ;
T116 : 'nonUnique' ;
T117 : 'sequence' ;

// $ANTLR src "../org.xtext.alf.ui/src-gen/org/xtext/alf/ui/contentassist/antlr/internal/InternalAlf.g" 21252
RULE_INTEGERVALUE : (('0'|'1'..'9' ('_'? '0'..'9')*)|('0b'|'0B') '0'..'1' ('_'? '0'..'1')*|('0x'|'0X') ('0'..'9'|'a'..'f'|'A'..'F') ('_'? ('0'..'9'|'a'..'f'|'A'..'F'))*|'0' '_'? '0'..'7' ('_'? '0'..'7')*);

// $ANTLR src "../org.xtext.alf.ui/src-gen/org/xtext/alf/ui/contentassist/antlr/internal/InternalAlf.g" 21254
RULE_IMPORT_ID : 'import' RULE_WS ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ('.' ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*)*;

// $ANTLR src "../org.xtext.alf.ui/src-gen/org/xtext/alf/ui/contentassist/antlr/internal/InternalAlf.g" 21256
RULE_ID : (('a'..'z'|'A'..'Z'|'_'|'"') ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'"')*|'\'' ( options {greedy=false;} : . )*'\'');

// $ANTLR src "../org.xtext.alf.ui/src-gen/org/xtext/alf/ui/contentassist/antlr/internal/InternalAlf.g" 21258
RULE_STRING : '"' ('\\' ('b'|'t'|'n'|'f'|'r'|'"'|'\''|'\\')|~(('\\'|'"')))* '"';

// $ANTLR src "../org.xtext.alf.ui/src-gen/org/xtext/alf/ui/contentassist/antlr/internal/InternalAlf.g" 21260
RULE_ML_COMMENT : '/*' ~('@')* '*/';

// $ANTLR src "../org.xtext.alf.ui/src-gen/org/xtext/alf/ui/contentassist/antlr/internal/InternalAlf.g" 21262
RULE_SL_COMMENT : '//' ~(('\n'|'\r'|'@'))* ('\r'? '\n')?;

// $ANTLR src "../org.xtext.alf.ui/src-gen/org/xtext/alf/ui/contentassist/antlr/internal/InternalAlf.g" 21264
RULE_WS : (' '|'\t'|'\r'|'\n')+;

// $ANTLR src "../org.xtext.alf.ui/src-gen/org/xtext/alf/ui/contentassist/antlr/internal/InternalAlf.g" 21266
RULE_INT : ('0'..'9')+;

// $ANTLR src "../org.xtext.alf.ui/src-gen/org/xtext/alf/ui/contentassist/antlr/internal/InternalAlf.g" 21268
RULE_ANY_OTHER : .;


