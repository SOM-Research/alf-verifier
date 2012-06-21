package org.xtext.alf.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlfLexer extends Lexer {
    public static final int T114=114;
    public static final int T115=115;
    public static final int T116=116;
    public static final int RULE_ID=5;
    public static final int T117=117;
    public static final int RULE_ANY_OTHER=12;
    public static final int T29=29;
    public static final int T28=28;
    public static final int T27=27;
    public static final int T26=26;
    public static final int T25=25;
    public static final int T24=24;
    public static final int EOF=-1;
    public static final int T23=23;
    public static final int T22=22;
    public static final int T21=21;
    public static final int T20=20;
    public static final int T38=38;
    public static final int T37=37;
    public static final int T39=39;
    public static final int T34=34;
    public static final int T33=33;
    public static final int T36=36;
    public static final int T35=35;
    public static final int T30=30;
    public static final int RULE_INTEGERVALUE=6;
    public static final int T32=32;
    public static final int T31=31;
    public static final int T49=49;
    public static final int T48=48;
    public static final int T100=100;
    public static final int T43=43;
    public static final int T42=42;
    public static final int T102=102;
    public static final int T41=41;
    public static final int T101=101;
    public static final int T40=40;
    public static final int T47=47;
    public static final int T46=46;
    public static final int RULE_ML_COMMENT=8;
    public static final int T45=45;
    public static final int T44=44;
    public static final int T109=109;
    public static final int T107=107;
    public static final int T108=108;
    public static final int RULE_STRING=7;
    public static final int T105=105;
    public static final int T106=106;
    public static final int T103=103;
    public static final int T104=104;
    public static final int T50=50;
    public static final int T59=59;
    public static final int T113=113;
    public static final int T52=52;
    public static final int T112=112;
    public static final int T51=51;
    public static final int T111=111;
    public static final int T54=54;
    public static final int T110=110;
    public static final int T53=53;
    public static final int T56=56;
    public static final int T55=55;
    public static final int T58=58;
    public static final int T57=57;
    public static final int T75=75;
    public static final int T76=76;
    public static final int T73=73;
    public static final int T74=74;
    public static final int T79=79;
    public static final int T77=77;
    public static final int T78=78;
    public static final int T72=72;
    public static final int T71=71;
    public static final int T70=70;
    public static final int T62=62;
    public static final int T63=63;
    public static final int T64=64;
    public static final int T65=65;
    public static final int T66=66;
    public static final int T67=67;
    public static final int T68=68;
    public static final int T69=69;
    public static final int RULE_INT=11;
    public static final int T61=61;
    public static final int T60=60;
    public static final int T99=99;
    public static final int T97=97;
    public static final int T98=98;
    public static final int T95=95;
    public static final int T96=96;
    public static final int T94=94;
    public static final int Tokens=118;
    public static final int T93=93;
    public static final int RULE_SL_COMMENT=9;
    public static final int T92=92;
    public static final int T91=91;
    public static final int T90=90;
    public static final int RULE_IMPORT_ID=4;
    public static final int T88=88;
    public static final int T89=89;
    public static final int T84=84;
    public static final int T85=85;
    public static final int T86=86;
    public static final int T87=87;
    public static final int T13=13;
    public static final int T14=14;
    public static final int RULE_WS=10;
    public static final int T15=15;
    public static final int T81=81;
    public static final int T16=16;
    public static final int T80=80;
    public static final int T17=17;
    public static final int T83=83;
    public static final int T18=18;
    public static final int T82=82;
    public static final int T19=19;
    public InternalAlfLexer() {;} 
    public InternalAlfLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g"; }

    // $ANTLR start T13
    public final void mT13() throws RecognitionException {
        try {
            int _type = T13;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10:5: ( ';' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10:7: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T13

    // $ANTLR start T14
    public final void mT14() throws RecognitionException {
        try {
            int _type = T14;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:11:5: ( 'activity' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:11:7: 'activity'
            {
            match("activity"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T14

    // $ANTLR start T15
    public final void mT15() throws RecognitionException {
        try {
            int _type = T15;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:12:5: ( ':' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:12:7: ':'
            {
            match(':'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T15

    // $ANTLR start T16
    public final void mT16() throws RecognitionException {
        try {
            int _type = T16;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:13:5: ( '(' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:13:7: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T16

    // $ANTLR start T17
    public final void mT17() throws RecognitionException {
        try {
            int _type = T17;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:14:5: ( ')' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:14:7: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T17

    // $ANTLR start T18
    public final void mT18() throws RecognitionException {
        try {
            int _type = T18;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:15:5: ( ',' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:15:7: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T18

    // $ANTLR start T19
    public final void mT19() throws RecognitionException {
        try {
            int _type = T19;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:16:5: ( '[' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:16:7: '['
            {
            match('['); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T19

    // $ANTLR start T20
    public final void mT20() throws RecognitionException {
        try {
            int _type = T20;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:17:5: ( ']' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:17:7: ']'
            {
            match(']'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T20

    // $ANTLR start T21
    public final void mT21() throws RecognitionException {
        try {
            int _type = T21;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:18:5: ( 'ordered' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:18:7: 'ordered'
            {
            match("ordered"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T21

    // $ANTLR start T22
    public final void mT22() throws RecognitionException {
        try {
            int _type = T22;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:19:5: ( 'nonUnique' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:19:7: 'nonUnique'
            {
            match("nonUnique"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T22

    // $ANTLR start T23
    public final void mT23() throws RecognitionException {
        try {
            int _type = T23;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:20:5: ( 'sequence' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:20:7: 'sequence'
            {
            match("sequence"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T23

    // $ANTLR start T24
    public final void mT24() throws RecognitionException {
        try {
            int _type = T24;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:21:5: ( '..' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:21:7: '..'
            {
            match(".."); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T24

    // $ANTLR start T25
    public final void mT25() throws RecognitionException {
        try {
            int _type = T25;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:22:5: ( '*' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:22:7: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T25

    // $ANTLR start T26
    public final void mT26() throws RecognitionException {
        try {
            int _type = T26;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:23:5: ( 'any' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:23:7: 'any'
            {
            match("any"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T26

    // $ANTLR start T27
    public final void mT27() throws RecognitionException {
        try {
            int _type = T27;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:24:5: ( 'redefines' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:24:7: 'redefines'
            {
            match("redefines"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T27

    // $ANTLR start T28
    public final void mT28() throws RecognitionException {
        try {
            int _type = T28;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:25:5: ( '++' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:25:7: '++'
            {
            match("++"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T28

    // $ANTLR start T29
    public final void mT29() throws RecognitionException {
        try {
            int _type = T29;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:26:5: ( '--' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:26:7: '--'
            {
            match("--"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T29

    // $ANTLR start T30
    public final void mT30() throws RecognitionException {
        try {
            int _type = T30;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:27:5: ( '::' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:27:7: '::'
            {
            match("::"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T30

    // $ANTLR start T31
    public final void mT31() throws RecognitionException {
        try {
            int _type = T31;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:28:5: ( '<' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:28:7: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T31

    // $ANTLR start T32
    public final void mT32() throws RecognitionException {
        try {
            int _type = T32;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:29:5: ( '>' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:29:7: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T32

    // $ANTLR start T33
    public final void mT33() throws RecognitionException {
        try {
            int _type = T33;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:30:5: ( '=>' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:30:7: '=>'
            {
            match("=>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T33

    // $ANTLR start T34
    public final void mT34() throws RecognitionException {
        try {
            int _type = T34;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:31:5: ( '?' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:31:7: '?'
            {
            match('?'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T34

    // $ANTLR start T35
    public final void mT35() throws RecognitionException {
        try {
            int _type = T35;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:32:5: ( '||' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:32:7: '||'
            {
            match("||"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T35

    // $ANTLR start T36
    public final void mT36() throws RecognitionException {
        try {
            int _type = T36;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:33:5: ( '&&' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:33:7: '&&'
            {
            match("&&"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T36

    // $ANTLR start T37
    public final void mT37() throws RecognitionException {
        try {
            int _type = T37;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:34:5: ( '|' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:34:7: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T37

    // $ANTLR start T38
    public final void mT38() throws RecognitionException {
        try {
            int _type = T38;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:35:5: ( '^' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:35:7: '^'
            {
            match('^'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T38

    // $ANTLR start T39
    public final void mT39() throws RecognitionException {
        try {
            int _type = T39;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:36:5: ( '&' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:36:7: '&'
            {
            match('&'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T39

    // $ANTLR start T40
    public final void mT40() throws RecognitionException {
        try {
            int _type = T40;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:37:5: ( '==' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:37:7: '=='
            {
            match("=="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T40

    // $ANTLR start T41
    public final void mT41() throws RecognitionException {
        try {
            int _type = T41;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:38:5: ( '!=' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:38:7: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T41

    // $ANTLR start T42
    public final void mT42() throws RecognitionException {
        try {
            int _type = T42;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:39:5: ( 'instanceof' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:39:7: 'instanceof'
            {
            match("instanceof"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T42

    // $ANTLR start T43
    public final void mT43() throws RecognitionException {
        try {
            int _type = T43;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:40:5: ( 'hastype' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:40:7: 'hastype'
            {
            match("hastype"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T43

    // $ANTLR start T44
    public final void mT44() throws RecognitionException {
        try {
            int _type = T44;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:41:5: ( '<=' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:41:7: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T44

    // $ANTLR start T45
    public final void mT45() throws RecognitionException {
        try {
            int _type = T45;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:42:5: ( '>=' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:42:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T45

    // $ANTLR start T46
    public final void mT46() throws RecognitionException {
        try {
            int _type = T46;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:43:5: ( '<<' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:43:7: '<<'
            {
            match("<<"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T46

    // $ANTLR start T47
    public final void mT47() throws RecognitionException {
        try {
            int _type = T47;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:44:5: ( '>>' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:44:7: '>>'
            {
            match(">>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T47

    // $ANTLR start T48
    public final void mT48() throws RecognitionException {
        try {
            int _type = T48;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:45:5: ( '>>>' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:45:7: '>>>'
            {
            match(">>>"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T48

    // $ANTLR start T49
    public final void mT49() throws RecognitionException {
        try {
            int _type = T49;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:46:5: ( '+' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:46:7: '+'
            {
            match('+'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T49

    // $ANTLR start T50
    public final void mT50() throws RecognitionException {
        try {
            int _type = T50;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:47:5: ( '-' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:47:7: '-'
            {
            match('-'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T50

    // $ANTLR start T51
    public final void mT51() throws RecognitionException {
        try {
            int _type = T51;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:48:5: ( '/' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:48:7: '/'
            {
            match('/'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T51

    // $ANTLR start T52
    public final void mT52() throws RecognitionException {
        try {
            int _type = T52;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:49:5: ( '%' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:49:7: '%'
            {
            match('%'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T52

    // $ANTLR start T53
    public final void mT53() throws RecognitionException {
        try {
            int _type = T53;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:50:5: ( '!' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:50:7: '!'
            {
            match('!'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T53

    // $ANTLR start T54
    public final void mT54() throws RecognitionException {
        try {
            int _type = T54;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:51:5: ( '$' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:51:7: '$'
            {
            match('$'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T54

    // $ANTLR start T55
    public final void mT55() throws RecognitionException {
        try {
            int _type = T55;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:52:5: ( '~' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:52:7: '~'
            {
            match('~'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T55

    // $ANTLR start T56
    public final void mT56() throws RecognitionException {
        try {
            int _type = T56;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:53:5: ( '.' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:53:7: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T56

    // $ANTLR start T57
    public final void mT57() throws RecognitionException {
        try {
            int _type = T57;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:54:5: ( '->' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:54:7: '->'
            {
            match("->"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T57

    // $ANTLR start T58
    public final void mT58() throws RecognitionException {
        try {
            int _type = T58;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:55:5: ( 'reduce' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:55:7: 'reduce'
            {
            match("reduce"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T58

    // $ANTLR start T59
    public final void mT59() throws RecognitionException {
        try {
            int _type = T59;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:56:5: ( '=' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:56:7: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T59

    // $ANTLR start T60
    public final void mT60() throws RecognitionException {
        try {
            int _type = T60;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:57:5: ( 'isUnique' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:57:7: 'isUnique'
            {
            match("isUnique"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T60

    // $ANTLR start T61
    public final void mT61() throws RecognitionException {
        try {
            int _type = T61;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:58:5: ( 'null' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:58:7: 'null'
            {
            match("null"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T61

    // $ANTLR start T62
    public final void mT62() throws RecognitionException {
        try {
            int _type = T62;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:59:5: ( 'this' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:59:7: 'this'
            {
            match("this"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T62

    // $ANTLR start T63
    public final void mT63() throws RecognitionException {
        try {
            int _type = T63;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:60:5: ( 'super' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:60:7: 'super'
            {
            match("super"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T63

    // $ANTLR start T64
    public final void mT64() throws RecognitionException {
        try {
            int _type = T64;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:61:5: ( 'new' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:61:7: 'new'
            {
            match("new"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T64

    // $ANTLR start T65
    public final void mT65() throws RecognitionException {
        try {
            int _type = T65;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:62:5: ( '{' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:62:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T65

    // $ANTLR start T66
    public final void mT66() throws RecognitionException {
        try {
            int _type = T66;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:63:5: ( '}' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:63:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T66

    // $ANTLR start T67
    public final void mT67() throws RecognitionException {
        try {
            int _type = T67;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:64:5: ( '/*@' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:64:7: '/*@'
            {
            match("/*@"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T67

    // $ANTLR start T68
    public final void mT68() throws RecognitionException {
        try {
            int _type = T68;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:65:5: ( 'inline' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:65:7: 'inline'
            {
            match("inline"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T68

    // $ANTLR start T69
    public final void mT69() throws RecognitionException {
        try {
            int _type = T69;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:66:5: ( '*/' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:66:7: '*/'
            {
            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T69

    // $ANTLR start T70
    public final void mT70() throws RecognitionException {
        try {
            int _type = T70;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:67:5: ( '//@' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:67:7: '//@'
            {
            match("//@"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T70

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:68:5: ( 'let' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:68:7: 'let'
            {
            match("let"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:69:5: ( 'if' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:69:7: 'if'
            {
            match("if"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:70:5: ( 'else' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:70:7: 'else'
            {
            match("else"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:71:5: ( 'or' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:71:7: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:72:5: ( 'switch' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:72:7: 'switch'
            {
            match("switch"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:73:5: ( 'case' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:73:7: 'case'
            {
            match("case"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:74:5: ( 'default' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:74:7: 'default'
            {
            match("default"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:75:5: ( 'while' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:75:7: 'while'
            {
            match("while"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:76:5: ( 'do' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:76:7: 'do'
            {
            match("do"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:77:5: ( 'for' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:77:7: 'for'
            {
            match("for"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:78:5: ( 'in' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:78:7: 'in'
            {
            match("in"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:79:5: ( 'break' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:79:7: 'break'
            {
            match("break"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:80:5: ( 'return' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:80:7: 'return'
            {
            match("return"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:81:5: ( 'accept' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:81:7: 'accept'
            {
            match("accept"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:82:5: ( 'classify' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:82:7: 'classify'
            {
            match("classify"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:83:5: ( 'from' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:83:7: 'from'
            {
            match("from"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:84:5: ( 'to' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:84:7: 'to'
            {
            match("to"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:85:5: ( 'out' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:85:7: 'out'
            {
            match("out"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start T89
    public final void mT89() throws RecognitionException {
        try {
            int _type = T89;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:86:5: ( 'inout' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:86:7: 'inout'
            {
            match("inout"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T89

    // $ANTLR start T90
    public final void mT90() throws RecognitionException {
        try {
            int _type = T90;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:87:5: ( 'true' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:87:7: 'true'
            {
            match("true"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T90

    // $ANTLR start T91
    public final void mT91() throws RecognitionException {
        try {
            int _type = T91;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:88:5: ( 'false' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:88:7: 'false'
            {
            match("false"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T91

    // $ANTLR start T92
    public final void mT92() throws RecognitionException {
        try {
            int _type = T92;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:89:5: ( 'createLink' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:89:7: 'createLink'
            {
            match("createLink"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T92

    // $ANTLR start T93
    public final void mT93() throws RecognitionException {
        try {
            int _type = T93;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:90:5: ( 'destroyLink' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:90:7: 'destroyLink'
            {
            match("destroyLink"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T93

    // $ANTLR start T94
    public final void mT94() throws RecognitionException {
        try {
            int _type = T94;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:91:5: ( 'clearAssoc' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:91:7: 'clearAssoc'
            {
            match("clearAssoc"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T94

    // $ANTLR start T95
    public final void mT95() throws RecognitionException {
        try {
            int _type = T95;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:92:5: ( 'destroy' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:92:7: 'destroy'
            {
            match("destroy"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T95

    // $ANTLR start T96
    public final void mT96() throws RecognitionException {
        try {
            int _type = T96;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:93:5: ( 'select' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:93:7: 'select'
            {
            match("select"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T96

    // $ANTLR start T97
    public final void mT97() throws RecognitionException {
        try {
            int _type = T97;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:94:5: ( 'reject' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:94:7: 'reject'
            {
            match("reject"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T97

    // $ANTLR start T98
    public final void mT98() throws RecognitionException {
        try {
            int _type = T98;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:95:5: ( 'collect' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:95:7: 'collect'
            {
            match("collect"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T98

    // $ANTLR start T99
    public final void mT99() throws RecognitionException {
        try {
            int _type = T99;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:96:5: ( 'iterate' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:96:7: 'iterate'
            {
            match("iterate"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T99

    // $ANTLR start T100
    public final void mT100() throws RecognitionException {
        try {
            int _type = T100;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:97:6: ( 'forAll' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:97:8: 'forAll'
            {
            match("forAll"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T100

    // $ANTLR start T101
    public final void mT101() throws RecognitionException {
        try {
            int _type = T101;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:98:6: ( 'exists' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:98:8: 'exists'
            {
            match("exists"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T101

    // $ANTLR start T102
    public final void mT102() throws RecognitionException {
        try {
            int _type = T102;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:99:6: ( 'one' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:99:8: 'one'
            {
            match("one"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T102

    // $ANTLR start T103
    public final void mT103() throws RecognitionException {
        try {
            int _type = T103;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:100:6: ( 'isolated' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:100:8: 'isolated'
            {
            match("isolated"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T103

    // $ANTLR start T104
    public final void mT104() throws RecognitionException {
        try {
            int _type = T104;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:101:6: ( 'determined' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:101:8: 'determined'
            {
            match("determined"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T104

    // $ANTLR start T105
    public final void mT105() throws RecognitionException {
        try {
            int _type = T105;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:102:6: ( 'assured' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:102:8: 'assured'
            {
            match("assured"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T105

    // $ANTLR start T106
    public final void mT106() throws RecognitionException {
        try {
            int _type = T106;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:103:6: ( 'parallel' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:103:8: 'parallel'
            {
            match("parallel"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T106

    // $ANTLR start T107
    public final void mT107() throws RecognitionException {
        try {
            int _type = T107;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:104:6: ( '+=' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:104:8: '+='
            {
            match("+="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T107

    // $ANTLR start T108
    public final void mT108() throws RecognitionException {
        try {
            int _type = T108;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:105:6: ( '-=' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:105:8: '-='
            {
            match("-="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T108

    // $ANTLR start T109
    public final void mT109() throws RecognitionException {
        try {
            int _type = T109;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:106:6: ( '*=' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:106:8: '*='
            {
            match("*="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T109

    // $ANTLR start T110
    public final void mT110() throws RecognitionException {
        try {
            int _type = T110;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:107:6: ( '%=' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:107:8: '%='
            {
            match("%="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T110

    // $ANTLR start T111
    public final void mT111() throws RecognitionException {
        try {
            int _type = T111;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:108:6: ( '/=' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:108:8: '/='
            {
            match("/="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T111

    // $ANTLR start T112
    public final void mT112() throws RecognitionException {
        try {
            int _type = T112;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:109:6: ( '&=' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:109:8: '&='
            {
            match("&="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T112

    // $ANTLR start T113
    public final void mT113() throws RecognitionException {
        try {
            int _type = T113;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:110:6: ( '|=' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:110:8: '|='
            {
            match("|="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T113

    // $ANTLR start T114
    public final void mT114() throws RecognitionException {
        try {
            int _type = T114;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:111:6: ( '^=' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:111:8: '^='
            {
            match("^="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T114

    // $ANTLR start T115
    public final void mT115() throws RecognitionException {
        try {
            int _type = T115;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:112:6: ( '<<=' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:112:8: '<<='
            {
            match("<<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T115

    // $ANTLR start T116
    public final void mT116() throws RecognitionException {
        try {
            int _type = T116;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:113:6: ( '>>=' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:113:8: '>>='
            {
            match(">>="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T116

    // $ANTLR start T117
    public final void mT117() throws RecognitionException {
        try {
            int _type = T117;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:114:6: ( '>>>=' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:114:8: '>>>='
            {
            match(">>>="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T117

    // $ANTLR start RULE_INTEGERVALUE
    public final void mRULE_INTEGERVALUE() throws RecognitionException {
        try {
            int _type = RULE_INTEGERVALUE;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:19: ( ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* ) )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:21: ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* )
            {
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:21: ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* )
            int alt13=4;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='0') ) {
                switch ( input.LA(2) ) {
                case 'B':
                case 'b':
                    {
                    alt13=2;
                    }
                    break;
                case 'X':
                case 'x':
                    {
                    alt13=3;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '_':
                    {
                    alt13=4;
                    }
                    break;
                default:
                    alt13=1;}

            }
            else if ( ((LA13_0>='1' && LA13_0<='9')) ) {
                alt13=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("10050:21: ( ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* ) | ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )* | ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )* | '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )* )", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:22: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
                    {
                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:22: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='0') ) {
                        alt3=1;
                    }
                    else if ( ((LA3_0>='1' && LA3_0<='9')) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("10050:22: ( '0' | '1' .. '9' ( ( '_' )? '0' .. '9' )* )", 3, 0, input);

                        throw nvae;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:23: '0'
                            {
                            match('0'); 

                            }
                            break;
                        case 2 :
                            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:27: '1' .. '9' ( ( '_' )? '0' .. '9' )*
                            {
                            matchRange('1','9'); 
                            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:36: ( ( '_' )? '0' .. '9' )*
                            loop2:
                            do {
                                int alt2=2;
                                int LA2_0 = input.LA(1);

                                if ( ((LA2_0>='0' && LA2_0<='9')||LA2_0=='_') ) {
                                    alt2=1;
                                }


                                switch (alt2) {
                            	case 1 :
                            	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:37: ( '_' )? '0' .. '9'
                            	    {
                            	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:37: ( '_' )?
                            	    int alt1=2;
                            	    int LA1_0 = input.LA(1);

                            	    if ( (LA1_0=='_') ) {
                            	        alt1=1;
                            	    }
                            	    switch (alt1) {
                            	        case 1 :
                            	            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:37: '_'
                            	            {
                            	            match('_'); 

                            	            }
                            	            break;

                            	    }

                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    break loop2;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:54: ( '0b' | '0B' ) '0' .. '1' ( ( '_' )? '0' .. '1' )*
                    {
                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:54: ( '0b' | '0B' )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='0') ) {
                        int LA4_1 = input.LA(2);

                        if ( (LA4_1=='B') ) {
                            alt4=2;
                        }
                        else if ( (LA4_1=='b') ) {
                            alt4=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("10050:54: ( '0b' | '0B' )", 4, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("10050:54: ( '0b' | '0B' )", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:55: '0b'
                            {
                            match("0b"); 


                            }
                            break;
                        case 2 :
                            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:60: '0B'
                            {
                            match("0B"); 


                            }
                            break;

                    }

                    matchRange('0','1'); 
                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:75: ( ( '_' )? '0' .. '1' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='1')||LA6_0=='_') ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:76: ( '_' )? '0' .. '1'
                    	    {
                    	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:76: ( '_' )?
                    	    int alt5=2;
                    	    int LA5_0 = input.LA(1);

                    	    if ( (LA5_0=='_') ) {
                    	        alt5=1;
                    	    }
                    	    switch (alt5) {
                    	        case 1 :
                    	            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:76: '_'
                    	            {
                    	            match('_'); 

                    	            }
                    	            break;

                    	    }

                    	    matchRange('0','1'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:92: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )*
                    {
                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:92: ( '0x' | '0X' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='0') ) {
                        int LA7_1 = input.LA(2);

                        if ( (LA7_1=='x') ) {
                            alt7=1;
                        }
                        else if ( (LA7_1=='X') ) {
                            alt7=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("10050:92: ( '0x' | '0X' )", 7, 1, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("10050:92: ( '0x' | '0X' )", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:93: '0x'
                            {
                            match("0x"); 


                            }
                            break;
                        case 2 :
                            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:98: '0X'
                            {
                            match("0X"); 


                            }
                            break;

                    }

                    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:133: ( ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='F')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='f')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:134: ( '_' )? ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
                    	    {
                    	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:134: ( '_' )?
                    	    int alt8=2;
                    	    int LA8_0 = input.LA(1);

                    	    if ( (LA8_0=='_') ) {
                    	        alt8=1;
                    	    }
                    	    switch (alt8) {
                    	        case 1 :
                    	            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:134: '_'
                    	            {
                    	            match('_'); 

                    	            }
                    	            break;

                    	    }

                    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:170: '0' ( '_' )? '0' .. '7' ( ( '_' )? '0' .. '7' )*
                    {
                    match('0'); 
                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:174: ( '_' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='_') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:174: '_'
                            {
                            match('_'); 

                            }
                            break;

                    }

                    matchRange('0','7'); 
                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:188: ( ( '_' )? '0' .. '7' )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( ((LA12_0>='0' && LA12_0<='7')||LA12_0=='_') ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:189: ( '_' )? '0' .. '7'
                    	    {
                    	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:189: ( '_' )?
                    	    int alt11=2;
                    	    int LA11_0 = input.LA(1);

                    	    if ( (LA11_0=='_') ) {
                    	        alt11=1;
                    	    }
                    	    switch (alt11) {
                    	        case 1 :
                    	            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10050:189: '_'
                    	            {
                    	            match('_'); 

                    	            }
                    	            break;

                    	    }

                    	    matchRange('0','7'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INTEGERVALUE

    // $ANTLR start RULE_IMPORT_ID
    public final void mRULE_IMPORT_ID() throws RecognitionException {
        try {
            int _type = RULE_IMPORT_ID;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10052:16: ( 'import' RULE_WS ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )* )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10052:18: 'import' RULE_WS ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* ( '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )*
            {
            match("import"); 

            mRULE_WS(); 
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10052:59: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10052:93: ( '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='.') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10052:94: '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            	    {
            	    match('.'); 
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }

            	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10052:122: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse =
            	    	            new MismatchedSetException(null,input);
            	    	        recover(mse);    throw mse;
            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_IMPORT_ID

    // $ANTLR start RULE_ID
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10054:9: ( ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\"' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\"' )* | '\\'' ( options {greedy=false; } : . )* '\\'' ) )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10054:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\"' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\"' )* | '\\'' ( options {greedy=false; } : . )* '\\'' )
            {
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10054:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\"' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\"' )* | '\\'' ( options {greedy=false; } : . )* '\\'' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\"'||(LA19_0>='A' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {
                alt19=1;
            }
            else if ( (LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("10054:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\"' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\"' )* | '\\'' ( options {greedy=false; } : . )* '\\'' )", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10054:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '\"' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\"' )*
                    {
                    if ( input.LA(1)=='\"'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse =
                            new MismatchedSetException(null,input);
                        recover(mse);    throw mse;
                    }

                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10054:40: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '\"' )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\"'||(LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='Z')||LA17_0=='_'||(LA17_0>='a' && LA17_0<='z')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:
                    	    {
                    	    if ( input.LA(1)=='\"'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10054:78: '\\'' ( options {greedy=false; } : . )* '\\''
                    {
                    match('\''); 
                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10054:83: ( options {greedy=false; } : . )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\'') ) {
                            alt18=2;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='\uFFFE')) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10054:111: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ID

    // $ANTLR start RULE_STRING
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10056:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10056:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10056:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='\\') ) {
                    alt20=1;
                }
                else if ( ((LA20_0>='\u0000' && LA20_0<='!')||(LA20_0>='#' && LA20_0<='[')||(LA20_0>=']' && LA20_0<='\uFFFE')) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10056:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10056:61: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            match('\"'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_STRING

    // $ANTLR start RULE_ML_COMMENT
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10058:17: ( '/*' (~ ( '@' ) )* '*/' )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10058:19: '/*' (~ ( '@' ) )* '*/'
            {
            match("/*"); 

            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10058:24: (~ ( '@' ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='*') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='/') ) {
                        int LA21_3 = input.LA(3);

                        if ( ((LA21_3>='\u0000' && LA21_3<='?')||(LA21_3>='A' && LA21_3<='\uFFFE')) ) {
                            alt21=1;
                        }


                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='.')||(LA21_1>='0' && LA21_1<='?')||(LA21_1>='A' && LA21_1<='\uFFFE')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<=')')||(LA21_0>='+' && LA21_0<='?')||(LA21_0>='A' && LA21_0<='\uFFFE')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10058:24: ~ ( '@' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            match("*/"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ML_COMMENT

    // $ANTLR start RULE_SL_COMMENT
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10060:17: ( '//' (~ ( ( '\\n' | '\\r' | '@' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10060:19: '//' (~ ( ( '\\n' | '\\r' | '@' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10060:24: (~ ( ( '\\n' | '\\r' | '@' ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='?')||(LA22_0>='A' && LA22_0<='\uFFFE')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10060:24: ~ ( ( '\\n' | '\\r' | '@' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='?')||(input.LA(1)>='A' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10060:44: ( ( '\\r' )? '\\n' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\n'||LA24_0=='\r') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10060:45: ( '\\r' )? '\\n'
                    {
                    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10060:45: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10060:45: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_SL_COMMENT

    // $ANTLR start RULE_WS
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10062:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10062:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10062:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_WS

    // $ANTLR start RULE_INT
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10064:10: ( ( '0' .. '9' )+ )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10064:12: ( '0' .. '9' )+
            {
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10064:12: ( '0' .. '9' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='0' && LA26_0<='9')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10064:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_INT

    // $ANTLR start RULE_ANY_OTHER
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10066:16: ( . )
            // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:10066:18: .
            {
            matchAny(); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RULE_ANY_OTHER

    public void mTokens() throws RecognitionException {
        // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:8: ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | T112 | T113 | T114 | T115 | T116 | T117 | RULE_INTEGERVALUE | RULE_IMPORT_ID | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_INT | RULE_ANY_OTHER )
        int alt27=114;
        alt27 = dfa27.predict(input);
        switch (alt27) {
            case 1 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:10: T13
                {
                mT13(); 

                }
                break;
            case 2 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:14: T14
                {
                mT14(); 

                }
                break;
            case 3 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:18: T15
                {
                mT15(); 

                }
                break;
            case 4 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:22: T16
                {
                mT16(); 

                }
                break;
            case 5 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:26: T17
                {
                mT17(); 

                }
                break;
            case 6 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:30: T18
                {
                mT18(); 

                }
                break;
            case 7 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:34: T19
                {
                mT19(); 

                }
                break;
            case 8 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:38: T20
                {
                mT20(); 

                }
                break;
            case 9 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:42: T21
                {
                mT21(); 

                }
                break;
            case 10 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:46: T22
                {
                mT22(); 

                }
                break;
            case 11 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:50: T23
                {
                mT23(); 

                }
                break;
            case 12 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:54: T24
                {
                mT24(); 

                }
                break;
            case 13 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:58: T25
                {
                mT25(); 

                }
                break;
            case 14 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:62: T26
                {
                mT26(); 

                }
                break;
            case 15 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:66: T27
                {
                mT27(); 

                }
                break;
            case 16 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:70: T28
                {
                mT28(); 

                }
                break;
            case 17 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:74: T29
                {
                mT29(); 

                }
                break;
            case 18 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:78: T30
                {
                mT30(); 

                }
                break;
            case 19 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:82: T31
                {
                mT31(); 

                }
                break;
            case 20 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:86: T32
                {
                mT32(); 

                }
                break;
            case 21 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:90: T33
                {
                mT33(); 

                }
                break;
            case 22 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:94: T34
                {
                mT34(); 

                }
                break;
            case 23 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:98: T35
                {
                mT35(); 

                }
                break;
            case 24 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:102: T36
                {
                mT36(); 

                }
                break;
            case 25 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:106: T37
                {
                mT37(); 

                }
                break;
            case 26 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:110: T38
                {
                mT38(); 

                }
                break;
            case 27 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:114: T39
                {
                mT39(); 

                }
                break;
            case 28 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:118: T40
                {
                mT40(); 

                }
                break;
            case 29 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:122: T41
                {
                mT41(); 

                }
                break;
            case 30 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:126: T42
                {
                mT42(); 

                }
                break;
            case 31 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:130: T43
                {
                mT43(); 

                }
                break;
            case 32 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:134: T44
                {
                mT44(); 

                }
                break;
            case 33 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:138: T45
                {
                mT45(); 

                }
                break;
            case 34 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:142: T46
                {
                mT46(); 

                }
                break;
            case 35 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:146: T47
                {
                mT47(); 

                }
                break;
            case 36 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:150: T48
                {
                mT48(); 

                }
                break;
            case 37 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:154: T49
                {
                mT49(); 

                }
                break;
            case 38 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:158: T50
                {
                mT50(); 

                }
                break;
            case 39 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:162: T51
                {
                mT51(); 

                }
                break;
            case 40 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:166: T52
                {
                mT52(); 

                }
                break;
            case 41 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:170: T53
                {
                mT53(); 

                }
                break;
            case 42 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:174: T54
                {
                mT54(); 

                }
                break;
            case 43 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:178: T55
                {
                mT55(); 

                }
                break;
            case 44 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:182: T56
                {
                mT56(); 

                }
                break;
            case 45 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:186: T57
                {
                mT57(); 

                }
                break;
            case 46 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:190: T58
                {
                mT58(); 

                }
                break;
            case 47 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:194: T59
                {
                mT59(); 

                }
                break;
            case 48 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:198: T60
                {
                mT60(); 

                }
                break;
            case 49 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:202: T61
                {
                mT61(); 

                }
                break;
            case 50 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:206: T62
                {
                mT62(); 

                }
                break;
            case 51 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:210: T63
                {
                mT63(); 

                }
                break;
            case 52 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:214: T64
                {
                mT64(); 

                }
                break;
            case 53 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:218: T65
                {
                mT65(); 

                }
                break;
            case 54 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:222: T66
                {
                mT66(); 

                }
                break;
            case 55 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:226: T67
                {
                mT67(); 

                }
                break;
            case 56 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:230: T68
                {
                mT68(); 

                }
                break;
            case 57 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:234: T69
                {
                mT69(); 

                }
                break;
            case 58 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:238: T70
                {
                mT70(); 

                }
                break;
            case 59 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:242: T71
                {
                mT71(); 

                }
                break;
            case 60 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:246: T72
                {
                mT72(); 

                }
                break;
            case 61 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:250: T73
                {
                mT73(); 

                }
                break;
            case 62 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:254: T74
                {
                mT74(); 

                }
                break;
            case 63 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:258: T75
                {
                mT75(); 

                }
                break;
            case 64 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:262: T76
                {
                mT76(); 

                }
                break;
            case 65 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:266: T77
                {
                mT77(); 

                }
                break;
            case 66 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:270: T78
                {
                mT78(); 

                }
                break;
            case 67 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:274: T79
                {
                mT79(); 

                }
                break;
            case 68 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:278: T80
                {
                mT80(); 

                }
                break;
            case 69 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:282: T81
                {
                mT81(); 

                }
                break;
            case 70 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:286: T82
                {
                mT82(); 

                }
                break;
            case 71 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:290: T83
                {
                mT83(); 

                }
                break;
            case 72 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:294: T84
                {
                mT84(); 

                }
                break;
            case 73 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:298: T85
                {
                mT85(); 

                }
                break;
            case 74 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:302: T86
                {
                mT86(); 

                }
                break;
            case 75 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:306: T87
                {
                mT87(); 

                }
                break;
            case 76 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:310: T88
                {
                mT88(); 

                }
                break;
            case 77 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:314: T89
                {
                mT89(); 

                }
                break;
            case 78 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:318: T90
                {
                mT90(); 

                }
                break;
            case 79 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:322: T91
                {
                mT91(); 

                }
                break;
            case 80 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:326: T92
                {
                mT92(); 

                }
                break;
            case 81 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:330: T93
                {
                mT93(); 

                }
                break;
            case 82 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:334: T94
                {
                mT94(); 

                }
                break;
            case 83 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:338: T95
                {
                mT95(); 

                }
                break;
            case 84 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:342: T96
                {
                mT96(); 

                }
                break;
            case 85 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:346: T97
                {
                mT97(); 

                }
                break;
            case 86 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:350: T98
                {
                mT98(); 

                }
                break;
            case 87 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:354: T99
                {
                mT99(); 

                }
                break;
            case 88 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:358: T100
                {
                mT100(); 

                }
                break;
            case 89 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:363: T101
                {
                mT101(); 

                }
                break;
            case 90 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:368: T102
                {
                mT102(); 

                }
                break;
            case 91 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:373: T103
                {
                mT103(); 

                }
                break;
            case 92 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:378: T104
                {
                mT104(); 

                }
                break;
            case 93 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:383: T105
                {
                mT105(); 

                }
                break;
            case 94 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:388: T106
                {
                mT106(); 

                }
                break;
            case 95 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:393: T107
                {
                mT107(); 

                }
                break;
            case 96 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:398: T108
                {
                mT108(); 

                }
                break;
            case 97 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:403: T109
                {
                mT109(); 

                }
                break;
            case 98 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:408: T110
                {
                mT110(); 

                }
                break;
            case 99 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:413: T111
                {
                mT111(); 

                }
                break;
            case 100 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:418: T112
                {
                mT112(); 

                }
                break;
            case 101 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:423: T113
                {
                mT113(); 

                }
                break;
            case 102 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:428: T114
                {
                mT114(); 

                }
                break;
            case 103 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:433: T115
                {
                mT115(); 

                }
                break;
            case 104 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:438: T116
                {
                mT116(); 

                }
                break;
            case 105 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:443: T117
                {
                mT117(); 

                }
                break;
            case 106 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:448: RULE_INTEGERVALUE
                {
                mRULE_INTEGERVALUE(); 

                }
                break;
            case 107 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:466: RULE_IMPORT_ID
                {
                mRULE_IMPORT_ID(); 

                }
                break;
            case 108 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:481: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 109 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:489: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 110 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:501: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 111 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:517: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 112 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:533: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 113 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:541: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 114 :
                // ../org.xtext.alf/src-gen/org/xtext/alf/parser/antlr/internal/InternalAlf.g:1:550: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA27_eotS =
        "\2\uffff\1\65\1\67\5\uffff\3\65\1\107\1\112\1\65\1\116\1\122\1\125"+
        "\1\130\1\133\1\uffff\1\137\1\142\1\144\1\146\2\65\1\160\1\162\2"+
        "\uffff\1\65\2\uffff\10\65\2\u0089\1\65\1\60\4\uffff\3\65\10\uffff"+
        "\1\u0096\10\65\5\uffff\1\65\7\uffff\1\u00a4\2\uffff\1\u00a7\20\uffff"+
        "\2\65\1\u00ae\1\u00af\2\65\2\uffff\1\u00b5\5\uffff\2\65\1\u00b8"+
        "\2\uffff\10\65\1\u00c4\6\65\1\uffff\1\u0089\1\uffff\1\u0089\1\uffff"+
        "\1\65\2\uffff\1\65\1\u00cd\3\65\1\uffff\1\u00d1\1\u00d2\2\65\1\u00d5"+
        "\7\65\3\uffff\1\u00df\1\uffff\6\65\2\uffff\2\65\4\uffff\2\65\1\uffff"+
        "\1\u00ea\12\65\1\uffff\3\65\1\u00f9\2\65\1\u0089\1\65\1\uffff\3"+
        "\65\2\uffff\1\65\1\u0101\1\uffff\10\65\2\uffff\10\65\1\u0112\1\u0113"+
        "\1\uffff\1\u0114\1\65\1\u0116\11\65\1\u0120\1\65\1\uffff\7\65\1"+
        "\uffff\2\65\1\u012b\12\65\1\u0136\2\65\3\uffff\1\65\1\uffff\7\65"+
        "\1\u0141\1\u0142\1\uffff\1\65\1\u0144\2\65\1\u0147\3\65\1\u014b"+
        "\1\65\1\uffff\1\u014d\1\65\1\u014f\1\u0150\1\u0151\3\65\1\u0155"+
        "\1\65\1\uffff\2\65\1\u0159\7\65\2\uffff\1\u0161\1\uffff\1\65\1\u0163"+
        "\1\uffff\1\65\1\u0165\1\65\1\uffff\1\65\1\uffff\1\65\4\uffff\2\65"+
        "\1\uffff\1\65\1\u016c\1\u016d\1\uffff\2\65\1\u0170\2\65\1\u0174"+
        "\1\u0175\1\uffff\1\65\1\uffff\1\u0177\1\uffff\1\65\1\u0179\1\65"+
        "\1\u017b\1\u017c\1\65\2\uffff\1\u017e\1\65\1\uffff\3\65\2\uffff"+
        "\1\u0183\1\uffff\1\u0184\1\uffff\1\u0185\2\uffff\1\65\1\uffff\4"+
        "\65\3\uffff\1\u018b\1\u018c\1\u018d\1\u018e\1\65\4\uffff\1\u0190"+
        "\1\uffff";
    static final String DFA27_eofS =
        "\u0191\uffff";
    static final String DFA27_minS =
        "\1\0\1\uffff\1\143\1\72\5\uffff\1\156\2\145\1\56\1\57\1\145\1\53"+
        "\1\55\1\74\2\75\1\uffff\1\75\1\46\2\75\1\146\1\141\1\52\1\75\2\uffff"+
        "\1\150\2\uffff\1\145\1\154\1\141\1\145\1\150\1\141\1\162\1\141\2"+
        "\60\2\0\4\uffff\1\163\1\171\1\143\10\uffff\1\42\1\164\1\145\1\156"+
        "\1\154\1\167\1\154\1\160\1\151\5\uffff\1\144\7\uffff\1\75\2\uffff"+
        "\1\75\20\uffff\1\160\1\125\2\42\1\145\1\163\1\uffff\1\0\1\100\5"+
        "\uffff\1\151\1\165\1\42\2\uffff\1\164\1\163\1\151\1\163\1\141\1"+
        "\154\1\145\1\146\1\42\1\151\1\154\1\157\1\162\1\145\1\162\1\uffff"+
        "\1\60\1\uffff\1\60\1\uffff\1\0\2\uffff\1\165\1\42\1\145\1\151\1"+
        "\145\1\uffff\2\42\1\125\1\154\1\42\1\145\1\165\1\145\1\164\1\145"+
        "\1\165\1\145\3\uffff\1\75\1\uffff\1\157\1\156\1\154\1\151\1\164"+
        "\1\165\2\uffff\1\162\1\164\4\uffff\1\163\1\145\1\uffff\1\42\1\145"+
        "\1\163\1\145\1\163\1\141\1\154\1\141\1\145\1\164\1\141\1\uffff\1"+
        "\154\1\163\1\155\1\42\2\141\1\60\1\162\1\uffff\1\160\1\166\1\162"+
        "\2\uffff\1\156\1\42\1\uffff\1\143\1\145\1\162\1\143\1\146\1\143"+
        "\1\162\1\143\2\uffff\1\162\1\151\1\141\1\156\1\141\1\164\1\141\1"+
        "\171\2\42\1\uffff\1\42\1\164\1\42\1\163\1\162\1\145\1\164\2\162"+
        "\1\165\2\145\1\42\1\154\1\uffff\1\153\1\154\1\145\1\164\1\151\1"+
        "\145\1\151\1\uffff\1\164\1\156\1\42\1\150\1\151\1\145\1\156\2\164"+
        "\1\161\1\164\1\145\1\156\1\42\1\164\1\160\3\uffff\1\163\1\uffff"+
        "\1\151\1\101\1\143\1\145\1\155\1\157\1\154\2\42\1\uffff\1\154\1"+
        "\42\1\154\1\144\1\42\1\164\1\144\1\161\1\42\1\143\1\uffff\1\42\1"+
        "\156\3\42\1\11\1\165\1\145\1\42\1\143\1\uffff\2\145\1\42\1\146\1"+
        "\163\1\164\1\114\1\151\1\171\1\164\2\uffff\1\42\1\uffff\1\145\1"+
        "\42\1\uffff\1\171\1\42\1\165\1\uffff\1\145\1\uffff\1\145\4\uffff"+
        "\1\145\1\144\1\uffff\1\145\2\42\1\uffff\1\171\1\163\1\42\1\151\1"+
        "\156\2\42\1\uffff\1\154\1\uffff\1\42\1\uffff\1\145\1\42\1\163\2"+
        "\42\1\157\2\uffff\1\42\1\157\1\uffff\1\156\1\145\1\151\2\uffff\1"+
        "\42\1\uffff\1\42\1\uffff\1\42\2\uffff\1\146\1\uffff\1\143\1\153"+
        "\1\144\1\156\3\uffff\4\42\1\153\4\uffff\1\42\1\uffff";
    static final String DFA27_maxS =
        "\1\ufffe\1\uffff\1\163\1\72\5\uffff\2\165\1\167\1\56\1\75\1\145"+
        "\1\75\1\76\1\75\2\76\1\uffff\1\174\3\75\1\164\1\141\2\75\2\uffff"+
        "\1\162\2\uffff\1\145\1\170\1\162\1\157\1\150\2\162\1\141\2\71\2"+
        "\ufffe\4\uffff\1\163\1\171\1\164\10\uffff\1\172\1\164\1\145\1\156"+
        "\1\154\1\167\1\161\1\160\1\151\5\uffff\1\164\7\uffff\1\75\2\uffff"+
        "\1\76\20\uffff\1\160\1\157\2\172\1\145\1\163\1\uffff\1\ufffe\1\100"+
        "\5\uffff\1\151\1\165\1\172\2\uffff\1\164\1\163\1\151\1\163\1\145"+
        "\1\154\1\145\1\164\1\172\1\151\1\154\1\157\1\162\1\145\1\162\1\uffff"+
        "\1\71\1\uffff\1\71\1\uffff\1\ufffe\2\uffff\1\165\1\172\1\145\1\151"+
        "\1\145\1\uffff\2\172\1\125\1\154\1\172\1\145\1\165\1\145\1\164\2"+
        "\165\1\145\3\uffff\1\75\1\uffff\1\157\1\156\1\154\1\151\1\164\1"+
        "\165\2\uffff\1\162\1\164\4\uffff\1\163\1\145\1\uffff\1\172\1\145"+
        "\1\163\1\145\1\163\1\141\1\154\1\141\1\145\1\164\1\141\1\uffff\1"+
        "\154\1\163\1\155\1\172\2\141\1\71\1\162\1\uffff\1\160\1\166\1\162"+
        "\2\uffff\1\156\1\172\1\uffff\1\143\1\145\1\162\1\143\1\146\1\143"+
        "\1\162\1\143\2\uffff\1\162\1\151\1\141\1\156\1\141\1\164\1\141\1"+
        "\171\2\172\1\uffff\1\172\1\164\1\172\1\163\1\162\1\145\1\164\2\162"+
        "\1\165\2\145\1\172\1\154\1\uffff\1\153\1\154\1\145\1\164\1\151\1"+
        "\145\1\151\1\uffff\1\164\1\156\1\172\1\150\1\151\1\145\1\156\2\164"+
        "\1\161\1\164\1\145\1\156\1\172\1\164\1\160\3\uffff\1\163\1\uffff"+
        "\1\151\1\101\1\143\1\145\1\155\1\157\1\154\2\172\1\uffff\1\154\1"+
        "\172\1\154\1\144\1\172\1\164\1\144\1\161\1\172\1\143\1\uffff\1\172"+
        "\1\156\3\172\1\40\1\165\1\145\1\172\1\143\1\uffff\2\145\1\172\1"+
        "\146\1\163\1\164\1\114\1\151\1\171\1\164\2\uffff\1\172\1\uffff\1"+
        "\145\1\172\1\uffff\1\171\1\172\1\165\1\uffff\1\145\1\uffff\1\145"+
        "\4\uffff\1\145\1\144\1\uffff\1\145\2\172\1\uffff\1\171\1\163\1\172"+
        "\1\151\1\156\2\172\1\uffff\1\154\1\uffff\1\172\1\uffff\1\145\1\172"+
        "\1\163\2\172\1\157\2\uffff\1\172\1\157\1\uffff\1\156\1\145\1\151"+
        "\2\uffff\1\172\1\uffff\1\172\1\uffff\1\172\2\uffff\1\146\1\uffff"+
        "\1\143\1\153\1\144\1\156\3\uffff\4\172\1\153\4\uffff\1\172\1\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\2\uffff\1\4\1\5\1\6\1\7\1\10\13\uffff\1\26\10\uffff"+
        "\1\52\1\53\1\uffff\1\65\1\66\14\uffff\1\154\1\160\1\162\1\1\3\uffff"+
        "\1\154\1\22\1\3\1\4\1\5\1\6\1\7\1\10\11\uffff\1\14\1\54\1\141\1"+
        "\71\1\15\1\uffff\1\137\1\20\1\45\1\140\1\21\1\55\1\46\1\uffff\1"+
        "\40\1\23\1\uffff\1\41\1\24\1\34\1\25\1\57\1\26\1\145\1\27\1\31\1"+
        "\144\1\30\1\33\1\146\1\32\1\35\1\51\6\uffff\1\143\2\uffff\1\47\1"+
        "\142\1\50\1\52\1\53\3\uffff\1\65\1\66\17\uffff\1\152\1\uffff\1\161"+
        "\1\uffff\1\155\1\uffff\1\154\1\160\5\uffff\1\76\14\uffff\1\147\1"+
        "\42\1\150\1\uffff\1\43\6\uffff\1\105\1\74\2\uffff\1\67\1\156\1\72"+
        "\1\157\2\uffff\1\113\13\uffff\1\103\10\uffff\1\16\3\uffff\1\114"+
        "\1\132\2\uffff\1\64\10\uffff\1\151\1\44\12\uffff\1\73\16\uffff\1"+
        "\104\7\uffff\1\61\20\uffff\1\62\1\116\1\75\1\uffff\1\100\11\uffff"+
        "\1\112\12\uffff\1\63\12\uffff\1\115\12\uffff\1\102\1\117\1\uffff"+
        "\1\106\2\uffff\1\110\3\uffff\1\124\1\uffff\1\77\1\uffff\1\56\1\107"+
        "\1\125\1\153\2\uffff\1\70\3\uffff\1\131\7\uffff\1\130\1\uffff\1"+
        "\135\1\uffff\1\11\6\uffff\1\127\1\37\2\uffff\1\126\3\uffff\1\123"+
        "\1\101\1\uffff\1\2\1\uffff\1\13\1\uffff\1\60\1\133\1\uffff\1\111"+
        "\4\uffff\1\136\1\12\1\17\5\uffff\1\36\1\122\1\120\1\134\1\uffff"+
        "\1\121";
    static final String DFA27_specialS =
        "\u0191\uffff}>";
    static final String[] DFA27_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\30\1\54\1\60\1\35\1\34\1"+
            "\26\1\55\1\4\1\5\1\15\1\17\1\6\1\20\1\14\1\33\1\52\11\53\1\3"+
            "\1\1\1\21\1\23\1\22\1\24\1\60\32\56\1\7\1\60\1\10\1\27\1\56"+
            "\1\60\1\2\1\50\1\44\1\45\1\43\1\47\1\56\1\32\1\31\2\56\1\42"+
            "\1\56\1\12\1\11\1\51\1\56\1\16\1\13\1\37\2\56\1\46\3\56\1\40"+
            "\1\25\1\41\1\36\uff80\60",
            "",
            "\1\64\12\uffff\1\63\4\uffff\1\62",
            "\1\66",
            "",
            "",
            "",
            "",
            "",
            "\1\77\3\uffff\1\75\2\uffff\1\76",
            "\1\102\11\uffff\1\100\5\uffff\1\101",
            "\1\103\17\uffff\1\104\1\uffff\1\105",
            "\1\106",
            "\1\111\15\uffff\1\110",
            "\1\113",
            "\1\115\21\uffff\1\114",
            "\1\120\17\uffff\1\117\1\121",
            "\1\123\1\124",
            "\1\127\1\126",
            "\1\131\1\132",
            "",
            "\1\135\76\uffff\1\136",
            "\1\141\26\uffff\1\140",
            "\1\143",
            "\1\145",
            "\1\152\6\uffff\1\147\1\151\4\uffff\1\150\1\153",
            "\1\154",
            "\1\156\4\uffff\1\157\15\uffff\1\155",
            "\1\161",
            "",
            "",
            "\1\165\6\uffff\1\167\2\uffff\1\166",
            "",
            "",
            "\1\172",
            "\1\173\13\uffff\1\174",
            "\1\175\12\uffff\1\176\2\uffff\1\177\2\uffff\1\u0080",
            "\1\u0081\11\uffff\1\u0082",
            "\1\u0083",
            "\1\u0084\15\uffff\1\u0086\2\uffff\1\u0085",
            "\1\u0087",
            "\1\u0088",
            "\10\u008a\2\u008b",
            "\12\u008c",
            "\42\u008d\1\u008f\15\u008d\12\u008e\7\u008d\32\u008e\4\u008d"+
            "\1\u008e\1\u008d\32\u008e\uff84\u008d",
            "\uffff\65",
            "",
            "",
            "",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093\20\uffff\1\u0094",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\3\65"+
            "\1\u0095\26\65",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c\4\uffff\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a0\5\uffff\1\u00a2\11\uffff\1\u00a1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a3",
            "",
            "",
            "\1\u00a5\1\u00a6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a8",
            "\1\u00a9\31\uffff\1\u00aa",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\13\65"+
            "\1\u00ab\2\65\1\u00ad\3\65\1\u00ac\7\65",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "\100\u00b3\1\u00b2\uffbe\u00b3",
            "\1\u00b4",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b6",
            "\1\u00b7",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd\3\uffff\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c3\14\uffff\1\u00c2\1\u00c1",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "",
            "\10\u00cb\2\u008b",
            "",
            "\12\u008c",
            "",
            "\42\u008d\1\u008f\15\u008d\12\u008e\7\u008d\32\u008e\4\u008d"+
            "\1\u008e\1\u008d\32\u008e\uff84\u008d",
            "",
            "",
            "\1\u00cc",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00d3",
            "\1\u00d4",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da\17\uffff\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "",
            "",
            "\1\u00de",
            "",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "",
            "",
            "\1\u00e6",
            "\1\u00e7",
            "",
            "",
            "",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\65\15\uffff\12\65\7\uffff\1\u00f8\31\65\4\uffff\1\65\1\uffff"+
            "\32\65",
            "\1\u00fa",
            "\1\u00fb",
            "\10\u00cb\2\u008b",
            "\1\u00fc",
            "",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "",
            "",
            "\1\u0100",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "",
            "",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0115",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\u011f",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0121",
            "",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128",
            "",
            "\1\u0129",
            "\1\u012a",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0137",
            "\1\u0138",
            "",
            "",
            "",
            "\1\u0139",
            "",
            "\1\u013a",
            "\1\u013b",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\1\u0140",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0143",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0145",
            "\1\u0146",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u014c",
            "",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u014e",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\2\u0152\2\uffff\1\u0152\22\uffff\1\u0152",
            "\1\u0153",
            "\1\u0154",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0156",
            "",
            "\1\u0157",
            "\1\u0158",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u015a",
            "\1\u015b",
            "\1\u015c",
            "\1\u015d",
            "\1\u015e",
            "\1\u015f",
            "\1\u0160",
            "",
            "",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0162",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0164",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0166",
            "",
            "\1\u0167",
            "",
            "\1\u0168",
            "",
            "",
            "",
            "",
            "\1\u0169",
            "\1\u016a",
            "",
            "\1\u016b",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u016e",
            "\1\u016f",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u0171",
            "\1\u0172",
            "\1\65\15\uffff\12\65\7\uffff\13\65\1\u0173\16\65\4\uffff\1\65"+
            "\1\uffff\32\65",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0176",
            "",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\u0178",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u017a",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u017d",
            "",
            "",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u017f",
            "",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "",
            "",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "",
            "",
            "\1\u0186",
            "",
            "\1\u0187",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "",
            "",
            "",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            "\1\u018f",
            "",
            "",
            "",
            "",
            "\1\65\15\uffff\12\65\7\uffff\32\65\4\uffff\1\65\1\uffff\32\65",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T13 | T14 | T15 | T16 | T17 | T18 | T19 | T20 | T21 | T22 | T23 | T24 | T25 | T26 | T27 | T28 | T29 | T30 | T31 | T32 | T33 | T34 | T35 | T36 | T37 | T38 | T39 | T40 | T41 | T42 | T43 | T44 | T45 | T46 | T47 | T48 | T49 | T50 | T51 | T52 | T53 | T54 | T55 | T56 | T57 | T58 | T59 | T60 | T61 | T62 | T63 | T64 | T65 | T66 | T67 | T68 | T69 | T70 | T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | T89 | T90 | T91 | T92 | T93 | T94 | T95 | T96 | T97 | T98 | T99 | T100 | T101 | T102 | T103 | T104 | T105 | T106 | T107 | T108 | T109 | T110 | T111 | T112 | T113 | T114 | T115 | T116 | T117 | RULE_INTEGERVALUE | RULE_IMPORT_ID | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_INT | RULE_ANY_OTHER );";
        }
    }
 

}