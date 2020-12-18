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
//    private static final String test = "I'm a wanderer";
//    private static final String mask = "I'm a bonkerer";
//    private static final byte[] mass = {0,0,0,0,0,0,21,14,0,15,0,0,0,0};
    private static final byte __BITMASK = 0b00011000;

    private static final String __ASCII_NEW =
            "                               +                                                     "+
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
            "        $P` M7>    $P$$k /~$/~?$3 @/~#|      |ik7ix |g7x       7u                   "+
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
            "                                   li{7|ms|nK                                       #";

    /**
     * This is a mask for the Christmas tree shape. It does not matter what the content is.
     * Only blank or non blank.
     */
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
//        System.out.println(noSpaces.length());

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
            int lMask  = ( b ^ __BITMASK ) - 2;
//            int rMask  = lMask >> 1;
            int rMask  = (lMask+2) ^ __BITMASK;
//            byte lMask  = (byte) (b & 0b10101111);
//            byte rMask = (byte) (b & 0b01011111);

            byte recompose = (byte)( ++lMask | rMask);
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

//        System.out.println(sb.reverse().toString());

    }

    /**
     * Places the characters of a string onto a template
     * @param wrappee the string to be wrapped around the ASCII art template
     * @return a template looking string with extra spaces so that it resembles ASCII art
     */
    private static String wrapper(String wrappee){
        StringBuilder sb = new StringBuilder(__ASCII_TREE.length());
//        String newTree = String.copyValueOf(__ASCII_TREE.toCharArray());
        int maxCharValue = 0; int minCharValue = Integer.MAX_VALUE;
        int j = 0;
        for (int i =  __ASCII_TREE.length() - 1; i >=0; i--) {
            char c = __ASCII_TREE.charAt(i);

//            char n = (char)((int)wrappee.charAt( j ++ )+1);
            sb.append(( c != ' ' && j < wrappee.length()) ? wrappee.charAt( j ++ ) : c );
            if ( j < wrappee.length() ){
                maxCharValue = Math.max ( (int)wrappee.charAt( j ), maxCharValue);
                minCharValue = Math.min ( (int)wrappee.charAt( j ), minCharValue);
            }

        }
        System.out.format("Max ASCII code found: %s\t", maxCharValue);
        System.out.format("Mim ASCII code found: %s\n", minCharValue);
        return ssplit(sb.reverse().toString().replaceAll("\\\\", "\\\\\\\\\\\\\\\\"));

    }

    private static String ssplit(String s){
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if ( i > 0 && i % 84 == 0 ) {
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
                sb.append((char)(( (s.getBytes("US-ASCII")[i]+1) ^ __BITMASK) ));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }

        return sb.toString();
    }

}
