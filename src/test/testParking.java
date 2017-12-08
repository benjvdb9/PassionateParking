package test;

import org.junit.Test;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class testParking {
    public testParking() {
    }

    /**
     * Test Constructor method for {@link manageleague.Team#Team(String)}.
     */
    @Test
    public void testTeamConstruct() {
        String name = "Real Madrid FC";
        manageleague.Team team = new Team(name);

        assertThat("Couldn't create team",team.getName(), is(name));
    }
}
