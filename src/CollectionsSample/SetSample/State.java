package CollectionsSample.SetSample;

public class State implements  Comparable<State> {
    private String name;
    private int peopleCount;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(int peopleCount) {
        this.peopleCount = peopleCount;
    }


    @Override
    public int compareTo(State o) {
        return this.name.compareToIgnoreCase(o.getName());
      //return Integer.compare(this.peopleCount,o.getPeopleCount());
    }
}
