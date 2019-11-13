import attractions.Attraction;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.Stall;
import stalls.TobaccoStall;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static stalls.ParkingSpot.B1;

public class ThemeParkTest {
    ThemePark themePark;
    private Visitor visitor;
    private Attraction rollerCoaster;
    private Stall tobaccoStall;

    @Before
    public void before(){
        themePark = new ThemePark();
        visitor = new Visitor(16, 180, 65.80);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        tobaccoStall = new TobaccoStall("Fumes", "Jack", B1, 8);
    }

    @Test
    public void canVisitAttraction(){
        themePark.visit(visitor, rollerCoaster);
        assertEquals(1, rollerCoaster.getVisitCount());
        assertEquals(1, visitor.getVisitedAttractions());
    }

    @Test
    public void canGetAllReviewed() {
        themePark.addAttraction(rollerCoaster);
        themePark.addStall(tobaccoStall);
        ArrayList<IReviewed> reviewed = themePark.getReviewed();
        assertEquals(2, reviewed.size());
    }
}
