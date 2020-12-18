import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * User: paul
 * Date: 12/12/17
 */
public class XMasSongClear {

    private static final String __ASCII_XMAS_TREE =
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


    public static void main (String[] args){

        String[] dictionary = magicOfChristmas().split("\\.");

        printConsoleOutput(
                Arrays.copyOfRange( dictionary, 0, (int)(dictionary.length / 2) - 2 )
                , Arrays.copyOfRange( dictionary, (int)(dictionary.length / 2) - 2 , dictionary.length  - 3 )
                , dictionary[ dictionary.length - 2 ]
                , dictionary[ dictionary.length - 1 ]
        );

    }

    private static String magicOfChristmas(){
        StringBuilder sb = new StringBuilder( );
        String s = new StringBuilder(__ASCII_XMAS_TREE.replaceAll(" ", "")).reverse().toString();
        for (int i = 0 ; i < s.indexOf('#'); i++)
            try {
                sb.append((char)(( s.getBytes("US-ASCII")[i] ^ 0b00011000) ));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

        return sb.toString();
    }

    private static void printConsoleOutput(
        String[] days
        , String[] englishDozen
        , String header
        , String footer

    ){
        for (int i = days.length; i >=0 ; i--){
            System.out.println(header.replace("Z", englishDozen[days.length - i]).replace(", ", ", \n").concat(","));
            for (int j = i; j < days.length; j++)
                System.out.println(days[j].concat(", "));

            System.out.println(footer.replace("Z", (i == days.length) ? "A" : "And a").concat("\n"));
        }

    }

}
