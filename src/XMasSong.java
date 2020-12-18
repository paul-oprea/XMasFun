// Just save this as XMasSong.java, compile and execute
public class XMasSong {
        private static final String x =
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


private static String m(){StringBuilder sb = new StringBuilder( );String s=new StringBuilder(
x.replaceAll(" ","")).reverse().toString();for (int i = 0 ; i < s.indexOf('('); i++
){try{sb.append((char)(((++s.getBytes("US-ASCII")[i])^y)));}catch(Exception e){;}}return
sb.toString();}private static final byte y = 0b00011000;private static void p(String[] d, String[]
e, String h, String f){for (int i = d.length; i >=0 ; i--){System.out.println(h.replace("Z"
, e[d.length - i]).replace(", ", ", \n").concat(","));for (int j = i; j < d.length;
j++) {System.out.println(d[j].concat(", "));}System.out.println(f.replace("Z", (i == d.length)
? "A" : "And a").concat("\n"));}}public static void main (String[] args){String[]d=m().split(
"\\.");p(java.util.Arrays.copyOfRange(d,0,(int)(d.length/2)-2),java.util.Arrays.
copyOfRange(d,(int)(d.length/2)-2,d.length-3),d[d.length-2],d[d.length-1]);}}