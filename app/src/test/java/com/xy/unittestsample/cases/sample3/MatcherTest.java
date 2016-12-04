package com.xy.unittestsample.cases.sample3;

import com.xy.unittestsample.sample3.Role;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static com.xy.unittestsample.cases.sample3.RoleMatcher.isAdmin;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.endsWith;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Xavier Yin on 12/2/16.
 */

public class MatcherTest {

    @Test
    public void testHasItems() throws Exception {
        List<Integer> testIntArray = Arrays.asList(1, 2, 3, 5);

        assertThat(testIntArray, hasItems(5, 3, 2));
    }

    @Test
    public void testStartsWith() throws Exception {
        String word = "preview";

        assertThat(word, startsWith("pre"));
    }

    @Test
    public void testEndsWith() throws Exception {
        String fileName = "word.exe";

        assertThat(fileName, endsWith("exe"));
    }

    @Test
    public void testContainsString() throws Exception {
        String content = "1st" + " " + "Unit Test Sample!";

        assertThat(content, containsString("1st"));
    }

    @Test
    public void testIs() throws Exception {
        String content = "1st" + " " + "Unit Test Sample!";

        assertThat(content.charAt(2), is('t'));
    }

    @Test
    public void testAnyOf() throws Exception {
        String content = "1st" + " " + "Unit Test Sample!";

        assertThat(content, anyOf(startsWith("1st"), startsWith("1")));
    }

    @Test
    public void testInstanceOf() throws Exception {
        Exception e1 = new IllegalArgumentException();

        assertThat(e1, instanceOf(IllegalArgumentException.class));
    }

    @Test
    public void testNullValue() throws Exception {
        Object object = null;

        assertThat(object, nullValue());
    }

    @Test
    public void testHasSize() throws Exception {
        List<Integer> testIntArray = Arrays.asList(1, 2, 3, 5);

        assertThat(testIntArray, hasSize(4));
        assertThat(testIntArray, contains(1, 2, 3, 5));
        assertThat(testIntArray, containsInAnyOrder(2, 3, 5, 1));
    }

    @Test
    public void testRoleOf() throws Exception {
        Role role = new Role("b123456789");


        assertThat(role, new RoleOf());
    }

    @Test
    public void testRoleOfIsCorrect() throws Exception {
        Role role = new Role("a123456789");


        assertThat(role, new RoleOf());
    }

    @Test
    public void testRoleOfIsCorrectWithFactoryMethod() throws Exception {
        Role role = new Role("a123456789");

        assertThat(role, isAdmin());
    }
}
