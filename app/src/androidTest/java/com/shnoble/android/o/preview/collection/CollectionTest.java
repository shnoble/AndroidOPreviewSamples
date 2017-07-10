package com.shnoble.android.o.preview.collection;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by shhong on 2017. 7. 7..
 */

public class CollectionTest {
    @Test
    public void removeAll() throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.removeAll(null);
    }

    @Test
    public void retainAll() throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.retainAll(null);
    }
}
