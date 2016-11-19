package es.codemotion.stream;

import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class Example
{
    @Test
    public void simple()
    {
        Object[] result = Stream.of(2, 3, 2, 1)
            .filter(n -> n < 3)
            .map(n -> n.toString())
            .distinct()
            .toArray();

        assertThat(result, is(arrayContaining("2", "1")));
    }
}
