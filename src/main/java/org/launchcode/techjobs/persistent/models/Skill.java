package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill extends AbstractEntity {
    @Size(max=250,message="Longer description needed")
    private String description;



    @ManyToMany(mappedBy = "skills")
    @NotNull(message = "Must choose a skill to continue")

    private List<Job> jobs =new ArrayList<>();
    public Skill(){
    }
    public Skill(String description){
        super();
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> job) {
        this.jobs = jobs;
    }
    public void setDescription(String description) {
         this.description = description;
    }
}