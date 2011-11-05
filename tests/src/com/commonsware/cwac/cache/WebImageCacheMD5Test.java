package com.commonsware.cwac.cache;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: richardg
 * Date: 5/11/11
 * Time: 9:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class WebImageCacheMD5Test {

    @Test
    public void testMD5_1() throws Exception {
        String test, expect;

        test = "Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        expect = "ffde56f67c1c9253b4ede7cce83b3a9a";
        assertEquals(expect, WebImageCache.md5(test));
    }

    @Test
    public void testMD5_2() throws Exception {
        String test, expect;

        test = "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";
        expect = "21a9966b4fcb65360b923b0341637b3a";
        assertEquals(expect, WebImageCache.md5(test));
    }

    @Test
    public void testMD5_3() throws Exception {
        String test, expect;

        test = "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.";
        expect = "6ac07fa16c0fd58910c5fa26501a625d";
        assertEquals(expect, WebImageCache.md5(test));
    }

    @Test
    public void testMD5_4() throws Exception {
        String test, expect;

        test = "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        expect = "bdbb81c2daea2b6fd474364c852b1a38";
        assertEquals(expect, WebImageCache.md5(test));

    }
}
