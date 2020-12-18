import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class AsciiPoetryClear {
    private static final String __ASCII_XMAS_TREE =
            "                               +                                                    "+
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
            "        $P` M7>    $P$$k /~$/~?$3 @/~#(|      |ik7ix |g7x       7u                  "+
            "     p7|   ~{pik   ixg7A5  |t7vk7   |m      x~7|  m  vs7|lik7                       "+
            " `T73     j   xt   kjpioZ7}v7  `  x{7     A          7|o                            "+
            " k7uV      5  {uX    5ok}s|n   k5oku|m|  s|5ok           u|k5o                      "+
            "    kupu5ko~p|5oku|m|j5ok_        pj5o      k}p}    5okil       v}5{ip              "+
            "       ok5    {u vz| j            5kj     ip}  5j   |mv{7|             skilk7vnK5   "+
            "      ju      |o7oz       u    | i]7|       |i   oK5j{ ip                y          "+
            "    7~  u     p ssx     z7ilv  ]5j~up     i7u|{       sv~7             |mp          "+
            "  ]5  ~up`x    s4x4|       j||    ~7_p      J5~upt     t   pnj4x4juxnj7u|           "+
            "m|     J5~u       prsp  t4x 4j{   px         t7ko      ~  p\\5~u                    "+
            "  pzux{7j| p        {xs7|u  p          U5~up           gx    |s4x4j{ivs             "+
            "        7u|K5~upgpg7ji      |        gp   g          7 u|m|     s\\     5~u         "+
            "                                   pttli{7ji|                                       "+
            "                                   t        t                                       "+
            "                                   li{7|ms|nK                                       ";

    private static final byte __BITMASK = 0b00011000;
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
        for (int i = 0 ; i < s.indexOf('('); i++)
            try {
                sb.append((char)(( (++s.getBytes("US-ASCII")[i] ) ^ __BITMASK) ));
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
