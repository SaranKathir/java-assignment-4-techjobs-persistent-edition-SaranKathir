package org.launchcode.techjobs.persistent.models;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
public class Job extends AbstractEntity{
    @ManyToOne
    private Employer employer;



    @ManyToMany
    @NotNull
    @JoinTable(
            name = "Jobs_Skills",
            joinColumns = { @JoinColumn(name = "job_id") },
            inverseJoinColumns = { @JoinColumn(name = "skill_id") }
    )
    private List<Skill> skills;

    public Job() {
    }

    public Job(Employer employer, List<Skill> someSkills) {
        super();
        this.employer = employer;
        this.skills = someSkills;
    }

    // Getters and setters.

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {

        this.employer = employer;
    }
    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

}
