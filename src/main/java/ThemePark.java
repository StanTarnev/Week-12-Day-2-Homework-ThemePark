import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Stall> stalls;
    private ArrayList<Attraction> attractions;

    public ThemePark(){
        stalls = new ArrayList<Stall>();
        attractions = new ArrayList<Attraction>();
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.increaseVisitCount();
        visitor.addAttraction(attraction);
    }

    public ArrayList<IReviewed> getReviewed(){
        ArrayList<IReviewed> reviewed = new ArrayList<IReviewed>();
        reviewed.addAll(this.attractions);
        reviewed.addAll(this.stalls);
        return reviewed;
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }
}
