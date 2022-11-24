package FilterPattern;

import java.util.List;

public class OrCriteria implements Criteria {

    private final Criteria criteria;
    private final Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        var firstCriteriaPersons = criteria.meetCriteria(persons);
        var otherCriteriaPersons = otherCriteria.meetCriteria(persons);

        for (var person : otherCriteriaPersons) {
            if (!firstCriteriaPersons.contains(person))
                firstCriteriaPersons.add(person);
        }

        return firstCriteriaPersons;
    }
}
