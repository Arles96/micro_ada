/* The following code was generated by JFlex 1.4.2 on 08-28-09 12:10 PM */

/**Elementos léxicos del lenguaje de programación ADA-95.
*Autor: Luis Felipe Borjas Reyes @ 25 Agosto 2009
*
*/
/*Correr después del parser!*/
import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.2
 * on 08-28-09 12:10 PM from the specification file
 * <tt>ada95_tokens.flex</tt>
 */
class Ada95Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\13\1\0\1\3\1\13\22\0\1\3\1\0\1\11"+
    "\1\5\2\0\1\23\1\14\1\53\1\54\1\24\1\7\1\55\1\10"+
    "\1\6\1\17\12\2\1\56\1\57\1\21\1\20\1\22\2\0\1\25"+
    "\1\26\1\33\1\37\1\15\1\16\1\42\1\47\1\36\1\1\1\50"+
    "\1\35\1\45\1\40\1\27\1\34\1\52\1\30\1\32\1\31\1\44"+
    "\1\51\1\46\1\43\1\41\1\1\4\0\1\4\1\0\1\25\1\26"+
    "\1\33\1\37\1\15\1\16\1\42\1\47\1\36\1\1\1\50\1\35"+
    "\1\45\1\40\1\27\1\34\1\52\1\30\1\32\1\31\1\44\1\12"+
    "\1\46\1\43\1\41\1\1\1\0\1\60\uff83\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\2\0\1\1\1\2\1\3\1\4\1\5\2\6\1\7"+
    "\1\4\1\1\2\2\1\10\3\11\1\12\1\10\21\2"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\5\0\1\24\2\0\1\25\5\0\1\11\1\26"+
    "\1\27\1\30\1\31\1\32\2\0\1\33\5\0\1\34"+
    "\1\35\20\0\1\36\1\37\1\40\1\0\1\41\14\0"+
    "\1\42\1\21\1\0\2\3\1\0\1\43\1\25\2\0"+
    "\1\44\2\0\1\45\2\0\1\46\2\0\1\47\1\0"+
    "\1\50\3\0\1\51\4\0\1\52\26\0\1\53\1\54"+
    "\3\0\1\55\1\56\1\0\1\57\3\0\1\3\1\0"+
    "\1\60\3\0\1\61\7\0\1\62\11\0\1\63\1\0"+
    "\1\64\1\65\3\0\1\66\6\0\1\67\5\0\1\70"+
    "\1\0\1\71\1\0\1\72\1\73\2\0\1\74\1\75"+
    "\2\0\1\76\1\0\1\77\3\0\1\100\6\0\1\101"+
    "\1\102\15\0\1\103\1\104\2\0\1\105\1\106\3\0"+
    "\1\107\1\110\1\0\1\111\1\0\1\112\1\113\3\0"+
    "\1\114\1\0\1\115\3\0\1\116\5\0\1\117\4\0"+
    "\1\120\1\121\1\122\1\123\2\0\1\124\1\0\1\125"+
    "\2\0\1\126\1\127\1\130\1\131\1\0\1\132\1\133"+
    "\1\0\1\134\1\135\2\0\1\136\1\137\1\140\1\141";

  private static int [] zzUnpackAction() {
    int [] result = new int[321];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\61\0\142\0\223\0\304\0\365\0\u0126\0\142"+
    "\0\u0157\0\142\0\u0188\0\u01b9\0\u01ea\0\u021b\0\u024c\0\u027d"+
    "\0\u02ae\0\u02df\0\142\0\u0310\0\u0341\0\u0372\0\u03a3\0\u03d4"+
    "\0\u0405\0\u0436\0\u0467\0\u0498\0\u04c9\0\u04fa\0\u052b\0\u055c"+
    "\0\u058d\0\u05be\0\u05ef\0\u0620\0\u0651\0\142\0\142\0\142"+
    "\0\u0682\0\142\0\142\0\u06b3\0\u06e4\0\142\0\u0715\0\u0746"+
    "\0\u0777\0\u07a8\0\u07d9\0\142\0\u080a\0\u083b\0\u083b\0\u086c"+
    "\0\u089d\0\u08ce\0\u08ff\0\u0930\0\142\0\142\0\142\0\142"+
    "\0\142\0\142\0\u0961\0\u0992\0\142\0\u09c3\0\u09f4\0\u0a25"+
    "\0\u0a56\0\u0a87\0\142\0\142\0\u0ab8\0\u0ae9\0\u0b1a\0\u0b4b"+
    "\0\u0b7c\0\u0bad\0\u0bde\0\u0c0f\0\u0c40\0\u0c71\0\u0ca2\0\u0cd3"+
    "\0\u0d04\0\u0d35\0\u0d66\0\u0d97\0\142\0\142\0\142\0\u0dc8"+
    "\0\142\0\u0df9\0\u0e2a\0\u0e5b\0\u0e8c\0\u0ebd\0\u0eee\0\u0f1f"+
    "\0\u0f50\0\u0f81\0\u0fb2\0\u0fe3\0\u1014\0\142\0\142\0\u1045"+
    "\0\u1076\0\u10a7\0\u10d8\0\u080a\0\142\0\u1109\0\u113a\0\142"+
    "\0\u116b\0\u119c\0\142\0\u11cd\0\u11fe\0\u122f\0\u1260\0\u1291"+
    "\0\142\0\u12c2\0\142\0\u12f3\0\u1324\0\u1355\0\142\0\u1386"+
    "\0\u13b7\0\u13e8\0\u1419\0\142\0\u144a\0\u147b\0\u14ac\0\u14dd"+
    "\0\u150e\0\u153f\0\u1570\0\u15a1\0\u15d2\0\u1603\0\u1634\0\u1665"+
    "\0\u1696\0\u16c7\0\u16f8\0\u1729\0\u175a\0\u178b\0\u17bc\0\u17ed"+
    "\0\u181e\0\u184f\0\142\0\142\0\u1880\0\u18b1\0\u18e2\0\142"+
    "\0\142\0\u1913\0\142\0\u1944\0\u1975\0\u19a6\0\u19d7\0\u1a08"+
    "\0\142\0\u1a39\0\u1a6a\0\u1a9b\0\142\0\u1acc\0\u1afd\0\u1b2e"+
    "\0\u1b5f\0\u1b90\0\u1bc1\0\u1bf2\0\142\0\u1c23\0\u1c54\0\u1c85"+
    "\0\u1cb6\0\u1ce7\0\u1d18\0\u1d49\0\u1d7a\0\u1dab\0\142\0\u1ddc"+
    "\0\142\0\142\0\u1e0d\0\u1e3e\0\u1e6f\0\142\0\u1ea0\0\u1ed1"+
    "\0\u1f02\0\u1f33\0\u1f64\0\u1f95\0\142\0\u1fc6\0\u1ff7\0\u2028"+
    "\0\u2059\0\u208a\0\142\0\u20bb\0\142\0\u20ec\0\142\0\142"+
    "\0\u211d\0\u214e\0\142\0\142\0\u217f\0\u21b0\0\142\0\u21e1"+
    "\0\142\0\u2212\0\u2243\0\u2274\0\142\0\u22a5\0\u22d6\0\u2307"+
    "\0\u2338\0\u2369\0\u239a\0\142\0\142\0\u23cb\0\u23fc\0\u242d"+
    "\0\u245e\0\u248f\0\u24c0\0\u24f1\0\u2522\0\u2553\0\u2584\0\u25b5"+
    "\0\u25e6\0\u2617\0\142\0\142\0\u2648\0\u2679\0\142\0\142"+
    "\0\u26aa\0\u26db\0\u270c\0\142\0\142\0\u273d\0\142\0\u276e"+
    "\0\142\0\142\0\u279f\0\u27d0\0\u2801\0\142\0\u2832\0\142"+
    "\0\u2863\0\u2894\0\u28c5\0\142\0\u28f6\0\u2927\0\u2958\0\u2989"+
    "\0\u29ba\0\142\0\u29eb\0\u2a1c\0\u2a4d\0\u2a7e\0\142\0\142"+
    "\0\142\0\142\0\u2aaf\0\u2ae0\0\142\0\u2b11\0\142\0\u2b42"+
    "\0\u2b73\0\142\0\142\0\142\0\142\0\u2ba4\0\142\0\142"+
    "\0\u2bd5\0\142\0\142\0\u2c06\0\u2c37\0\142\0\142\0\142"+
    "\0\142";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[321];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\3\1\4\1\5\1\6\2\3\1\7\1\10\1\11"+
    "\1\12\1\13\1\6\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40"+
    "\1\4\1\41\1\42\1\43\1\44\1\45\4\4\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\11\54\1\55\1\54"+
    "\1\56\45\54\65\0\1\57\56\0\1\5\1\0\1\60"+
    "\1\61\1\62\6\0\1\63\46\0\1\6\6\0\2\6"+
    "\53\0\1\64\62\0\1\65\53\0\1\6\1\57\5\0"+
    "\2\6\45\0\14\66\1\67\44\66\4\0\1\57\30\0"+
    "\1\70\2\0\1\71\2\0\1\72\21\0\1\57\22\0"+
    "\1\73\14\0\1\74\34\0\1\75\62\0\1\76\56\0"+
    "\1\75\1\77\1\100\56\0\1\75\1\0\1\101\62\0"+
    "\1\102\40\0\1\57\21\0\1\103\1\0\1\104\1\105"+
    "\1\0\1\106\1\0\1\107\2\0\1\110\24\0\1\57"+
    "\10\0\1\111\11\0\1\112\35\0\1\57\11\0\1\113"+
    "\11\0\1\114\1\115\12\0\1\116\20\0\1\57\10\0"+
    "\1\117\7\0\1\120\37\0\1\57\10\0\1\121\7\0"+
    "\1\122\13\0\1\123\5\0\1\124\15\0\1\57\10\0"+
    "\1\125\26\0\1\126\20\0\1\57\20\0\1\127\1\0"+
    "\1\130\35\0\1\57\20\0\1\131\2\0\1\132\34\0"+
    "\1\57\22\0\1\133\6\0\1\134\26\0\1\57\11\0"+
    "\1\135\13\0\1\136\5\0\1\137\24\0\1\57\10\0"+
    "\1\140\11\0\1\141\6\0\1\142\26\0\1\57\10\0"+
    "\1\143\11\0\1\144\14\0\1\145\20\0\1\57\10\0"+
    "\1\146\11\0\1\147\35\0\1\57\22\0\1\150\35\0"+
    "\1\57\25\0\1\151\5\0\1\152\24\0\1\57\22\0"+
    "\1\153\35\0\1\57\31\0\1\154\10\0\1\155\31\0"+
    "\1\156\40\0\11\54\1\0\1\54\1\0\45\54\11\0"+
    "\1\157\50\0\2\4\7\0\1\4\2\0\2\4\6\0"+
    "\26\4\10\0\1\5\60\0\1\160\12\0\2\160\6\0"+
    "\2\160\4\0\1\160\3\0\1\160\23\0\1\161\60\0"+
    "\1\162\4\0\2\163\50\0\13\65\1\164\45\65\14\0"+
    "\1\165\76\0\1\166\57\0\1\167\5\0\1\170\54\0"+
    "\1\171\2\0\1\172\52\0\1\173\70\0\1\174\47\0"+
    "\1\175\2\0\1\176\56\0\1\177\63\0\1\200\62\0"+
    "\1\201\1\202\61\0\1\203\63\0\1\204\55\0\1\205"+
    "\70\0\1\206\42\0\1\207\41\0\1\210\16\0\1\211"+
    "\1\0\1\212\4\0\1\213\4\0\1\214\3\0\1\210"+
    "\1\215\44\0\1\216\1\0\1\217\50\0\1\220\62\0"+
    "\1\221\7\0\1\222\52\0\1\223\41\0\1\224\77\0"+
    "\1\225\1\226\51\0\1\227\64\0\1\230\66\0\1\231"+
    "\53\0\1\232\52\0\1\233\1\0\1\234\6\0\1\235"+
    "\51\0\1\236\76\0\1\237\46\0\1\240\1\0\1\241"+
    "\65\0\1\242\64\0\1\243\43\0\1\244\64\0\1\245"+
    "\63\0\1\246\51\0\1\247\57\0\1\250\45\0\1\251"+
    "\74\0\1\252\66\0\1\253\52\0\1\254\44\0\1\255"+
    "\20\0\1\256\24\0\1\160\1\0\1\61\1\257\1\260"+
    "\6\0\2\160\6\0\2\160\4\0\1\160\3\0\1\160"+
    "\23\0\1\161\1\0\1\62\10\0\1\63\45\0\1\162"+
    "\1\0\1\163\56\0\1\162\73\0\1\261\20\0\1\262"+
    "\52\0\1\263\45\0\1\264\74\0\1\265\62\0\1\266"+
    "\55\0\1\267\61\0\1\270\54\0\1\271\50\0\1\272"+
    "\70\0\1\273\71\0\1\274\63\0\1\275\34\0\1\276"+
    "\60\0\1\277\107\0\1\300\43\0\1\301\56\0\1\302"+
    "\77\0\1\303\46\0\1\304\70\0\1\305\63\0\1\306"+
    "\63\0\1\307\52\0\1\310\33\0\1\311\103\0\1\312"+
    "\45\0\1\313\50\0\1\314\74\0\1\315\44\0\1\316"+
    "\75\0\1\317\76\0\1\320\52\0\1\321\47\0\1\322"+
    "\1\0\1\323\37\0\1\324\36\0\1\324\43\0\1\325"+
    "\62\0\1\326\57\0\1\327\50\0\1\330\3\0\1\331"+
    "\65\0\1\332\57\0\1\333\40\0\1\334\72\0\1\335"+
    "\67\0\1\336\71\0\1\337\51\0\1\340\55\0\1\341"+
    "\40\0\1\63\45\0\1\342\12\0\2\342\6\0\2\342"+
    "\4\0\1\342\3\0\1\342\37\0\1\343\103\0\1\344"+
    "\53\0\1\345\55\0\1\346\60\0\1\347\57\0\1\350"+
    "\71\0\1\351\51\0\1\352\1\0\1\353\56\0\1\354"+
    "\66\0\1\355\50\0\1\356\60\0\1\357\60\0\1\360"+
    "\60\0\1\361\75\0\1\362\30\0\1\363\60\0\1\364"+
    "\60\0\1\365\101\0\1\366\37\0\1\367\73\0\1\370"+
    "\63\0\1\371\66\0\1\372\50\0\1\373\54\0\1\374"+
    "\100\0\1\375\30\0\1\376\60\0\1\377\70\0\1\u0100"+
    "\64\0\1\u0101\54\0\1\u0102\74\0\1\u0103\44\0\1\u0104"+
    "\64\0\1\u0105\57\0\1\u0106\65\0\1\u0107\40\0\1\u0108"+
    "\45\0\1\342\1\0\1\260\1\257\7\0\2\342\6\0"+
    "\2\342\4\0\1\342\3\0\1\342\52\0\1\u0109\65\0"+
    "\1\u010a\47\0\1\u010b\65\0\1\u010c\57\0\1\u010d\44\0"+
    "\1\u010e\75\0\1\u010f\60\0\1\u0110\66\0\1\u0111\57\0"+
    "\1\u0112\36\0\1\u0113\107\0\1\u0114\54\0\1\u0115\57\0"+
    "\1\u0116\46\0\1\u0117\64\0\1\u0118\63\0\1\u0119\51\0"+
    "\1\u011a\75\0\1\u011b\43\0\1\u011c\66\0\1\u011d\64\0"+
    "\1\u011e\52\0\1\u011f\44\0\1\u0120\73\0\1\u0121\62\0"+
    "\1\u0122\64\0\1\u0123\60\0\1\u0124\51\0\1\u0125\64\0"+
    "\1\u0126\64\0\1\u0127\36\0\1\u0128\75\0\1\u0129\43\0"+
    "\1\u012a\70\0\1\u012b\64\0\1\u012c\44\0\1\u012d\103\0"+
    "\1\u012e\35\0\1\u012f\74\0\1\u0130\73\0\1\u0131\31\0"+
    "\1\u0132\102\0\1\u0133\36\0\1\u0134\76\0\1\u0135\54\0"+
    "\1\u0136\71\0\1\u0137\51\0\1\u0138\60\0\1\u0139\44\0"+
    "\1\u013a\74\0\1\u013b\44\0\1\u013c\73\0\1\u013d\70\0"+
    "\1\u013e\35\0\1\u013f\102\0\1\u0140\36\0\1\u0141\43\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[11368];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\2\0\1\11\4\1\1\11\1\1\1\11\10\1\1\11"+
    "\22\1\3\11\1\1\2\11\2\1\1\11\5\0\1\11"+
    "\2\0\1\1\5\0\6\11\2\0\1\11\5\0\2\11"+
    "\20\0\3\11\1\0\1\11\14\0\2\11\1\0\2\1"+
    "\1\0\1\1\1\11\2\0\1\11\2\0\1\11\2\0"+
    "\1\1\2\0\1\11\1\0\1\11\3\0\1\11\4\0"+
    "\1\11\26\0\2\11\3\0\2\11\1\0\1\11\3\0"+
    "\1\1\1\0\1\11\3\0\1\11\7\0\1\11\11\0"+
    "\1\11\1\0\2\11\3\0\1\11\6\0\1\11\5\0"+
    "\1\11\1\0\1\11\1\0\2\11\2\0\2\11\2\0"+
    "\1\11\1\0\1\11\3\0\1\11\6\0\2\11\15\0"+
    "\2\11\2\0\2\11\3\0\2\11\1\0\1\11\1\0"+
    "\2\11\3\0\1\11\1\0\1\11\3\0\1\11\5\0"+
    "\1\11\4\0\4\11\2\0\1\11\1\0\1\11\2\0"+
    "\4\11\1\0\2\11\1\0\2\11\2\0\4\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[321];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
StringBuffer string=new StringBuffer();
/**Función para crear un nuevo símbolo de java_cup.runtime vacío*/
private Symbol symbol(int type){
	return new Symbol(type,yyline,yycolumn);
}

/**Función para crear un nuevo símbolo de java_cup.runtime con valor
*@ param value el valor del símbolo
*/
private Symbol symbol(int type, Object value){
	return new Symbol(type, yyline, yycolumn, value);
}



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Ada95Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Ada95Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 174) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 95: 
          { return symbol(sym.TERMINATE);
          }
        case 98: break;
        case 52: 
          { return symbol(sym.TYPE);
          }
        case 99: break;
        case 47: 
          { return symbol(sym.MOD);
          }
        case 100: break;
        case 32: 
          { return symbol(sym.IN);
          }
        case 101: break;
        case 91: 
          { return symbol(sym.ABSTRACT);
          }
        case 102: break;
        case 35: 
          { /*ignorar*/
          }
        case 103: break;
        case 29: 
          { return symbol(sym.OR);
          }
        case 104: break;
        case 66: 
          { return symbol(sym.RANGE);
          }
        case 105: break;
        case 10: 
          { return symbol(sym.CONCATENATE);
          }
        case 106: break;
        case 72: 
          { return symbol(sym.ACCEPT);
          }
        case 107: break;
        case 59: 
          { return symbol(sym.WHEN);
          }
        case 108: break;
        case 50: 
          { return symbol(sym.BODY);
          }
        case 109: break;
        case 7: 
          { string.setLength(0);yybegin(STRING);
          }
        case 110: break;
        case 63: 
          { return symbol(sym.ARRAY);
          }
        case 111: break;
        case 20: 
          { return symbol(sym.DOUBLEDOT);
          }
        case 112: break;
        case 15: 
          { return symbol(sym.SEMICOLON);
          }
        case 113: break;
        case 60: 
          { return symbol(sym.ELSIF);
          }
        case 114: break;
        case 48: 
          { return symbol(sym.ELSE);
          }
        case 115: break;
        case 49: 
          { return symbol(sym.EXIT);
          }
        case 116: break;
        case 23: 
          { return symbol(sym.LEFTLABEL);
          }
        case 117: break;
        case 83: 
          { return symbol(sym.REQUEUE);
          }
        case 118: break;
        case 82: 
          { return symbol(sym.RENAMES);
          }
        case 119: break;
        case 34: 
          { return symbol(sym.ASSIGNMENT);
          }
        case 120: break;
        case 5: 
          { return symbol(sym.POINT);
          }
        case 121: break;
        case 69: 
          { return symbol(sym.UNTIL);
          }
        case 122: break;
        case 71: 
          { return symbol(sym.ACCESS);
          }
        case 123: break;
        case 18: 
          { yybegin(YYINITIAL);
	 return symbol(sym.STRING_LITERAL,string.toString());
          }
        case 124: break;
        case 94: 
          { return symbol(sym.EXCEPTION);
          }
        case 125: break;
        case 14: 
          { return symbol(sym.COLON);
          }
        case 126: break;
        case 55: 
          { return symbol(sym.LOOP);
          }
        case 127: break;
        case 40: 
          { return symbol(sym.AND);
          }
        case 128: break;
        case 77: 
          { return symbol(sym.SELECT);
          }
        case 129: break;
        case 96: 
          { return symbol(sym.PROTECTED);
          }
        case 130: break;
        case 6: 
          { return symbol(sym.ADDING_OPERATOR,yytext());
          }
        case 131: break;
        case 78: 
          { return symbol(sym.PRAGMA);
          }
        case 132: break;
        case 41: 
          { return symbol(sym.OUT);
          }
        case 133: break;
        case 81: 
          { return symbol(sym.REVERSE);
          }
        case 134: break;
        case 30: 
          { return symbol(sym.IF);
          }
        case 135: break;
        case 44: 
          { return symbol(sym.NOT);
          }
        case 136: break;
        case 65: 
          { return symbol(sym.RAISE);
          }
        case 137: break;
        case 89: 
          { return symbol(sym.GENERIC);
          }
        case 138: break;
        case 70: 
          { return symbol(sym.WHILE);
          }
        case 139: break;
        case 21: 
          { return symbol(sym.CHARACTER_LITERAL,yytext());
          }
        case 140: break;
        case 88: 
          { return symbol(sym.DECLARE);
          }
        case 141: break;
        case 13: 
          { return symbol(sym.COMMA);
          }
        case 142: break;
        case 51: 
          { return symbol(sym.TASK);
          }
        case 143: break;
        case 75: 
          { return symbol(sym.RECORD);
          }
        case 144: break;
        case 79: 
          { return symbol(sym.DIGITS);
          }
        case 145: break;
        case 11: 
          { return symbol(sym.LEFT_PAR);
          }
        case 146: break;
        case 24: 
          { return symbol(sym.BOX);
          }
        case 147: break;
        case 28: 
          { return symbol(sym.OF);
          }
        case 148: break;
        case 38: 
          { return symbol(sym.ABS);
          }
        case 149: break;
        case 56: 
          { return symbol(sym.NULL);
          }
        case 150: break;
        case 17: 
          { string.append(yytext());
          }
        case 151: break;
        case 58: 
          { return symbol(sym.WITH);
          }
        case 152: break;
        case 36: 
          { return symbol(sym.END);
          }
        case 153: break;
        case 45: 
          { return symbol(sym.XOR);
          }
        case 154: break;
        case 73: 
          { return symbol(sym.OTHERS);
          }
        case 155: break;
        case 42: 
          { return symbol(sym.REM);
          }
        case 156: break;
        case 22: 
          { return symbol(sym.ARROW);
          }
        case 157: break;
        case 46: 
          { return symbol(sym.USE);
          }
        case 158: break;
        case 64: 
          { return symbol(sym.BEGIN);
          }
        case 159: break;
        case 9: 
          { return symbol(sym.RELATIONAL_OPERATOR,yytext());
          }
        case 160: break;
        case 57: 
          { return symbol(sym.GOTO);
          }
        case 161: break;
        case 4: 
          { /*return symbol(sym.SEPARATOR);*/
          }
        case 162: break;
        case 53: 
          { return symbol(sym.THEN);
          }
        case 163: break;
        case 25: 
          { return symbol(sym.RIGHTLABEL);
          }
        case 164: break;
        case 86: 
          { return symbol(sym.PRIVATE);
          }
        case 165: break;
        case 26: 
          { return symbol(sym.EXPONENTIATE);
          }
        case 166: break;
        case 97: 
          { return symbol(sym.PROCEDURE);
          }
        case 167: break;
        case 74: 
          { return symbol(sym.RETURN);
          }
        case 168: break;
        case 27: 
          { return symbol(sym.AT);
          }
        case 169: break;
        case 85: 
          { return symbol(sym.PACKAGE);
          }
        case 170: break;
        case 90: 
          { return symbol(sym.FUNCTION);
          }
        case 171: break;
        case 8: 
          { return symbol(sym.MULTIPLYING_OPERATOR,yytext());
          }
        case 172: break;
        case 93: 
          { return symbol(sym.CONSTANT);
          }
        case 173: break;
        case 67: 
          { return symbol(sym.DELAY);
          }
        case 174: break;
        case 80: 
          { return symbol(sym.ALIASED);
          }
        case 175: break;
        case 19: 
          { System.err.println("Error léxico: no es permitido un salto de línea en una cadena de caracteres. En línea "+yyline+", columna "+yycolumn);
          }
        case 176: break;
        case 3: 
          { return symbol(sym.NUMERIC_LITERAL,yytext());
          }
        case 177: break;
        case 84: 
          { return symbol(sym.SUBTYPE);
          }
        case 178: break;
        case 12: 
          { return symbol(sym.RIGHT_PAR);
          }
        case 179: break;
        case 87: 
          { return symbol(sym.LIMITED);
          }
        case 180: break;
        case 92: 
          { return symbol(sym.SEPARATE);
          }
        case 181: break;
        case 76: 
          { return symbol(sym.TAGGED);
          }
        case 182: break;
        case 33: 
          { return symbol(sym.DO);
          }
        case 183: break;
        case 37: 
          { return symbol(sym.FOR);
          }
        case 184: break;
        case 31: 
          { return symbol(sym.IS);
          }
        case 185: break;
        case 16: 
          { return symbol(sym.VERTICAL_LINE);
          }
        case 186: break;
        case 62: 
          { return symbol(sym.ABORT);
          }
        case 187: break;
        case 54: 
          { return symbol(sym.CASE);
          }
        case 188: break;
        case 61: 
          { return symbol(sym.ENTRY);
          }
        case 189: break;
        case 39: 
          { return symbol(sym.ALL);
          }
        case 190: break;
        case 68: 
          { return symbol(sym.DELTA);
          }
        case 191: break;
        case 1: 
          { /*throw new Error("Caracter inesperado: <"+yytext()+"> en línea "+yyline+", columna "+yycolumn);*/
	System.err.println("Caracter inesperado: <"+yytext()+"> en línea "+yyline+", columna "+yycolumnn);
          }
        case 192: break;
        case 43: 
          { return symbol(sym.NEW);
          }
        case 193: break;
        case 2: 
          { return symbol(sym.IDENTIFIER, yytext());
          }
        case 194: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
