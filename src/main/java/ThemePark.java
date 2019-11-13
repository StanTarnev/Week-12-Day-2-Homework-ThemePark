import attractions.Attraction;
import attractions.Dodgems;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {
    private Dodgems dodgems;
    private ArrayList<IReviewed> reviewedsList;

    public ThemePark(){
        this.reviewedsList = new ArrayList<IReviewed>();

//        dodgems = new Dodgems();

        this.reviewedsList.add(dodgems);
    }
    //array list of attracions
    //array of stalls
    //piublic araylis<Irewviewed> getallreviewd()
    //{return with loop

//    public int visit(Visitor visitor, Attraction attraction){
//        attraction.getVisitCount() += 1;
//        visitor.addAttraction(attraction);
//    }
}
