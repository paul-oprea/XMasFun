import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: paul
 * Date: 12/8/17
 * Time: 6:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class BinaryPrepwork {
    private static final String test = "I'm a wanderer";
    private static final String mask = "I'm a bonkerer";
    private static final byte[] mass = {0,0,0,0,0,0,21,14,0,15,0,0,0,0};

    private static final String __ASCII_NEW =
            "                              +                                                     "+
            "                             :$$                                                    "+
            "                        seeee$$$Neeee                                               "+
            "                          R$$$F$$$$F                                                "+
            "                            $$$$$$                                                  "+
            "                           @$$P*$$B                                                 "+
            "                          z$#/~  $#$b                                               "+
            "                          /~ d   'N /~                                              "+
            "                           @/~     ?r                                               "+
            "                         xF .       /~N                                             "+
            "                      .$> P54.R       `$                                            "+
            "                    $*   '*/~$$$  uoP***~                                           "+
            "                     #Noo /~?$N/~   #oL                                             "+
            "                        f       o$#$$/~e.                                           "+
            "                       $  @b    hoR$$r ^/~$$b                                       "+
            "                    .M   ?B$E   *.B$$       .R                                      "+
            "                  .*     *// *.4*R         ..*                                      "+
            "               oo#     ooL    d#R.     P##~                                         "+
            "               $c    ./~/~P#$  @   P     k                                          "+
            "                 R$r ''?L$$  P  /~r     'N                                          "+
            "                   ^$ /~$$$` $.....JL     /~N.                                      "+
            "                 .$//           * P5/~LR      $..                                   "+
            "              ..* 4*R     xr    'PFN$$   .k    /~*****.                             "+
            "           od#/~   d#*.  /~*$$P~   /~?$*/~ '#$$$/~       u/~                        "+
            "        e/~/~      f   M   @F/~$  ec       x$/~$.     :/~                           "+
            "        M        >  /~d       $$$$?$           .$$F`                                "+
            "         /~P..  .$.....$L $$.4$$. /~   @#3$$   $E.                                  "+
            "            '**..  *   R..$$ `R$*k.  fdM$$>     *..                                 "+
            "              J/~       *k$$$~  /~*$**o$o$$P        '*oo.                           "+
            "             P           #        /~$$$#*o          >  '####*oooo                   "+
            "          .e/~            :e$$e.  F3  ^/~$P  :$$s :e@$ee        s/~                 "+
            "        $P` M7>    $P$$k /~$/~?$3 @/~#}      }jl8jy }h8y       8v                   "+
            "     q8}   |qjl   jyh8B6  }u8wl8   }n      y8}  n  wt8}mjl8                       "+
            " aU84     k   yu   lkqjp[8~w8  a  y|8     B          8}p                            "+
            " l8vW      6  |vY    6pl~t}o   l6plv}n}  t}6pl           v}l6p                      "+
            "    lvqv6lpq}6plv}n}k6pl`        qk6p      l~q~    6pljm       w~6|jq              "+
            "       pl6    |v w{} k            6lk     jq~  6k   }nw|8}             tljml8woL6   "+
            "      kv      }p8p{       v    } j^8}       }j   pL6k| jq                z          "+
            "    8  v     q tty     {8jmw  ^6kvq     j8v}|       tw8             }nq          "+
            "  ^6  vqay    t5y5}       k}}    8`q      K6vqu     u   qok5y5kvyok8v}           "+
            "n}     K6v       qstq  u5y 5k|   qy         u8lp        q]6v                    q"+
            "{vy|8k} q        |yt8}v  q          V6vq           hy    }t5y5k|jwt                "+
            "     8v}L6vqhqh8kj      }        hq   h          8 v}n}     t]     6v             "+
            "                             quumj|8kj}                                             "+
            "                             u        u                                             "+
            "                             mj|8}nt}oL                                             ";

    private static final String __ASCII_TREE =
            "                               +                                                    " +
            "                              :$$                                                   " +
            "                         seeee$$$Neeee                                              " +
            "                           R$$$F$$$$F                                               " +
            "                             $$$$$$                                                 " +
            "                            @$$P*$$B                                                " +
            "                           z$#/~  $#$b                                              " +
            "                           /~ d   'N /~                                             " +
            "                            @/~     ?r                                              " +
            "                          xF .       /~N                                            " +
            "                       .$> P54.R       `$                                           " +
            "                     $*   '*/~$$$  uoP***~                                          " +
            "                      #Noo /~?$N/~   #oL                                            " +
            "                         f       o$#$$/~e.                                          " +
            "                        $  @b    hoR$$r ^/~$$b                                      " +
            "                     .M   ?B$E   *.B$$       .R                                     " +
            "                   .*     *// *.4*R         ..*                                     " +
            "                oo#     ooL    d#R.     P##~                                        " +
            "                $c    ./~/~P#$  @   P     k                                         " +
            "                  R$r ''?L$$  P  /~r     'N                                         " +
            "                    ^$ /~$$$` $.....JL     /~N.                                     " +
            "                  .$//           * P5/~LR      $..                                  " +
            "               ..* 4*R     xr    'PFN$$   .k    /~*****.                            " +
            "            od#/~   d#*.  /~*$$P~   /~?$*/~ '#$$$/~       u/~                       " +
            "         e/~/~      f   M   @F/~$  ec       x$/~$.     :/~                          " +
            "         M        >  /~d       $$$$?$           .$$F`                               " +
            "          /~P..  .$.....$L $$.4$$. /~   @#3$$   $E.                                 " +
            "             '**..  *   R..$$ `R$*k.  fdM$$>     *..                                " +
            "               J/~       *k$$$~  /~*$**o$o$$P        '*oo.                          " +
            "              P           #        /~$$$#*o          >  '####*oooo                  " +
            "           .e/~            :e$$e.  F3  ^/~$P  :$$s :e@$ee        s/~                " +
            "         $P` M7>    $P$$k /~$/~?$3 @/~#N      CxN$$> .$$$       .P                  " +
            "      M$~   J//##   44N>$$  .d$.$d   @&      `$$$  F  .8..$$$*                      " +
            "  .***     :   JM   *d$$*.$$.P  M  .P5     M          **.                           " +
            "  /~oo      J  .dP    ud$$od#   $oooooo$  oo$oo           ###ou                     " +
            "     /~####$beeeee$.'$eeP#~        /~/~      $$$.    e$$$o       #heeee             " +
            "        :/~    /~ z$r ^            o$N     '/~  /~   4$z>$$             /~/~/~#$$$  " +
            "       .~      F$4$B       r    F @#$.       ..   $8$$P M7                $         " +
            "     .*  $     8 $$B     .J$..  hP$$$F     .'PB$       J~##             .d~         " +
            "   .P  *$$$*    /~*/~       $$$    #**~      hdM$$>     <   JM.......*****          " +
            " .P     $#*k       .o#>  P/~ /~k   ..         '$$P      d  .JP'h                    " +
            "/~/~/~hr ^        xe/~/~  >          /~/~c           ee    @beeeee$.)               " +
            "      /~/~/~t$$$$F/~      M        $`   R          > /~$r     /~     /~c            " +
            "                              oooooooooo                                            " +
            "                              z        z                                            " +
            "                              z.,ze.$$$z                                            ";

    private static final String _DAYS =
            "Twelve drummers drumming." +
            "Eleven pipers piping." +
            "Ten lords-a-leaping." +
            "Nine ladies dancing." +
            "Eight maids-a-milking." +
            "Seven swans-a-swimming." +
            "Six geese-a-laying." +
            "Five golden rings." +
            "Four calling birds." +
            "Three French hens." +
            "Two turtle doves." +
            "first.second.third.fourth.fifth.sixth.seventh.eight.ninth.tenth.eleventh.twelfth.And." +
             "On the Z day of Christmas, My true love gave to me."+
             "Z partridge in a pear tree"
    ;


    public static void main (String[] args){
//        System.out.println(Arrays.toString(test.getBytes()));
        System.out.println(_DAYS.length());
        System.out.println(__ASCII_TREE.length());

        String noSpaces = __ASCII_TREE.replaceAll(" ", "");
        System.out.println(noSpaces.length());

        StringBuilder sb = new StringBuilder();
/*
        int a = 0;
        for (int i = 0; i < _DAYS.length; i++) {
            String day = _DAYS[i];
            for (int j = 0; j < day.getBytes().length; j++) {
                byte b = day.getBytes()[j];
                while ( (__ASCII_TREE.charAt(a) == ' ') || (__ASCII_TREE.charAt(a) == '|') )
                    sb.append(__ASCII_TREE.charAt(a++));

                    sb.append(day.charAt(j)) ;
                a++;

            }
        }
        System.out.println(sb.toString());
*/
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();

        for (int i = 0; i < _DAYS.length(); i++) {
            byte b = _DAYS.getBytes()[i];
//            int lMask  = b << 1;
            int lMask  = b ^ 0b00011000;
//            int rMask  = lMask >> 1;
            int rMask  = lMask ^ 0b00011000;
//            byte lMask  = (byte) (b & 0b10101111);
//            byte rMask = (byte) (b & 0b01011111);

            byte recompose = (byte)(lMask | rMask);
            left.append((char)lMask);
            right.append((char)rMask);

        }
        System.out.print("left: ");
        System.out.println(left.toString());
        System.out.println(wrapper(left.toString()));
        System.out.print("right:");
        System.out.println(right.toString());

        System.out.println(de());

        int j = 0;
        for (int i = 0; i < noSpaces.getBytes().length;) {
            byte b = 0;
            byte t = noSpaces.getBytes()[ noSpaces.length() - i - 1 ];

            if ( t != 32 )
            {
                if ( j < _DAYS.length() ){
                    b = _DAYS.getBytes()[j];
                    b = (byte)( b << 1);
                }
                else b = t;
//            sb.append(Integer.toHexString((int) b ^ t));
//                sb.append((char) (b ^ t));
//                sb.append((char) (  b << 1 ));
                sb.append((char) (  b  ));
//            sb.append(',');
                j++;
            }
            else
                sb.append(' ');
            i++;

        }

        System.out.println(sb.reverse().toString());

    }

    private static String wrapper(String wrappee){
        StringBuilder sb = new StringBuilder(__ASCII_TREE.length());
        String newTree = String.copyValueOf(__ASCII_TREE.toCharArray());
        int j = 0;
        for (int i =  __ASCII_TREE.length() - 1; i >=0; i--) {
            char c = __ASCII_TREE.charAt(i);

            sb.append(( c != ' ' && j < wrappee.length()) ? wrappee.charAt( j ++ ) : c );

        }
        return ssplit(sb.reverse().toString());

    }

    private static String ssplit(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if ( i % 84 == 0 ) {
                sb.append('\"');
                sb.append('+');
                sb.append('\n');
                sb.append('\"');

            }

        }
        return sb.toString();

    }

    private static String de(){
        StringBuilder sb = new StringBuilder( );
        String s = new StringBuilder(__ASCII_NEW.replaceAll(" ", "")).reverse().toString();
        for (int i = 0 ; i < 306; i++)
            try {
                sb.append((char)(( s.getBytes("US-ASCII")[i] ^ 0b00011000) ));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

        return sb.toString();
    }

}
