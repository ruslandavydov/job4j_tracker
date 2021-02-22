package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int result = cmpNamePriority.compare(
                new Job("First", 1),
                new Job("First", 2)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenComparatorByPriorityAndName() {
        Comparator<Job> cmpNamePriority = new JobDescByPriority().thenComparing(new JobDescByName());
        int result = cmpNamePriority.compare(
                new Job("First", 1),
                new Job("Second", 1)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenComparatorSortByName() {
        Comparator<Job> jobdesc = new JobDescByName();
        int result = jobdesc.compare(
                new Job("First", 1),
                new Job("Second", 2)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenComparatorSortByNameEqual() {
        Comparator<Job> jobdesc = new JobDescByName();
        int result = jobdesc.compare(
                new Job("First", 1),
                new Job("First", 1)
        );
        assertThat(result, equalTo(0));
    }

    @Test
    public void whenComparatorSortByNameReverse() {
        Comparator<Job> jobdesc = new JobDescByNameReverse();
        int result = jobdesc.compare(
                new Job("First", 1),
                new Job("Second", 2)
        );
        assertThat(result, greaterThan(0));
    }

    @Test
    public void whenComparatorSortByPriority() {
        Comparator<Job> jobdesc = new JobDescByPriority();
        int result = jobdesc.compare(
                new Job("First", 1),
                new Job("Second", 2)
        );
        assertThat(result, lessThan(0));
    }

    @Test
    public void whenComparatorSortByPriorityEqual() {
        Comparator<Job> jobdesc = new JobDescByPriority();
        int result = jobdesc.compare(
                new Job("First", 1),
                new Job("First", 1)
        );
        assertThat(result, equalTo(0));
    }

    @Test
    public void whenComparatorSortByPriorityReverse() {
        Comparator<Job> jobdesc = new JobDescByNameReverse();
        int result = jobdesc.compare(
                new Job("First", 1),
                new Job("Second", 2)
        );
        assertThat(result, greaterThan(0));
    }
}
