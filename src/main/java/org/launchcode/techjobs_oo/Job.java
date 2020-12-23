package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.


    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {

        final String noData = "Data not available";
        final StringBuilder builder = new StringBuilder();

        if(id > 0 && (name == null || name.length() == 0) && employer == null && location == null && positionType == null && coreCompetency == null){
            return "ID: " + id + "\n"+ "OOPS! This job does not seem to exist";
        }
        if (id == 0) {
            builder.append('\n').append("ID: ").append(noData).append("\n");
        } else {
            builder.append('\n').append("ID: ").append(id).append("\n");
        }

        if (name != null && name.length() > 0) {
            builder.append("Name: ").append(name).append("\n");
        } else {
            builder.append("Name: ").append(noData).append("\n");
        }

        if (employer != null && employer.getValue() != null && employer.getValue().length() > 0) {
            builder.append("Employer: ").append(employer).append("\n");
        } else {
            builder.append("Employer: ").append(noData).append("\n");
        }
        if (location != null&& location.getValue() != null && location.getValue().length() > 0) {
            builder.append("Location: ").append(location).append("\n");
        } else {
            builder.append("Location: ").append(noData).append("\n");
        }

        if (positionType != null && positionType.getValue() != null && positionType.getValue().length() > 0) {
            builder.append("Position Type: ").append(positionType).append("\n");
        } else {
            builder.append("Position Type: ").append(noData).append("\n");
        }

        if (coreCompetency != null && positionType.getValue() != null && positionType.getValue().length() > 0) {
            builder.append("Core Competency: ").append(coreCompetency).append("\n");
        } else {
            builder.append("Core Competency: ").append(noData).append("\n");
        }

        return builder.toString();


    }
}
